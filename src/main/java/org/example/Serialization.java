package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Serialization {
    private ArrayList<Student> attendence;

    Serialization(ArrayList<Student> attendence) {
        this.attendence = attendence;
    }

   public void convertToJson() {
       try (FileOutputStream os = new FileOutputStream("output.json");
            Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
           GsonBuilder gsonBuilder = new GsonBuilder();
           Gson gson = gsonBuilder.create();
           writer.write(gson.toJson(attendence));
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
