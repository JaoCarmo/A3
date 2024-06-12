package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.Conexao;
import javax.swing.*;


public class FormCadastroView extends javax.swing.JFrame {

    public FormCadastroView() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 6, 72, 23);
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(140, 120, 220, 22);

        jLabel1.setText("Login:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 100, 70, 16);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 150, 70, 16);
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(140, 280, 220, 22);

        jLabel3.setText("E-mail:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 260, 80, 16);

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 330, 110, 23);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(140, 170, 220, 22);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(140, 170, 220, 22);

        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 150, 70, 16);
        getContentPane().add(jPasswordField3);
        jPasswordField3.setBounds(140, 230, 220, 22);

        jLabel6.setText("Confirme a senha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 210, 120, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Navy and Blue Abstract Modern Globe Technology Logo Design.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0); // Fecha o aplicativo
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String login = jFormattedTextField1.getText();
        String senha = new String(jPasswordField1.getPassword());
        String email = jFormattedTextField3.getText();
        String confirmacaoSenha = new String(jPasswordField3.getPassword());
        
        if (login.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        return; // Não continua com o processo de cadastro
    }

        if (!senha.equals(confirmacaoSenha)) {
        JOptionPane.showMessageDialog(this, "As senhas não correspondem. Por favor, digite novamente.");
        return; 
        }

        String sql = "INSERT INTO usuarios (login, senha, email) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.getConnection();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            pstmt.setString(3, email);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir os dados: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new FormCadastroView().setVisible(true);
    });

     
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
