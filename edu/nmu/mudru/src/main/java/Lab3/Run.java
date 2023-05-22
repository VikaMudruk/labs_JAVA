package main.java.Lab3;

import main.java.Lab3.controller.*;
import main.java.Lab3.model.*;

public class Run {

    public static void main(String[] args) {
        StructureBuildable uc = new UniversityCreator();
        UnivStructureUnit<Faculty> u = uc.createStructureRandomly();
        Run.printUniversityTree(u);
    }

    public static void printUniversityTree(UnivStructureUnit<Faculty> u){
        System.out.println("University Title: "+u.getTitle()+" Headmaster: "+u.getHeadmaster().toString());
        u.getSubstructures().forEach((Faculty s) -> {
            System.out.println("\tFaculty Title: "+s.getTitle()+" Headmaster: "+s.getHeadmaster().toString());
            s.getSubstructures().forEach((Department d) -> {
                System.out.println("\t\tDepartment Title: "+d.getTitle()+" Headmaster: "+d.getHeadmaster().toString());
                d.getSubstructures().forEach((Group g) ->{
                    System.out.println("\t\t\tGroup Title: "+g.getTitle()+" Headmaster: "+g.getHeadmaster().toString());
                    g.getSubstructures().forEach((Student st) ->{
                        System.out.println("\t\t\t\t" + st.toString());
                    });
                });
            });
        });
    }
}
