package main.java.Lab3.controller;

import main.java.Lab3.model.Department;
import main.java.Lab3.model.Group;
import main.java.Lab3.model.UnivStructureUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DepartmentCreator implements StructureBuildable{
    @Override
    public Department createStructureRandomly() {
        Department department = new Department();
        Random random = new Random();
        department.setTitle("department#"+random.nextInt(10));
        HumanCreator hc = new HumanCreator();
        department.setHeadmaster(hc.createRandomHuman());
        department.setSubstructures(createRandomChildren(department));
        return department;
    }

    @Override
    public List<Group> createRandomChildren(UnivStructureUnit parentElem) {
        Random random = new Random();
        int countOfChildren = random.nextInt(3)+2;
        List<Group> children = new ArrayList<Group>(countOfChildren);
        GroupCreator gc = new GroupCreator();
        for (int i = 0; i < countOfChildren; i++){
            children.add(gc.createStructureRandomly());
            children.get(i).setSuperstructure(parentElem);
        }
        return children;
    }
}
