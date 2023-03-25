package edu.nmu.victoriia.lab2;

import java.util.Random;
import java.util.Scanner;

public class Main_lab2 {

    static final int RANDOM_INT_MIN = -100; //-100
    static final int RANDOM_INT_MAX = 1000; //1000

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int matrix[][] = null;
        char command;
        // Infinite cycle until user enters acceptable sizes
        while (true) {
            System.out.print("Enter the number of matrix rows: ");
            int matrixRows = scanner.nextInt();
            if (matrixRows > 20) {
                System.out.println("Size should be less or equal to 20, start again");
                continue;
            }
            System.out.print("Enter the number of matrix cols: ");
            int matrixCols = scanner.nextInt();
            if (matrixCols > 20) {
                System.out.println("Size should be less or equal to 20, start again");
                continue;
            }

            System.out.print("Enter values from keyboard or generate random values? [k|r]");
            command = scanner.next().charAt(0);
            switch (command) {
                case 'k':
                    matrix = fillMatrixFromKeyboard(matrixRows, matrixCols);
                    break;
                case 'r':
                    matrix = fillMatrixWithRandomValues(matrixRows, matrixCols);
                    break;
                default:
                    System.out.println("Wrong command, please start again!");
                    continue;
            }
            break; // Exit the infinite loop
        }

        // Operate on matrix section
        while (true){
            System.out.println("Enter the command:\n1. View the matrix\n2. Find minimum value\n3. Find maximum value\n" +
                    "4. Find average value\n5. Find geometrical average value");
            command = scanner.next().charAt(0);
            switch (command){
                case '1':
                    viewMatrix(matrix);
                    break;
                case '2':
                    findMinimumMatrixValue(matrix);
                    break;
                case '3':
                    findMaximumMatrixValue(matrix);
                    break;
                case '4':
                    findAverageMatrixValue(matrix);
                    break;
                case '5':
                    findGeometricAverageMatrixValue(matrix);
                    break;
            }
        }
    }

    static int[][] fillMatrixFromKeyboard(int rows, int cols) {
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter " + rows * cols + " numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static int[][] fillMatrixWithRandomValues(int rows, int cols){
        int matrix[][] = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Calculating the random value
                matrix[i][j] = random.nextInt(RANDOM_INT_MAX+1-RANDOM_INT_MIN) + RANDOM_INT_MIN;
            }
        }
        System.out.println("The generated matrix:");
        viewMatrix(matrix);
        return matrix;
    }

    static void viewMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    static void findMinimumMatrixValue(int[][] matrix){
        int minValue = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < minValue){
                    minValue = matrix[i][j];
                }
            }
        }
        System.out.println("The minimum value in matrix is: " + minValue);
    }

    static void findMaximumMatrixValue(int[][] matrix){
        int maxValue = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }
        System.out.println("The maximum value in matrix is: " + maxValue);
    }

    static void findAverageMatrixValue(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        // Calculate the average in println arguments section
        System.out.println("The average value in matrix is: " + (float)sum/(matrix.length*matrix[0].length));
    }

    static void findGeometricAverageMatrixValue(int[][] matrix){
        long product = 1;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                product *= matrix[i][j];
            }
        }
        if (product < 0){
            System.out.println("It is impossible to calculate geometric average with negative product");
            System.out.println("Product = " + product);
            return;
        }
        double geometricAverage = Math.pow(product, 1d/(matrix.length*matrix[0].length));
        System.out.println("The geometric average value in matrix is: " + geometricAverage);
    }
}
