import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDoacao {
    public static void main(String[] args) {
        // Criação do frame principal
        JFrame frame = new JFrame("Tela de Doação");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Campo para o nome da pessoa
        JPanel nomePanel = new JPanel();
        nomePanel.add(new JLabel("Digite seu nome:"));
        JTextField nomeField = new JTextField(20);
        nomePanel.add(nomeField);
        frame.add(nomePanel);

        // Campo para o valor da doação
        JPanel valorPanel = new JPanel();
        valorPanel.add(new JLabel("Digite o valor da doação (R$):"));
        JTextField valorField = new JTextField(10);
        valorPanel.add(valorField);
        frame.add(valorPanel);

        // Campo para selecionar a categoria
        JPanel categoriaPanel = new JPanel();
        categoriaPanel.add(new JLabel("Escolha uma categoria:"));
        String[] categorias = {"Saúde", "Fundos de Finança", "Educação", "Outros"};
        JComboBox<String> categoriaComboBox = new JComboBox<>(categorias);
        categoriaPanel.add(categoriaComboBox);
        frame.add(categoriaPanel);

        // Botão para realizar a doação
        JButton doarButton = new JButton("Doar");
        frame.add(doarButton);

        // Label para exibir a mensagem de agradecimento
        JLabel mensagemLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(mensagemLabel);

        // Evento do botão
        doarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String valor = valorField.getText();
                String categoria = (String) categoriaComboBox.getSelectedItem();

                if (!nome.isEmpty() && !valor.isEmpty()) {
                    try {
                        double valorDoacao = Double.parseDouble(valor); // Verifica se é um número válido
                        mensagemLabel.setText("<html>Obrigado pela doação, " + nome + "!<br>" +
                                "Categoria: " + categoria + "<br>" +
                                "Valor: R$" + String.format("%.2f", valorDoacao) + "</html>");
                    } catch (NumberFormatException ex) {
                        mensagemLabel.setText("Por favor, insira um valor válido para a doação.");
                    }
                } else {
                    mensagemLabel.setText("Por favor, preencha todos os campos.");
                }
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}

