import java.util.Scanner;

public class BMICalculator {

    public static String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "UnderWeight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "OverWeight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your body weight in kilograms: ");
        double weight = input.nextDouble(); // Changed to double for better precision

        System.out.println("Enter your height:");
        System.out.print("Feet: ");
        int feet = input.nextInt();
        System.out.print("Inches: ");
        int inches = input.nextInt();

        double heightInMeters = ((feet * 12) + inches) * 0.0254;
        double heightSquared = Math.pow(heightInMeters, 2);
        double bmi = weight / heightSquared;


        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.printf("Height: %.2f meters%n", heightInMeters);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        String bmiCategory = categorizeBMI(bmi);
        System.out.println(bmiCategory);

        input.close();
    }
}
