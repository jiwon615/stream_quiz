package com.practice.stream;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVUtil {

    public static List<String[]> readCsvLines() throws IOException, CsvException {
        CSVReader csvReader = new CSVReader(new FileReader(CSVUtil.class.getResource("/user.csv").getFile()));
        csvReader.readNext();
        return csvReader.readAll();
    }

}
