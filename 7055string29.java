// Program to find the most repeated word in a text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

class MostRepeatedWord {

    public static void main(String[] args) throws Exception {
        // Read the file and store the words in an array
        String line, word = "";
        String[] words = new String[1000]; // Assume the file has less than 1000 words
        int index = 0; // To keep track of the array index
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);
        while ((line = br.readLine()) != null) {
            String[] temp = line.toLowerCase().split("([.,\\s]+)"); // Split the line by spaces and punctuation marks
            for (String s : temp) {
                words[index] = s; // Add the word to the array
                index++;
            }
        }
        br.close();

        // Sort the array alphabetically
        Arrays.sort(words, 0, index);

        // Find the most repeated word and its frequency
        int count = 1, maxCount = 1;
        for (int i = 0; i < index - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                count++; // Increment the count if the current word is same as the next word
            } else {
                count = 1; // Reset the count if the current word is different from the next word
            }
            if (count > maxCount) {
                maxCount = count; // Update the max count and the most repeated word
                word = words[i];
            }
        }

        // Print the result
        System.out.println("Most repeated word: " + word);
        System.out.println("Frequency: " + maxCount);
    }
}
