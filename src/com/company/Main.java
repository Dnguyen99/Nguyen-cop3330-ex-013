package com.company;
import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int numOfYears = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double A = principal * Math.pow(1 + ((rate * 0.01) / n), n * numOfYears);
        System.out.print("$" +principal+ " invested at " +rate+ "% for " +numOfYears+ " years compounded " +n+ " times per year " + "$" +String.format("%.2f", A));
    }
}
