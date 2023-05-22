package main.java.Lab5.view;

import main.java.Lab5.model.DBStudent;

import java.util.List;

public class TableViewer {

    public void printStudentsTable(List<DBStudent> list){
        System.out.println(String.format("%3s %15s %20s %20s %12s %10s", "ID", "FIRST_NAME", "LAST_NAME", "PATRONYMIC",
                "BIRTH_DATE", "STUD_BOOK_NO"));
        list.forEach(e -> System.out.println(e.toString()));
    }

}
