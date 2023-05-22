package main.java.Lab3.model;

import java.util.List;
import java.util.Objects;

public class UnivStructureUnit<T> {

    private String title;
    private Human headmaster;
    private List<T> substructures;
    private transient UnivStructureUnit superstructure;

    // Constructors
    public UnivStructureUnit(String title, Human headmaster){
        this.title = title;
        this.headmaster = headmaster;
    }
    public UnivStructureUnit(String title, Human headmaster, UnivStructureUnit superstructure){
        this.title = title;
        this.headmaster = headmaster;
        this.superstructure = superstructure;
    }

    public UnivStructureUnit(){}

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Human getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(Human headmaster) {
        this.headmaster = headmaster;
    }

    public List<T> getSubstructures() {
        return substructures;
    }

    public void setSubstructures(List<T> substructures) {
        this.substructures = substructures;
    }

    public UnivStructureUnit getSuperstructure() {
        return superstructure;
    }

    public void setSuperstructure(UnivStructureUnit superstructure) {
        this.superstructure = superstructure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnivStructureUnit<?> that = (UnivStructureUnit<?>) o;
        return Objects.equals(title, that.title) && Objects.equals(headmaster, that.headmaster) /*&& Objects.equals(substructures, that.substructures)*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, headmaster);
    }
}
