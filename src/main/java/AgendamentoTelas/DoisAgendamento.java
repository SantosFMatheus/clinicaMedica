/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgendamentoTelas;

import AdministrativoTelas.CadastroConvenios;
import AdministrativoTelas.CadastroEspecialidade;
import AdministrativoTelas.CadastroFuncionarios;
import AdministrativoTelas.CadastroMedicos;
import AdministrativoTelas.CadastroUsuarios;
import com.mycompany.clinicamedica.atendimento.Historico_do_paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Gabri
 */
public class DoisAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form Agendamento
     */
    public DoisAgendamento() {
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
        btnSairAgendamento = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 115, 115));

        btnSairAgendamento.setText("SAIR");
        btnSairAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairAgendamentoActionPerformed(evt);
            }
        });

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
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(btnSairAgendamento))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(976, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(206, 206, 206))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSairAgendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)))
        );

        txtAdministrativo.setText("Administrativo");

        menuCadastroFuncionarios.setText("Cadastro de Funcionários");
        menuCadastroFuncionarios.setToolTipText("");
        menuCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroFuncionariosActionPerformed(evt);
            }
        });
        txtAdministrativo.add(menuCadastroFuncionarios);

        menuCadastroUsuarios.setText("Cadastro de Usuários");
        menuCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroUsuariosActionPerformed(evt);
            }
        });
        txtAdministrativo.add(menuCadastroUsuarios);

        menuCadastroEspecialidades.setText("Cadastro de Especialidades");
        menuCadastroEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroEspecialidadesActionPerformed(evt);
            }
        });
        txtAdministrativo.add(menuCadastroEspecialidades);

        menuCadastroMedicos.setText("Cadastro de Médicos");
        menuCadastroMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroMedicosActionPerformed(evt);
            }
        });
        txtAdministrativo.add(menuCadastroMedicos);

        menuCadastroConvenios.setText("Cadastro de Convênios");
        menuCadastroConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroConveniosActionPerformed(evt);
            }
        });
        txtAdministrativo.add(menuCadastroConvenios);

        jMenuBar2.add(txtAdministrativo);

        txtAgendamento.setText("Agendamento");
        txtAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgendamentoActionPerformed(evt);
            }
        });

        menuCadastroPaciente.setText("Cadastro de Pacientes");
        menuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacienteActionPerformed(evt);
            }
        });
        txtAgendamento.add(menuCadastroPaciente);

        menuAgendarConsulta.setText("Agenda de Consulta");
        menuAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendarConsultaActionPerformed(evt);
            }
        });
        txtAgendamento.add(menuAgendarConsulta);

        menuRegistroRetorno.setText("Registro de Retorno");
        menuRegistroRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroRetornoActionPerformed(evt);
            }
        });
        txtAgendamento.add(menuRegistroRetorno);

        menuCancelamentoConsulta.setText("Cancelamento de Consulta");
        menuCancelamentoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCancelamentoConsultaActionPerformed(evt);
            }
        });
        txtAgendamento.add(menuCancelamentoConsulta);

        jMenuBar2.add(txtAgendamento);

        txtAtendimento.setText("Atendimento");

        menuProntuarioPaciente.setText("Prontuário do Paciente");
        menuProntuarioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coisa(evt);
            }
        });
        txtAtendimento.add(menuProntuarioPaciente);

        jMenuBar2.add(txtAtendimento);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacienteActionPerformed
        new TresCadastroDePaciente().setVisible(true);
    }//GEN-LAST:event_menuCadastroPacienteActionPerformed

    private void btnSairAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairAgendamentoActionPerformed
        final UmTelaLoginAgendamento reexibir = new UmTelaLoginAgendamento();
        this.dispose();
        reexibir.setVisible(true);
    }//GEN-LAST:event_btnSairAgendamentoActionPerformed

    private void txtAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgendamentoActionPerformed

    private void menuAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendarConsultaActionPerformed
        new QuatroAgendarConsulta().setVisible(true);
    }//GEN-LAST:event_menuAgendarConsultaActionPerformed

    private void menuRegistroRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroRetornoActionPerformed
        new CincoRegistrodeRetorno().setVisible(true);
    }//GEN-LAST:event_menuRegistroRetornoActionPerformed

    private void menuCancelamentoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCancelamentoConsultaActionPerformed
        new SeisCancelamentodeConsulta().setVisible(true);
    }//GEN-LAST:event_menuCancelamentoConsultaActionPerformed

    private void menuCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroFuncionariosActionPerformed
        new CadastroFuncionarios().setVisible(true);
    }//GEN-LAST:event_menuCadastroFuncionariosActionPerformed

    private void menuCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroUsuariosActionPerformed
        new CadastroUsuarios().setVisible(true);
    }//GEN-LAST:event_menuCadastroUsuariosActionPerformed

    private void menuCadastroEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroEspecialidadesActionPerformed
        new CadastroEspecialidade().setVisible(true);
    }//GEN-LAST:event_menuCadastroEspecialidadesActionPerformed

    private void menuCadastroMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroMedicosActionPerformed
        new CadastroMedicos().setVisible(true);
    }//GEN-LAST:event_menuCadastroMedicosActionPerformed

    private void menuCadastroConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroConveniosActionPerformed
        new CadastroConvenios().setVisible(true);
    }//GEN-LAST:event_menuCadastroConveniosActionPerformed

    private void coisa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coisa
        new Historico_do_paciente().setVisible(true);
    }//GEN-LAST:event_coisa

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
            java.util.logging.Logger.getLogger(DoisAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoisAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoisAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoisAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

            new DoisAgendamento().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSairAgendamento;
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
    private javax.swing.JMenuItem menuProntuarioPaciente;
    private javax.swing.JMenuItem menuRegistroRetorno;
    private javax.swing.JMenu txtAdministrativo;
    private javax.swing.JMenu txtAgendamento;
    private javax.swing.JMenu txtAtendimento;
    // End of variables declaration//GEN-END:variables
}
