import java.util.Scanner;


public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = false;

        do {
            System.out.println("Please select an operation: \n" +
                    "Add\t\tSubtract\tMultiply\tDivide\tPower \n"
                    );
            String response = (scan.nextLine()).toLowerCase();

            switch (response) {
                case "add"->{
                    System.out.println("Please enter two numbers separate by a space.");
                    final double num1 = scan.nextDouble();
                    final double num2 = scan.nextDouble();
                    scan.nextLine();
                    double result = operations.add(num1,num2);
                    System.out.printf("%s plus %s equals %s%n",num1,num2,result);
                }
                case "subtract"->{
                    System.out.println("Please enter two numbers separate by a space.");
                    final double num1 = scan.nextDouble();
                    final double num2 = scan.nextDouble();
                    scan.nextLine();
                    double result = operations.subtract(num1,num2);
                    System.out.printf("%s minus %s equals %s%n",num1,num2,result);
                }
                case "multiply"->{
                    System.out.println("Please enter two numbers separate by a space.");
                    final double num1 = scan.nextDouble();
                    final double num2 = scan.nextDouble();
                    scan.nextLine();
                    double result = operations.multiply(num1,num2);
                    System.out.printf("%s times %s equals %s%n",num1,num2,result);
                }
                case "divide"->{
                    System.out.println("Please enter two numbers separate by a space.");
                    final double num1 = scan.nextDouble();
                    final double num2 = scan.nextDouble();
                    scan.nextLine();
                    double result = operations.divide(num1,num2);
                    System.out.printf("%s divided by %s equals %s%n",num1,num2,result);
                }
                case "power"->{
                    System.out.println("Please enter an integer.");
                    int num1 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("To be raised to the power of a second integer.");
                    int num2 = scan.nextInt();
                    System.out.println(operations.power(num1,num2));
                }

                case "sqrt" ->{

                }
                default -> System.out.println("Invalid selection.");
            }

            System.out.println("Would you like to continue? (y/N)");
            response = (scan.nextLine()).toLowerCase();

            switch (response){
                case "y","yes" -> cont = true;
                default -> cont = false;
            }


        } while (cont);
        System.out.println("Thank you, come again.");
    }


}


/*
Create a Custom Class:



Create a Java Calculator Class that does the following five commands:
An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
A square method that takes in one integer and squares it: square(int num1, int num2)

 */