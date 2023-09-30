package com.practice.stream.Quiz1;

import com.opencsv.exceptions.CsvException;
import com.practice.stream.CSVUtil;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Quiz1 {

    // 1.1 각 취미를 선호하는 인원이 몇 명인지 계산하여라.
    public Map<String, Long> quiz1() throws IOException, CsvException {
        List<String[]> csvLines = CSVUtil.readCsvLines();
        Map<String, Long> result = csvLines.stream()
                .map(line -> line[1].replaceAll("\\s", "")) // String[] -> String
                .flatMap(i -> Arrays.stream(i.split(":"))) // : 기준으로 모두 split
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        return result;
    }

    // 1.2 정씨 성을 갖는 인원들이 갖는 각 취미 별 수를 계산하여라.
    public Map<String, Long> quiz2() throws IOException, CsvException {
        List<String[]> csvLines = CSVUtil.readCsvLines();
        Map<String, Long> result = csvLines.stream()
                .filter(line -> line[0].startsWith("정"))
                .map(line -> line[1].replaceAll("\\s", ""))
                .flatMap(i -> Arrays.stream(i.split(":")))
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        return result;
    }

    // 1.3 소개 내용에 '좋아'가 몇번 등장하는지 계산하여라.
    public int quiz3() throws IOException, CsvException {
        List<String[]> csvLines = CSVUtil.readCsvLines();
        int count = 0;
        Integer result = csvLines.stream()
                .map(line -> line[2].replaceAll("\\s", ""))
                .map(i -> getCount(i, 0))
                .reduce(0, Integer::sum);
        return result;
    }

    private int getCount(String line, int fromIndex) {
        int idx = line.indexOf("좋아", fromIndex); // 못 찾으면 -1 반환

        if (idx >= 0) {
            return 1 + getCount(line, idx + "좋아".length());
        }

        return 0;
    }


}
