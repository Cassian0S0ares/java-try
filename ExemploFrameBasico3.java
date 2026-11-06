import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.BoxLayout;

public class ExemploFrameBasico3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {});
        JFrame frame = new JFrame("Isso é culpa da internet que criou o zé povinho hightech");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.getContentPane().setLayout(
            new BoxLayout(frame.getContentPane(), SwingConstants.CENTER)
        );
        JLabel label1 = new JLabel("Olá, Teste1", SwingConstants.CENTER);
        label1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        frame.add(label1);
        JLabel label2 = new JLabel("Novo Label");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        frame.add(label2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
