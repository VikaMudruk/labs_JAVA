package main.java.Lab5;

import main.java.Lab5.controller.DBManager;
import main.java.Lab5.model.DBStudent;
import main.java.Lab5.view.TableViewer;

import java.util.List;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        List<DBStudent> list;
        DBManager dbManager = new DBManager();
        TableViewer tableViewer = new TableViewer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month of birth [mm]");
        int month = scanner.nextInt();
        list = dbManager.makeDBRequest("Select * from student where MONTH(birth_date) = "+month);

        tableViewer.printStudentsTable(list);

    }

}
