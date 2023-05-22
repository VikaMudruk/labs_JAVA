package main.java.Lab4;

import main.java.Lab3.controller.UniversityCreator;
import main.java.Lab3.model.*;
import main.java.Lab4.controller.JsonManager;

public class Run {

    public static void main(String[] args) {
        System.out.println("Generating Old University");
        UniversityCreator uc = new UniversityCreator();
        University oldUniversity = uc.createStructureRandomly();

        JsonManager jsonManager = new JsonManager();
        jsonManager.writeUnivToFile(oldUniversity, "JsonUniversity");

        System.out.println("Retrieving Old University from JSON as 'New University'");
        University newUniversity = jsonManager.readUnivFromFile("JsonUniversity");
        System.out.println("Old University == New University: " + newUniversity.equals(oldUniversity));

        System.out.println("\nGenerating another Random University");
        University randomUniv = uc.createStructureRandomly();
        System.out.println("New University == Random new University: " + newUniversity.equals(randomUniv));

    }

}
