package com.company.HomeWork_1;
import java.time.LocalDate;

public class DataCenter {

    private LocalDate releaseDate;
    private String model;
    private int price;
    private String color;

    public DataCenter() {
    }

    public DataCenter(LocalDate releaseDate, String model, int price, String color) {
        this.releaseDate = releaseDate;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "releaseDate= " + releaseDate + '\n' +
                "model= " + model + '\n' +
                "price= " + price + "$" + '\n' +
                "color= " + color + '\n';
    }
}