/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_2;

/**
 *
 * @author burcu
 */
import java.util.Scanner;

public class Project1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int z = 0;
        int m = 0;
        String[] namesSurnames = new String[100];
        int[] number = new int[100];
        int[] numberOfStudents = new int[100];
        String[] gender = new String[100];
        double[] gpa = new double[100];
        System.out.println("Welcome To My Student Information System");
        while (m < 100) {

            System.out.println("There are " + z + " records in my system.");
            System.out.println("Main Menu");
            System.out.println("1) Record a new student");
            System.out.println("2) Search for a record with name and display its info");
            System.out.println("3) Search for a record with number and display its info");
            System.out.println("4) Display all students' information for a given GPA range ");
            System.out.println("5) Display all information for all students");
            System.out.println("6) Quit");
            System.out.println("Choose a number for progress please");
            n = input.nextInt();

            if (n == 1) {

                System.out.println("Enter Details For The New Student Recording");
                System.out.println("Enter name and surname:");
                String namesSurname = input.next();
                String surname = input.next();
                namesSurnames[z] = namesSurname + " " + surname;
                System.out.println("Enter Student NO:");
                int numberOfStudent = input.nextInt();
                number[z] = numberOfStudent;
                System.out.println("Enter Gender:");
                String genderi = input.next();
                gender[z] = genderi;
                System.out.println("Enter GPA:");
                double gpai = input.nextDouble();
                gpa[z] = gpai;

                System.out.println("New Student Record Created Succesfully at position" + "[" + z + "]:");
                System.out.println("Position of student is: [" + z + "]");
                System.out.println("Name Surname: " + namesSurnames[z]);
                System.out.println("The number of student is: " + number[z]);
                System.out.println("Gender: " + gender[z]);
                System.out.println("GPA: " + gpa[z]);
                z++;
            }

            if (n == 2) {
                System.out.println("Write a name and surname to find the info of student");
                String namesSurname = input.next();
                String surname = input.next();
                String search = namesSurname + " " + surname;
                
                System.out.println("The position of student is: [" + searchName(namesSurnames, search) + "]");
                System.out.println("The name of student is: " + namesSurnames[searchName(namesSurnames, search)]);
                System.out.println("The number of student is: " + number[searchName(namesSurnames, search)]);
                System.out.println("The gender of student is:" + gender[searchName(namesSurnames, search)]);
                System.out.println("The GPA of student is:" + gpa[searchName(namesSurnames, search)]);
                
            }

            if (n == 3) {
                System.out.println("Write number of student to find his/her info");
                int numberOfStudent = input.nextInt();
                if(numberToStu(number, numberOfStudent)== -1){
                System.out.println("Student not found!!!");}
                else{
                System.out.println("Position of student is: [" + numberToStu(number, numberOfStudent) + "]");
                System.out.println("Name Surname: " + namesSurnames[numberToStu(number, numberOfStudent)]);
                System.out.println("NO: " + number[(numberToStu(number, numberOfStudent))]);
                System.out.println("Gender: " + gender[numberToStu(number, numberOfStudent)]);
                System.out.println("GPA: " + gpa[numberToStu(number, numberOfStudent)]);
            }}

            if (n == 4) {
                System.out.println("Enter lowest GPA  limit");
                double lowest = input.nextDouble();
                System.out.println("Enter highest limit");
                double highest = input.nextDouble();
                for (int i = 0; i < gpa.length; i++) {
                    
                        if (lowest <= gpa[i] && highest >= gpa[i]) {
                        System.out.println("Position of student is: [" + i + "]");
                        System.out.println("Name Suranme: " + namesSurnames[i]);
                        System.out.println("NO: " + number[i]);
                        System.out.println("Gender: " + gender[i]);
                        System.out.println("GPA: " + gpa[i]);}
                        }
                    }

            if (n == 5) {
                for (int i = 0; i < numberOfStudents.length; i++) {
                    System.out.println("The position is [ " + i + " ]");
                    System.out.println("Name Surname: " + namesSurnames[i]);
                    System.out.println("NO: " + number[i]);
                    System.out.println("Gender: " + gender[i]);
                    System.out.println("GPA: " + gpa[i]);
                }
            }

            if (n == 6) {
                System.out.println("You quitted.");
                return;
            }

            m++;
        }
    }

    public static int searchName(String[] namesSurnames, String search) {

        for (int j = 0; j < namesSurnames.length; j++) {
            if (namesSurnames[j].equals(search)) {
                return j;
            }
        }
        return -1;
    }

    public static int numberToStu(int[] number, int numberOfStudent) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == numberOfStudent) {
                return i;
            }
        }
        return -1;
    }

}
