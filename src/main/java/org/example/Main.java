package org.example;

public class Main {
    public static void main(String[] args) {
        Deserialization ds = new Deserialization();
        DataProcessor dp = new DataProcessor(ds.readFile("start.csv"));
        Serialization sr = new Serialization(dp.updateData());
        sr.convertToJson();
    }

}
