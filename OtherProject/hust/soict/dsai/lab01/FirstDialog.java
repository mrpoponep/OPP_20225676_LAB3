package OtherProject.hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class FirstDialog {
    public static void main(String[] args) {
        String ten = JOptionPane.showInputDialog("Nhập tên của bạn:");
        JOptionPane.showMessageDialog(null, "Chào mừng bạn, " + ten + "!", "Chào mừng", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}