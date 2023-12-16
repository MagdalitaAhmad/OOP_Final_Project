/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_final_project;

/**
 *
 * @author Abdullah
 */
import java.util.Scanner;
public class OOP_Final_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here

        menu1();
        
        
    }   
    public void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void menu1(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        /*
        attributesDeclaration attdeclaration = new attributesDeclaration();
        loops loop = new loops();
        instanciation instantiate = new instanciation();
        inheritance inherit = new inheritance();
        encapsulation encap = new encapsulation();
        interfacePolymorphism interfacepolymorphism = new interfacePolymorphism();
        
        methodOverloading methodOverload = new methodOverloading();
        methodOverriding methodOverride = new methodOverriding();
        constructor Constructor = new constructor();
        overloadingConstructor overloadingconstructor = new overloadingConstructor();
        overridingPolymorphism overridingpolymorphism = new overridingPolymorphism();*/
        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println( "* * * * * * * * * * * * Menu * * * * * * * * * * * *" );
            System.out.println("1. Attributes Declaration" +"     " +"7. Method Overloading");
            System.out.println("2. Loops"                  +"                      " + "8. Methods Overriding");
            System.out.println("3. Instancitaion"          +"              " +  "9. Constructor");
            System.out.println("4. Inheritance"            +"                " +  "10. Overloading Constructor");
            System.out.println("5. Encapsulation"          +"              " +  "11. Overriding Polymorphism");
            System.out.println("6. Interface Polymorphism" +"     " +  "12. Exit\n");


            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println(" ");

            switch (choice) {
                case 1:
                    //attdeclaration.display();
                    break;
                case 2:
                    //loop.display();
                    System.out.println(" ");
                    break;
                case 3:
                   //instantiate.display();
                    break;
                case 4:
                    //inherit.display();
                    System.out.println(" ");
                    break;
                case 5:
                    //encap.display();
                    System.out.println(" ");
                    break;
                case 6:
                    //interfacepolymorphism.display();
                    System.out.println(" ");
                    break;
                case 7:
                    //methodOverload.display();
                    System.out.println(" ");
                    break;
                case 8:
                    //methodOverride.display();
                    System.out.println(" ");
                    break;
                case 9:
                    //Constructor.display();
                    System.out.println(" ");
                    break;    
                case 10:
                    //overloadingconstructor.display();
                    System.out.println(" ");
                    break;    
                case 11:
                    //overridingpolymorphism.display();
                    System.out.println(" ");
                    break;                
                case 12:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            break;
        }       
    
    }
    
}
