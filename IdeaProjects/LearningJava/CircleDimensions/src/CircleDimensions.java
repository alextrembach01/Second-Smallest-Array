import java.util.Scanner;

public class CircleDimensions {
    public static void main (String[] args) {
        System.out.println("# This is the program that calculates area and perimeter of a circle based on radius input.");
        System.out.println("Please, enter the radius of circle:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI*(radius*radius);
        double perimeter = Math.PI*(radius*2);
        System.out.println("Perimeter = "+ perimeter);
        System.out.println("Area = "+ area);
    }
}
