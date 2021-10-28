package com.paulo2308.MAD;

import java.util.List;
import java.util.Calendar;

public class WeekFilter {

    IReadFile iReadFile;
    Calendar calendar = Calendar.getInstance();

    public WeekFilter(IReadFile iReadFile){
        this.iReadFile = iReadFile;
    }

    public void lastSevenDays(String addressFolder){
        try{

            List<String> lines = iReadFile.readCsv(addressFolder + "despesas-itapevi-2021.csv");

            for(String l : lines){
                System.out.println(l);
            }
        }catch (Exception e){
            System.out.println("Arquivo não encontrado \n" + e.getMessage());
        }
    }
}
