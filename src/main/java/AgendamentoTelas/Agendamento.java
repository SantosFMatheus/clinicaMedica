/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgendamentoTelas;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Gabri
 */
public class Agendamento extends javax.swing.JFrame {
  

    /**
     * Creates new form Agendamento
     */
    public Agendamento() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        txtAdministrativo = new javax.swing.JMenu();
        menuCadastroFuncionarios = new javax.swing.JMenuItem();
        menuCadastroUsuarios = new javax.swing.JMenuItem();
        menuCadastroEspecialidades = new javax.swing.JMenuItem();
        menuCadastroMedicos = new javax.swing.JMenuItem();
        menuCadastroConvenios = new javax.swing.JMenuItem();
        txtAgendamento = new javax.swing.JMenu();
        menuCadastroPaciente = new javax.swing.JMenuItem();
        menuAgendarConsulta = new javax.swing.JMenuItem();
        menuRegistroRetorno = new javax.swing.JMenuItem();
        menuCancelamentoConsulta = new javax.swing.JMenuItem();
        txtAtendimento = new javax.swing.JMenu();
        menuProntuarioPaciente = new javax.swing.JMenuItem();
        menuRegistroAtendimento = new javax.swing.JMenuItem();
        menuReceituario = new javax.swing.JMenuItem();
        menuExames = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 115, 115));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabri\\Downloads\\WhatsApp_Image_2023-11-16_at_21.55.29-removebg-preview.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabri\\Downloads\\WhatsApp_Image_2023-11-16_at_21.55.29-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(206, 206, 206)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)))
        );

        txtAdministrativo.setText("Administrativo");

        menuCadastroFuncionarios.setText("Cadastro de Funcionários");
        menuCadastroFuncionarios.setToolTipText("");
        txtAdministrativo.add(menuCadastroFuncionarios);

        menuCadastroUsuarios.setText("Cadastro de Usuários");
        txtAdministrativo.add(menuCadastroUsuarios);

        menuCadastroEspecialidades.setText("Cadastro de Especialidades");
        txtAdministrativo.add(menuCadastroEspecialidades);

        menuCadastroMedicos.setText("Cadastro de Médicos");
        txtAdministrativo.add(menuCadastroMedicos);

        menuCadastroConvenios.setText("Cadastro de Convênios");
        txtAdministrativo.add(menuCadastroConvenios);

        jMenuBar2.add(txtAdministrativo);

        txtAgendamento.setText("Agendamento");

        menuCadastroPaciente.setText("Cadastro de Pacientes");
        menuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacienteActionPerformed(evt);
            }
        });
        txtAgendamento.add(menuCadastroPaciente);

        menuAgendarConsulta.setText("Agenda de Consulta");
        txtAgendamento.add(menuAgendarConsulta);

        menuRegistroRetorno.setText("Registro de Retorno");
        txtAgendamento.add(menuRegistroRetorno);

        menuCancelamentoConsulta.setText("Cancelamento de Consulta");
        txtAgendamento.add(menuCancelamentoConsulta);

        jMenuBar2.add(txtAgendamento);

        txtAtendimento.setText("Atendimento");

        menuProntuarioPaciente.setText("Prontuário do Paciente");
        txtAtendimento.add(menuProntuarioPaciente);

        menuRegistroAtendimento.setText("Registro de Atendimento");
        txtAtendimento.add(menuRegistroAtendimento);

        menuReceituario.setText("Receituário");
        txtAtendimento.add(menuReceituario);

        menuExames.setText("Exames");
        txtAtendimento.add(menuExames);

        jMenuBar2.add(txtAtendimento);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar2.add(menuSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacienteActionPerformed
new CadastrodePacientes().setVisible(true);  


    }//GEN-LAST:event_menuCadastroPacienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // Menu Sair
        this.dispose();
    }//GEN-LAST:event_menuSairActionPerformed
    
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
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
            new Agendamento().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAgendarConsulta;
    private javax.swing.JMenuItem menuCadastroConvenios;
    private javax.swing.JMenuItem menuCadastroEspecialidades;
    private javax.swing.JMenuItem menuCadastroFuncionarios;
    private javax.swing.JMenuItem menuCadastroMedicos;
    private javax.swing.JMenuItem menuCadastroPaciente;
    private javax.swing.JMenuItem menuCadastroUsuarios;
    private javax.swing.JMenuItem menuCancelamentoConsulta;
    private javax.swing.JMenuItem menuExames;
    private javax.swing.JMenuItem menuProntuarioPaciente;
    private javax.swing.JMenuItem menuReceituario;
    private javax.swing.JMenuItem menuRegistroAtendimento;
    private javax.swing.JMenuItem menuRegistroRetorno;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu txtAdministrativo;
    private javax.swing.JMenu txtAgendamento;
    private javax.swing.JMenu txtAtendimento;
    // End of variables declaration//GEN-END:variables
}
