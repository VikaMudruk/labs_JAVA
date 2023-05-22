package main.java.Lab3.controller;

import main.java.Lab3.model.Department;
import main.java.Lab3.model.Faculty;
import main.java.Lab3.model.UnivStructureUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FacultyCreator implements StructureBuildable{
    @Override
    public Faculty createStructureRandomly() {
        Faculty faculty = new Faculty();
        Random random = new Random();
        faculty.setTitle("faculty#"+random.nextInt(10));
        HumanCreator hc = new HumanCreator();
        faculty.setHeadmaster(hc.createRandomHuman());
        faculty.setSubstructures(createRandomChildren(faculty));
        return faculty;
    }

    @Override
    public List<Department> createRandomChildren(UnivStructureUnit parentElem) {
        Random random = new Random();
        int countOfChildren = random.nextInt(3)+2;
        List<Department> children = new ArrayList<Department>(countOfChildren);
        DepartmentCreator dc = new DepartmentCreator();
        for (int i = 0; i < countOfChildren; i++){
            children.add(dc.createStructureRandomly());
            children.get(i).setSuperstructure(parentElem);
        }
        return children;
    }

}
