/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
<<<<<<<< HEAD:src/main/java/AgendamentoTelas/TelaLoginAgendamento.java
package AgendamentoTelas;
========
package com.mycompany.clinicamedica.agendamento;
>>>>>>>> matheusfsp:src/main/java/com/mycompany/clinicamedica/agendamento/TelaLoginAgendamento.java

import javax.swing.JOptionPane;

/**
 *
 * @author Gabri
 */
public class TelaLoginAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginAgendamento
     */
    public TelaLoginAgendamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        TelaLogin = new javax.swing.JPanel();
        LogoClinica = new javax.swing.JLabel();
        txtLembrar = new javax.swing.JCheckBox();
        txtEsqueceuSenha = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        jToggleButton2.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TelaLogin.setBackground(new java.awt.Color(2, 115, 115));

        txtLembrar.setText("Lembrar-me");
        txtLembrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLembrarActionPerformed(evt);
            }
        });

        txtEsqueceuSenha.setText("Esqueceu a senha?");
        txtEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEsqueceuSenhaActionPerformed(evt);
            }
        });

        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUsuario.setText("Usuário");

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSenha.setText("Senha");

        javax.swing.GroupLayout TelaLoginLayout = new javax.swing.GroupLayout(TelaLogin);
        TelaLogin.setLayout(TelaLoginLayout);
        TelaLoginLayout.setHorizontalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaLoginLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaLoginLayout.createSequentialGroup()
                        .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(TelaLoginLayout.createSequentialGroup()
                                .addComponent(txtLembrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(txtEsqueceuSenha))
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha))
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaLoginLayout.createSequentialGroup()
                        .addComponent(LogoClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))))
        );
        TelaLoginLayout.setVerticalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LogoClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario))
                .addGap(36, 36, 36)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLembrar)
                    .addComponent(txtEsqueceuSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLembrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLembrarActionPerformed
        // TODO add your handling code here:
txtLembrar.addActionListener((java.awt.event.ActionEvent evt1) -> {
    // Coloque aqui o código que deve ser executado quando o checkbox "Lembrar-me" for selecionado ou desmarcado
    if(txtLembrar.isSelected()){
        JOptionPane.showMessageDialog(null, "Você marcou Lembrar-me");
    }else{
        JOptionPane.showMessageDialog(null, "Você desmarcou Lembrar-me");
    }
});
    }//GEN-LAST:event_txtLembrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("primeiro_acesso") && txtSenha.getText().equals("123")){
            JOptionPane.showMessageDialog(null,"Acesso liberado");
            new Agendamento().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEsqueceuSenhaActionPerformed
        // TODO add your handling code here:
        txtEsqueceuSenha.addActionListener((java.awt.event.ActionEvent evt1) -> {
            // Coloque aqui o código que deve ser executado quando o botão "Esqueceu a senha?" for clicado
            JOptionPane.showMessageDialog(null, "Você clicou em esqueceu a senha");
        });
    }//GEN-LAST:event_txtEsqueceuSenhaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoClinica;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JButton txtEsqueceuSenha;
    private javax.swing.JCheckBox txtLembrar;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
