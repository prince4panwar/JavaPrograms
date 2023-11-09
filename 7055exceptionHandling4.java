//Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

 class ReadNumbersFromFile {
    public static void main(String[] args) {
        try {
            checkNumbersInFile("numbers.txt");
        } catch (PositiveNumberException e) {
            System.out.println("Positive number found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File not found or cannot be read: " + e.getMessage());
        }
    }

    public static void checkNumbersInFile(String fileName) throws IOException, PositiveNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number > 0) {
                scanner.close();
                throw new PositiveNumberException("Positive number detected: " + number);
            }
        }

        scanner.close();
    }
}
