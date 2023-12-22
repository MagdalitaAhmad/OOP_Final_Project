package oop_final_project;

import java.util.Scanner;

interface Display {
    void display();
}

public class loop implements Display {
    String GREEN = "\u001B[32m";
    MainMenu mainmenu = new MainMenu();

    public void display() {
    System.out.println("\033[H\033[2J");
    System.out.flush();

    // Print the loop example code
    System.out.println(GREEN + " **********Loop Example**********\n");
    System.out.println("package oop_final_project;\n");
    System.out.println("import java.util.Scanner;\n");
    System.out.println("public class Loop {\n" +
            "    public static void main(String[] args) {\n" +
            "        Scanner scanner = new Scanner(System.in);\n\n" +

            "        // Example of a for loop\n" +
            "        System.out.println(\"Example of a for loop:\");\n" +
            "        for (int i = 1; i <= 5; i++) {\n" +
            "            System.out.println(\"Iteration \" + i);\n" +
            "        }\n\n" +

            "        // Example of a while loop\n" +
            "        System.out.println(\"\\nExample of a while loop:\");\n" +
            "        int count = 1;\n" +
            "        while (count <= 7) {\n" +
            "            System.out.println(\"Iteration \" + count);\n" +
            "            if (count == 7) {\n" +
            "                System.out.println(\"count <= 7, stopping while loop now!\");\n" +
            "            }\n" +
            "            count++;\n" +
            "        }\n\n" +

            "        // Example of a do-while loop\n" +
            "        System.out.println(\"\\nExample of a do-while loop:\");\n" +
            "        int number;\n" +
            "        do {\n" +
            "            System.out.print(\"Enter a positive number (0 to exit): \");\n" +
            "            number = scanner.nextInt();\n" +
            "            System.out.println(\"You entered: \" + number);\n" +
            "        } while (number != 0);\n\n" +

            "        scanner.close();\n" +
            "    }\n" +
            "}\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
            System.out.println("|Choose an option:                                                    |");
            System.out.println("|1. Run Code                                                          |");
            System.out.println("|2. Back to Menu                                                      |");
            System.out.println("|3. Exit                                                              |");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("   Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    runCode();
                    break;
                case 2:
                    mainmenu.menu1();
                    mainmenu.clearScreen();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void runCode() {
        Scanner scanner = new Scanner(System.in);

        // Example of a for loop
        System.out.println("Example of a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example of a while loop
        System.out.println("\nExample of a while loop:");
        int count = 1;
        while (count <= 7) {
            System.out.println("Iteration " + count);
            
            if (count == 7) {
                System.out.println("count <= 7, stopping while loop now!");
            }
            count++;
        }

        // Example of a do-while loop
        System.out.println("\nExample of a do-while loop:");
        int number;
        do {
            System.out.print("Enter a positive number (0 to exit): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while (number != 0);

        scanner.close();

    }
}
