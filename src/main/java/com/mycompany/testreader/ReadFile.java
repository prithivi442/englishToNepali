/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testreader;

import com.google.gson.Gson;
import com.monitorjbl.xlsx.StreamingReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Prithivi Raj Pandey
 */
public class ReadFile {

    public static void main(String[] args) throws InterruptedException {
        EnglishConvertor ec = new EnglishConvertor();
         System.out.println(ec.EnglishConvertor("18-04-2019"));
        
        
        
        
        
//        InputStream is = null;
//        try {
//            is = new FileInputStream(new File("D:\\importtt.xlsx"));
//            Workbook workbook = StreamingReader.builder()
//                    .rowCacheSize(100) // number of rows to keep in memory (defaults to 10)
//                    .bufferSize(4096) // buffer size to use when reading InputStream to file (defaults to 1024)
//                    .open(is);
//
//            for (Sheet sheet : workbook) {
//                // System.out.println(sheet.getSheetName());
//                for (Row r : sheet) {
////                    for (int i = 0; i < 12; i++) {
////                        System.out.println(r.getCell(i).getStringCellValue());
////                    }
//                    try{
//                    System.out.println(r.getCell(0).getStringCellValue());
//                    System.out.println(r.getCell(1).getStringCellValue());
//                    System.out.println(r.getCell(2).getStringCellValue());
//                    System.out.println(r.getCell(3).getStringCellValue());
//                    System.out.println(r.getCell(4).getStringCellValue());
//                    System.out.println(r.getCell(5).getStringCellValue());
//                    System.out.println(r.getCell(6).getStringCellValue());
//                    System.out.println(r.getCell(7).getStringCellValue());
//                    System.out.println(r.getCell(8).getStringCellValue());
//                    System.out.println(r.getCell(9).getStringCellValue());
//                    System.out.println(r.getCell(10).getStringCellValue());
//                    System.out.println(r.getCell(11).getStringCellValue());}
//                    catch(NullPointerException nu){
//                        System.out.println(nu.getLocalizedMessage());
//                    }
////                    for (Cell c : r) {
////                        System.out.println(c.getStringCellValue());
////                        
////                    }
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                is.close();
//            } catch (IOException ex) {
//                Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
    
   

}
