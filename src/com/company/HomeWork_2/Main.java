package com.company.HomeWork_2;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<City> cities = new HashSet<>();
        cities.add(new City(605, "Aberdeen"));
        cities.add(new City(208, "Idaho Falls"));
        cities.add(new City(580, "Alva"));
        cities.add(new City(318, "Alexandria"));
        cities.add(new City(503, "Astoria"));
        cities.add(new City(410, "Baltimore"));
        cities.add(new City(202, "Washington"));
        cities.add(new City(941, "Venice"));
        cities.add(new City(919, "Durham"));
        cities.add(new City(254, "Cameron"));

        printCities(cities);
        System.out.println("####################");
        Set<City> cities1 = evenNumbersOfCities(cities);
        printCities(cities1);
    }

    private static void printCities(Set<City> cities) {
        for (City city : cities) {
            System.out.println("city " + city);
        }
    }

    private static Set<City> evenNumbersOfCities(Set<City> city) {
        Set<City> cities = new TreeSet<>();
        for (City city1 : city) {
            if (city1.getCode() % 2 == 0) {
                cities.add(city1);
            }
        }
        return cities;
    }
}