import java.awt.*;
import javax.swing.*;
public class ExemploPainelLayout extends JFrame{
    public ExemploPainelLayout(){
        super("Exemplo com Painel e layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JButton("Botão 1"));
        panel.add(new JButton("Botão 2"));
        panel.add(new JButton("Botão 3"));
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new ExemploPainelLayout());
    }}

