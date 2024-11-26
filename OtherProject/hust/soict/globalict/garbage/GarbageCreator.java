package OtherProject.hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:\\code\\Java_project\\Lab03\\OtherProject\\hust\\soict\\globalict\\large_text.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        int counter = 0;
        String outputString = "";
        for (byte b : inputBytes){
            outputString += (char)b;
            counter++;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(counter);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}