package com.practice.stream;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVUtil {

    public static List<String[]> readCsvLines() throws IOException, CsvException {
        String fileName = CSVUtil.class.getResource("/user.csv").getFile();
        CSVReader csvReader = new CSVReader(new FileReader(fileName));
        csvReader.readNext();
        return csvReader.readAll();
    }

}
