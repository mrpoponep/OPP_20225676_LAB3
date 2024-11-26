package OtherProject.hust.soict.globalict.garbage;
import java.util.Random;
public class StringConcatenation {
    public static void main(String[] args) {
        // Khởi tạo các biến cần thiết
        int iterations = 65536;
        Random r = new Random(123);

        // Cách 1: Sử dụng toán tử +
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += r.nextInt(2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện cách 1: " + (endTime - startTime) + " ms");

        // Cách 2: Sử dụng StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(r.nextInt(2));
         }
        s = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện cách 2: " + (endTime - startTime) + " ms");
    }
}