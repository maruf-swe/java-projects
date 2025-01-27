import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculatorWithTryCatch {

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
        int weight = 0, heightInFeet = 0, heightInInch = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the Body Weight in KG: ");
                weight = input.nextInt();
                System.out.println("Enter the Height: ");
                System.out.print("Feet: ");
                heightInFeet = input.nextInt();
                System.out.print("Inch: ");
                heightInInch = input.nextInt();

                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric value for weight and height.");
                input.nextLine();
            }
        }

        double heightInMeter = ((heightInFeet * 12) + heightInInch) * 0.0254;
        double heightInSquared = Math.pow(heightInMeter, 2);
        double bmi = weight / heightInSquared;

        System.out.printf("Weight In Kg %d kg%n", weight);
        System.out.printf("Height In Meter %.2f%n", heightInMeter);
        System.out.printf("Your BMI is %.2f%n", bmi);

        String bmiCategory = categorizeBMI(bmi);
        System.out.println(bmiCategory);

        input.close();


    }
}
