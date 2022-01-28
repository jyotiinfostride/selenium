package com.Swag;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDr {
    public static void main(String[] args) throws IOException {
        String path= System.getProperty("user.dir")+"\\TestData\\Test_Data.xlsx";
        System.out.println(path);
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        System.out.println(sheet.getLastRowNum());
        for(int i=1; i<=sheet.getLastRowNum(); i++) {
            String user = sheet.getRow(i).getCell(0).getStringCellValue();
            String pass = sheet.getRow(i).getCell(1).getStringCellValue();
            System.out.println(user+"\t"+pass);
        }
    }
}
