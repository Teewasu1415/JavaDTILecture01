package TH.AC.SAU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args)  throws IOException {

        String fullname;
        int age;
        double gpa;

        Scanner wow = new Scanner(System.in);

        showline();
        System.out.print("Name-surname : ");
        fullname = wow.next();
        System.out.print("age : ");
        age = wow.nextInt();
        System.out.print("GPA : ");
        gpa = wow.nextDouble();
        showline();
    }
        public static void showline() {
            System.out.println("----------------------");
        }
    }