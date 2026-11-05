import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ExemploFrameBasico1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Isso é culpa da internet que criou o zé povinho hightech");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1920, 1080);
            frame.setLayout(new FlowLayout());
            frame.add(new JLabel("Teste1"));
            frame.add(new JLabel("Teste2"));
            frame.add(new JLabel("Teste3"));
            frame.add(new JLabel("Testede4"));
            frame.add(new JLabel("Lá ele"));
            frame.add(new JLabel("Viu gente como eu sou engraçado"));
            frame.add(new JLabel("Gente?"));
            frame.add(new JLabel("..."));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }
}
