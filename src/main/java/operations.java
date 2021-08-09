public class operations {


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double power(double num1, int num2) {
        double powered = 1;
        for (int i = 0; i < num2; i++) {
            powered *= num1;
        }
        return powered;
    }
}
