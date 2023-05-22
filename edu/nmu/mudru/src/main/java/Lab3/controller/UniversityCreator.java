package main.java.Lab3.controller;

import main.java.Lab3.model.Faculty;
import main.java.Lab3.model.UnivStructureUnit;
import main.java.Lab3.model.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityCreator implements StructureBuildable{

    @Override
    public University createStructureRandomly() {
        University university = new University();
        university.setTitle("NTU-DP");
        HumanCreator hc = new HumanCreator();
        university.setHeadmaster(hc.createRandomHuman());
        university.setSubstructures(createRandomChildren(university));
        return university;
    }

    @Override
    public List<Faculty> createRandomChildren(UnivStructureUnit parentElem) {
        Random random = new Random();
        int countOfChildren = random.nextInt(3)+2;
        List<Faculty> children = new ArrayList<Faculty>(countOfChildren);
        FacultyCreator fc = new FacultyCreator();
        for (int i = 0; i < countOfChildren; i++){
            children.add(fc.createStructureRandomly());
            children.get(i).setSuperstructure(parentElem);
        }
        return children;
    }

}
