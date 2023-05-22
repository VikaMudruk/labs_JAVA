package main.java.Lab3.controller;

import main.java.Lab3.model.UnivStructureUnit;

import java.util.List;

public interface StructureBuildable<T> {

    public UnivStructureUnit createStructureRandomly();

    public List<T> createRandomChildren(UnivStructureUnit parentElem);

}
