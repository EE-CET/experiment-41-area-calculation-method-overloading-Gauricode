import java.util.Scanner;

public class AreaCalculator {
    float radius;
    float length;
    float breadth;
    double base; 
    double height;
    static float calculateArea(float radius){
		return (3.14159f)*radius*radius;
	}
    static float calculateArea(float length, float breadth){
		return length*breadth;
	}
    static double calculateArea(double base, double height){
		return 0.5*base*height;
	}
    // TODO: Define calculateArea(float radius) -> returns area of circle
    // Use Math.PI or 3.14159f for pi

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle

    // TODO: Define calculateArea(double base, double height) -> returns area of triangle

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	float radius=sc.nextFloat();
	float length=sc.nextFloat();
        float breadth=sc.nextFloat();
	double base=sc.nextDouble();
	double height=sc.nextDouble();
        // TODO: Read input for Circle (radius)
        // TODO: Read input for Rectangle (length, breadth)
        // TODO: Read input for Triangle (base, height)
        System.out.printf("%.2f\n", calculateArea(radius));
	System.out.printf("%.2f\n", calculateArea(length,breadth));
	System.out.printf("%.2f\n", calculateArea(base,height));
        // TODO: Call methods and print results formatted to 2 decimal places
        // Hint: Use System.out.printf("%.2f\n", area);
    }
}
