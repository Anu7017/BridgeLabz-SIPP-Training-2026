package level2;

import java.util.Scanner;

public class BMI2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--;
                continue;
            }

            double bmi = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            personData[i][2] = bmi;

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < number; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}
