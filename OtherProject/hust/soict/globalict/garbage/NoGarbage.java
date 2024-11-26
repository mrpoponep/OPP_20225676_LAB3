package OtherProject.hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "C:\\code\\Java_project\\Lab03\\OtherProject\\hust\\soict\\globalict\\large_text.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));

            // Using StringBuffer
            startTime = System.currentTimeMillis();
            int counter = 0;
            StringBuffer outputString = new StringBuffer(); // Use StringBuffer here
            for (byte b : inputBytes) {
                outputString.append((char) b); // Append characters to StringBuffer
                counter++;
            }
            endTime = System.currentTimeMillis();

            System.out.println((endTime - startTime) + " ms");
            System.out.println(counter);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
