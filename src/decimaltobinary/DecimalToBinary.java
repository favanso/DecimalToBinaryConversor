package decimaltobinary;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        ArrayList<Integer> remaindersList = new ArrayList<Integer>();
        ArrayList<Integer> binary = new ArrayList<Integer>();
        int remainder;
        int decimalNumber;
        final int divisor = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a Decimal number to convert to Binary: ");
        decimalNumber = scanner.nextInt();

        while (decimalNumber != 0) {
            remainder = decimalNumber % divisor;
            remaindersList.add(remainder);
            decimalNumber = decimalNumber / divisor;
        }

        int index = remaindersList.size() - 1;

        while (index >= 0) {
            int binaryNumber = remaindersList.get(index);
            binary.add(binaryNumber);
            index--;
        }

        System.out.println("Your number in Binary number is: "+ binary.toString().
                replace("[", "").replace("]", "").replace(", ", ""));

    }
}
