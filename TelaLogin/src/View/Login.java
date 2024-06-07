package View;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Navy and Blue Abstract Modern Globe Technology Logo Design.png"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 160, 180, 22);

        jLabel1.setText("Login:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 140, 70, 16);

        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 200, 60, 16);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 80, 23);

        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 380, 100, 23);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(180, 220, 180, 22);

        jButton3.setText("Cadastre-se");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 410, 100, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Navy and Blue Abstract Modern Globe Technology Logo Design.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0); // Fecha o aplicativo

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String login = txtUsuario.getText();
      String senha = new String(jPasswordField1.getPassword());

    // Verificar se os campos de login e senha estão vazios
      if (login.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha o campo de login e senha.");
      } else {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        // Verificar no banco de dados se o login e a senha estão corretos
        if (usuarioDAO.verificarLoginSenha(login, senha)) {
            // Se o login e a senha estiverem corretos, redirecione para o MenuView
            MenuView telaDeMenu = new MenuView();
            this.dispose();
        telaDeMenu.setVisible(true);    }//GEN-LAST:event_jButton2ActionPerformed
    else {
        // Se o login e a senha estiverem incorretos, exiba uma mensagem de erro
        JOptionPane.showMessageDialog(this, "Login ou senha incorretos. Por favor, tente novamente.");
    }
   }
    }     
      private boolean verificarLoginSenha(String senha) {   
    // Aqui você colocaria a lógica para verificar a senha no banco de dados
    // Substitua o retorno true pela lógica real de verificação
    return true;
}
    
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             FormCadastroView telaDeCadastro = new FormCadastroView();
    telaDeCadastro.setVisible(true);
    this.dispose(); // Fecha a janela de login                        
    

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JFormattedTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
