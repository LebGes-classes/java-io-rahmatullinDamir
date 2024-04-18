package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Deserialization {
    String sub;
    ArrayList<String> inputData = new ArrayList<>();

    public ArrayList<String> readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(
                path))) {
            reader.lines()
                    .skip(1)
                    .forEach(sub -> inputData.add(sub));
//            int cnt = 0;
//            while ((sub = reader.readLine()) != null) {
//                if (cnt == 0){
//                    cnt++;
//                    continue;
//                }
//                inputData.add(sub);
//            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return inputData;
    }
}
