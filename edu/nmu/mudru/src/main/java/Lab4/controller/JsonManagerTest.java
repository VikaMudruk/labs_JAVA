package main.java.Lab4.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.Lab3.controller.UniversityCreator;
import main.java.Lab3.model.University;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.*;

class JsonManagerTest {

    private Gson gson;
    private University oldUniversity;
    private File jsonFile;

    @BeforeEach
    public void init(){
        UniversityCreator universityCreator = new UniversityCreator();
        oldUniversity = universityCreator.createStructureRandomly();
        gson = new GsonBuilder().setPrettyPrinting().create();

        jsonFile = new File("edu/nmu/mudru/src/main/java/Lab4/data/UnitTestJson.json");
        try {
            FileWriter fileWriter = new FileWriter(jsonFile);
            fileWriter.write(gson.toJson(oldUniversity));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.fail("File write Error");
        }
    }

    @org.junit.jupiter.api.Test
    void writeUnivToFile() {
        Assertions.assertTrue(jsonFile.exists());
    }

    @org.junit.jupiter.api.Test
    void readUnivFromFile() {
        try {
            FileReader fileReader = new FileReader("edu/nmu/mudru/src/main/java/Lab4/data/UnitTestJson.json");
            University newUniversity = gson.fromJson(fileReader, University.class);
            Assertions.assertEquals(oldUniversity, newUniversity);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Assertions.fail("File read Error");
        }
    }
}