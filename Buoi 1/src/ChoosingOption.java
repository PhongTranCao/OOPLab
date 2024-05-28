import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do u want to change your tickets?",
                "", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "you 've chosen: " +(option == JOptionPane.YES_OPTION?"Yes":"Nah"));
        System.exit(1);
    }
}