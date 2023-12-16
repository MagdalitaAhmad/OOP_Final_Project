import java.util.Scanner;

class FinalTermActivities {
    // Attributes Declaration
    private int attributeExample;

    // Method Overloading
    void display(String message) {
        System.out.println(message);
    }

    void display(int number) {
        System.out.println("Number: " + number);
    }

    // Loops
    void loopExample() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" LOOPS")
    }

    // Method of Overriding
    void overriddenMethod() {
        System.out.println("Method of Overloading\n");
        System.out.println("In Java, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, the same parameters or signature, and the same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.");
    }

    // Instantiation
    void instantiationExample() {
        FinalTermActivities obj = new FinalTermActivities();
        obj.display(" INSTANTIATION \n Instantiate in Java means to call a constructor of a Class which creates an an instance or object, of the type of that Class. Instantiation allocates the initial memory for the object and returns a reference. An instance is required by nonstatic methods as they may operate on the nonstatic fields created by the constructor.");
    }

    // Constructor
    FinalTermActivities() {
        System.out.println(" CONSTRUCTOR\n A constructor in Java Programming is a block of code that initializes (constructs) the state and value during object creation. It is called every time an object with the help of a new () keyword is created. Even if you haven't specified any constructor in the code, the Java compiler calls a default constructor");
    }

    // Inheritance
    void inheritedMethod() {
        System.out.println("INHERITANCE \nJava, Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well. ");
    }

    // Overloading Constructor
    FinalTermActivities(int value) {
        System.out.println("nOverloaded constructor with value: " + value);
        System.out.println("OVERLOADING CONSTRUCTOR \nConstructor overloading in Java refers to the use of more than one constructor in an instance class. However, each overloaded constructor must have different signatures. For the compilation to be successful, each constructor must contain a different list of arguments");
        
    }

    // Encapsulation
    private int encapsulatedValue;

    int getEncapsulatedValue() {
        return encapsulatedValue;
    }

    void setEncapsulatedValue(int value) {
        encapsulatedValue = value;
    }

    // Overriding Polymorphism
    void polymorphismExample(FinalTermActivities obj) {
        System.out.println("Overriding Polymorphism Example");
        obj.overriddenMethod();
    }

    // Interface Polymorphism
    interface MyInterface {
        void interfaceMethod();
    }

    class InterfaceImplementation implements MyInterface {
        @Override
        public void interfaceMethod() {
            System.out.println(" POLYMORPHISM \n Polymorphism is that it has many forms that mean one specific defined form is used in many different ways ");
        }
    }

    // Main Menu
    void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------ OOP JAVA ACTIVITIES ------");
            System.out.println("1. Attributes Declaration");
            System.out.println("2. Method Overloading");
            System.out.println("3. Loops");
            System.out.println("4. Method Overriding");
            System.out.println("5. Instantiation");
            System.out.println("6. Constructor");
            System.out.println("7. Inheritance");
            System.out.println("8. Overloading Constructor");
            System.out.println("9. Encapsulation");
            System.out.println("10. Overriding Polymorphism");
            System.out.println("11. Interface Polymorphism");
            System.out.println("12. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                      System.out.println("1. Attributes Declaration");
                     System.out.println("attributes are typically referred to as fields or variables within a class. When declaring attributes in Java, you specify the data type and the name of the attribute. Here's the basic syntax for declaring attributes in a Java class");
                    
                    break;
                case 2: 
                    display(" METHOD OVERLOADING \n Method overloading in java is a feature that allows a class to have more than one method with the same name, but with different parameters.");
                    display(42);
                    break;
                case 3:
                    loopExample();
                    break;
                case 4:
                    overriddenMethod();
                    break;
                case 5:
                    instantiationExample();
                    break;
                case 6:
                    new FinalTermActivities(); // Constructor Example
                    break;
                case 7:
                    inheritedMethod();
                    break;
                case 8:
                    new FinalTermActivities(10); // Overloading Constructor Example
                    break;
                case 9:
                    encapsulatedValue = 25;
                    System.out.println("Encapsulated Value: " + getEncapsulatedValue());
                    System.out.println(" ENCAPSULATION \n Encapsulation in Java is an object-oriented procedure of combining the data members and data methods of the class inside the user-defined class");
                    break;
                case 10:
                    polymorphismExample(new FinalTermActivities());
                    break;
                case 11:
                    MyInterface myInterface = new InterfaceImplementation();
                    myInterface.interfaceMethod();
                    break;
                case 12:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 12);

        scanner.close();
    }

    public static void main(String[] args) {
        FinalTermActivities program = new FinalTermActivities();
        program.mainMenu();
    }
}