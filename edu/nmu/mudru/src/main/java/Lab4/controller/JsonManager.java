package main.java.Lab4.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.Lab3.model.UnivStructureUnit;
import main.java.Lab3.model.University;

import java.io.*;

public class JsonManager {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public String parseUnivToJson(UnivStructureUnit univ){
        return gson.toJson(univ);
    }

    public void writeUnivToFile(UnivStructureUnit univ, String fileName) {
        try {
            File jsonFile = new File(String.format("edu/nmu/mudru/src/main/java/Lab4/data/%s.json", fileName));

            FileWriter fileWriter = new FileWriter(jsonFile);
            fileWriter.write(gson.toJson(univ));
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("Error occurred: " + e);
        }
    }

    public University readUnivFromFile(String fileName){
        try {
            FileReader fileReader = new FileReader(String.format("edu/nmu/mudru/src/main/java/Lab4/data/%s.json", fileName));
            return gson.fromJson(fileReader, University.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
