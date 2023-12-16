/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final_project;

/**
 *
 * @author Abdullah
 */
import java.util.Scanner;
interface Display{
        void display();
}
public class attributesDeclaration implements Display {
    String GREEN = "\u001B[32m";
    MainMenu mainmenu = new MainMenu();
    public void display(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println( GREEN +" **********Attributes Decalration Practical Example**********\n");
        System.out.println( GREEN +"public class Person {\n" + GREEN+
"    // Attributes\n" + GREEN +
"    String name;\n" +  GREEN +
"    int age;\n" + GREEN +
"    String address;\n" + GREEN +
"\n" + GREEN +
"    // Constructor\n" + GREEN +
"    public Person(String name, int age, String address) {\n" + GREEN +
"        this.name = name;\n" + GREEN +
"        this.age = age;\n" + GREEN +
"        this.address = address;\n" + GREEN +
"    }\n" + GREEN +
"\n" + GREEN +
"    // Main method for testing\n" + GREEN +
"    public static void main(String[] args) {\n" + GREEN +
"        // Creating a Person object and initializing attributes\n" + GREEN +
"        Person person1 = new Person(\"John Doe\", 25, \"123 Main St\");\n" + GREEN +
"\n" + GREEN +
"        // Accessing attribute values directly (without getters)\n" + GREEN +
"        System.out.println(\"Name: \" + person1.name);\n" + GREEN +
"        System.out.println(\"Age: \" + person1.age);\n" + GREEN +
"        System.out.println(\"Address: \" + person1.address);\n" + GREEN +
"    }\n" + GREEN +
"}");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
            System.out.println("|Choose an option:                                                    |");
            System.out.println("|1. Back to Menu                                                      |");
            System.out.println("|2. Exit                                                              |");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("   Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    mainmenu.menu1();
                    mainmenu.clearScreen();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
