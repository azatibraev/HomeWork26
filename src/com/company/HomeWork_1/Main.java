package com.company.HomeWork_1;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Car, DataCenter> carInfo = new HashMap<>();
        carInfo.put(new Car((short) 00011, "01 KG 001"),

                new DataCenter(LocalDate.ofYearDay(2000, 5),
                        "Jaguar F-Type",150000, "Black"));

        carInfo.put(new Car((short) 00012, "01 KG 002"),
                new DataCenter(LocalDate.ofYearDay(2002, 6),

                        "Rolls-Royce Phantom",1500000, "White"));

        carInfo.put(new Car((short) 00013, "01 KG 004"),
                new DataCenter(LocalDate.ofYearDay(2004, 12),

                        "Aston Martin DB11",250000, "Red"));

        carInfo.put(new Car((short) 00014, "01 KG 011"),

                new DataCenter(LocalDate.ofYearDay(2006, 13),
                        "Maserati Ghibli",450000, "Blue"));

        carInfo.put(new Car((short) 00015, "01 KG 099"),

                new DataCenter(LocalDate.ofYearDay(2008, 25),
                        "Romeo Giulia ",500000, "Silver"));

        for(Map.Entry<Car, DataCenter> entry : carInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}