package org.example;

import java.util.Scanner;

public class CalculationRequestReader {
    public CalculationRequest read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator (e.g 1 + 2): ");
        String result = sc.nextLine();
        return new CalculationRequest(result.split(" "));
    }
}
