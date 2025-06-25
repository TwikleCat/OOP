package task1;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.*;

public class WordTallyReporter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter minimum word frequency to include: ");
        int minFrequency = 0;
        try {
            minFrequency = Integer.parseInt(input.nextLine().trim());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input, defaulting to 0");
        }

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\Artemida\\Downloads\\random_text.txt"),
                StandardCharsets.UTF_8))) {

            String line;
            Pattern wordPattern = Pattern.compile("[a-zA-Z]+");

            while ((line = reader.readLine()) != null) {
                Matcher matcher = wordPattern.matcher(line);
                while (matcher.find()) {
                    String word = matcher.group().toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream("C:\\Users\\Artemida\\eclipse-workspace\\OOP\\practice5\\task1\\report.txt"),
                StandardCharsets.UTF_8))) {

            System.out.println("\n--- FULL OUTPUT ---");
            for (Map.Entry<String, Integer> entry : sortedWords) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
                writer.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }

            System.out.println("\n--- OUTPUT WITH MIN FREQUENCY (" + minFrequency + ") ---");
            for (Map.Entry<String, Integer> entry : sortedWords) {
                if (entry.getValue() >= minFrequency) {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
                }
            }

            System.out.println("\nReport written to file successfully.");

        } catch (IOException e) {
            System.err.println("Error writing to report.txt: " + e.getMessage());
        }
    }
	

}
