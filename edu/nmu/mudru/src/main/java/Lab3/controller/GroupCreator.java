package main.java.Lab3.controller;

import main.java.Lab3.model.Group;
import main.java.Lab3.model.Student;
import main.java.Lab3.model.UnivStructureUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupCreator implements StructureBuildable<Student> {
    @Override
    public Group createStructureRandomly() {
        Group group = new Group();
        Random random = new Random();
        group.setTitle("Group#"+random.nextInt(10));
        HumanCreator hc = new HumanCreator();
        group.setHeadmaster(hc.createRandomHuman());
        group.setSubstructures(createRandomChildren(group));
        return group;
    }

    @Override
    public List<Student> createRandomChildren(UnivStructureUnit parentElem) {
        Random random = new Random();
        int countOfChildren = random.nextInt(3)+2;
        List<Student> children = new ArrayList<Student>(countOfChildren);
        StudentCreator sc = new StudentCreator();
        for (int i = 0; i < countOfChildren; i++){
            children.add(sc.createRandomStudent());
            children.get(i).setGroup(parentElem);
        }
        return children;
    }

}
