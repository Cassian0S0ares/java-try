import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class ExemploFrameBasico{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Isso é culpa da internet que criou o zé povinho hightech");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1920, 1080);
            frame.add(new JLabel("Smoke on the window and what do you see?"));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}