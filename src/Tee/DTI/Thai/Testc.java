package Tee.DTI.Thai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testc {
    public static void main(String[] args)  throws IOException {

        String fullname;
        int age;
        double gpa;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        showline();
        System.out.print("Name-surname : ");
        fullname = reader.readLine();
        System.out.print("age : ");
        age = Integer.parseInt( reader.readLine() );
        System.out.print("GPA : ");
        gpa = Double.parseDouble( reader.readLine());
        showline();
        System.out.println("Hello" + fullname);
        System.out.println("Age " + age);
        System.out.println("GPA :" + gpa);


    }

    public static void showline() {
        System.out.println("----------------------");

    }
}
