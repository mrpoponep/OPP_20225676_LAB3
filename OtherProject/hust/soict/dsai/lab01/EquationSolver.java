package OtherProject.hust.soict.dsai.lab01;
import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of equation to solve:");
        System.out.println("1. First-degree equation (ax + b = 0)");
        System.out.println("2. System of first-degree equations (2 variables)");
        System.out.println("3. Second-degree equation (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveFirstDegreeEquation(scanner);
                break;
            case 2:
                solveSystemOfEquations(scanner);
                break;
            case 3:
                solveSecondDegreeEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

    public static void solveFirstDegreeEquation(Scanner scanner) {
        System.out.println("Enter coefficient a and b for equation ax + b = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("The equation is not valid as a cannot be zero.");
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    public static void solveSystemOfEquations(Scanner scanner) {
        System.out.println("Enter coefficients for the system of equations:");
        System.out.println("Equation 1: a11*x1 + a12*x2 = b1");
        System.out.println("Equation 2: a21*x1 + a22*x2 = b2");

        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution is x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void solveSecondDegreeEquation(Scanner scanner) {
        System.out.println("Enter coefficients a, b, and c for equation ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has a double root: x = " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
