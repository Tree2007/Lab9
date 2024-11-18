import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int[] dataPoints = new int[100];
        int average = 0;
        int maxValue = 1;
        int minValue = 100;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = ran.nextInt(100) + 1;
            count++;
            //sum
            sum += dataPoints[i];
            //average
            average = sum / count;
            //max value
            if (maxValue < dataPoints[i]) {
                maxValue = dataPoints[i];
            }
            if (minValue > dataPoints[i]) {
                minValue = dataPoints[i];
            }

            System.out.print(dataPoints[i] + " | ");
        }
        System.out.printf("\n\n %2s %-5d \n %5s %-5d \n %5s %-5d \n %5s %-5d \n ", "Sum:", sum, "Average:", average,
                          "Max Value:", maxValue, "Min Value:", minValue);

        //User input
        int userValue = InputHelper.getRangedInt(scan, "Please input a value [1-100]:", 1, 100);
        int count2 = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            count2++;
            if (userValue == dataPoints[i]) {
                System.out.println("Your value " + userValue + " appears at datapoint " + count2);
                break;
            }
            if (count2 == 100) {
                if (userValue != dataPoints[i]) {
                    System.out.println("Your value did not appear in the array");
                    break;
                }
            }
        }
    }
    public static int min(int values[]) {
        int min = 100;
        for (int i : values ){
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

}