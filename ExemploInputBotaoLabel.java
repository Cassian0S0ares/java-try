import javax.swing.*;
import java.awt.*;

public class ExemploInputBotaoLabel {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JLabel titulo = new JLabel("Digite algo:");
            JTextField input = new JTextField(20);
            JButton botao = new  JButton("Exibir texto");
            JLabel resultado = new JLabel(" ");
            Runnable exibir = () -> resultado.setText(input.getText());
            botao.addActionListener(e -> exibir.run());
            input.addActionListener(e -> exibir.run());

            JPanel painel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.insets = new Insets(5,10,5,10);

            painel.add(titulo, gbc);
            painel.add(input, gbc);
            painel.add(botao, gbc);
            painel.add(resultado, gbc);

            JFrame frame = new JFrame("Exemplo Input");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(painel);
            frame.setSize(400,300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
