package main.java.Lab3.model;

public class Student extends Human{

    transient UnivStructureUnit group;

    public Student(String firstName, String lastName, String patronymic, Sex sex){
        super(firstName, lastName, patronymic, sex);
    }

    public Student(Human human){
        this.setFirstName(human.getFirstName());
        this.setLastName(human.getLastName());
        this.setPatronymic(human.getPatronymic());
        this.setSex(human.getSex());
    }

    public UnivStructureUnit getGroup() {
        return group;
    }

    public void setGroup(UnivStructureUnit group) {
        this.group = group;
    }

}
