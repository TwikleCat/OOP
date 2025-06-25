package task3;
import java.io.*;
import java.util.*;

public class SensorLogger {
	private static final String file = "C:\\Users\\Artemida\\eclipse-workspace\\OOP\\practice5\\task3\\sensor_readings.txt";
    private static final int n = 60;

	public static void main(String[] args) {
		Random rand = new Random();

        
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < n; i++) {
                double temp = 15 + rand.nextDouble() * 20; 
                out.writeDouble(temp);
                System.out.println(temp);
                Thread.sleep(1000); 
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error writing temperatures: " + e.getMessage());
            return;
        }
        
        System.out.println("\n--- Before ---");
        printTemperatureStats();
        
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            long position = 29L * 8; 
            raf.seek(position);
            raf.writeDouble(999.9);
            System.out.println("Patched 30th temperature with 999.9°C.");
        } catch (IOException e) {
            System.err.println("Error patching file: " + e.getMessage());
        }
		
        
        System.out.println("\n--- After ---");
        printTemperatureStats();
    }

    private static void printTemperatureStats() {
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            double sum = 0;
            int count = 0;

            while (in.available() >= 8) {
                double temp = in.readDouble();
                min = Math.min(min, temp);
                max = Math.max(max, temp);
                sum += temp;
                count++;
            }

            double average = (count > 0) ? sum / count : 0;
            System.out.printf("Total readings: %d%n", count);
            System.out.printf("Minimum temp: %.2f°C%n", min);
            System.out.printf("Maximum temp: %.2f°C%n", max);
            System.out.printf("Average temp: %.2f°C%n", average);

        } catch (IOException e) {
            System.err.println("Error reading temperatures: " + e.getMessage());
        }

	}

}
