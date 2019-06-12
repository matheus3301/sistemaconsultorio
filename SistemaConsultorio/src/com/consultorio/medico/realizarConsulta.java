/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.medico;

import com.consultorio.DAO.CompromissoDAO;
import com.consultorio.secretaria.*;
import com.consultorio.DAO.Conexao;
import com.consultorio.DAO.ConvenioDAO;
import com.consultorio.DAO.DiagnosticoDAO;
import com.consultorio.DAO.MedicoDAO;
import com.consultorio.DAO.PacienteDAO;
import com.consultorio.DAO.PlanosDAO;
import com.consultorio.main.ErrorMsg;
import com.consultorio.main.RightMsg;
import com.consultorio.main.TrocarPanel;
import com.consultorio.model.Compromisso;
import com.consultorio.model.Convenio;
import com.consultorio.model.Diagnostico;
import com.consultorio.model.Medico;
import com.consultorio.model.Paciente;
import com.consultorio.model.Plano;
import java.awt.Color;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;

/**
 *
 * @author aluno
 */
public class realizarConsulta extends javax.swing.JPanel {
    
    int idComp;
    
    String nomeMedico;
    
    public realizarConsulta(int idCompromisso) {
        initComponents();
        idComp = idCompromisso;
        CapturarConsulta();
    }
    
    public void CapturarConsulta() {
        Connection con = Conexao.AbrirConexao();
        CompromissoDAO sqlC = new CompromissoDAO(con);
        Compromisso consulta = sqlC.Capturar(idComp);
        
        PacienteDAO sqlP = new PacienteDAO(con);
        Paciente paciente = sqlP.Capturar(consulta.getPaciente());
        
        
        
        MedicoDAO sqlM = new MedicoDAO(con);
        
        
        Medico med = sqlM.CapturarMedico(consulta.getMedico());
        
        nomeMedico = med.getNome();
        
        
        
        iptPaciente.setText(paciente.getNome());
        iptDesc.setText(consulta.getDescricao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        iptPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        iptDesc = new javax.swing.JTextArea();
        btnExame = new javax.swing.JButton();
        btnCid = new javax.swing.JButton();
        btnReceita = new javax.swing.JButton();
        btnAtestado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        iptDiag = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 470));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 470));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Realizar consulta");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fullsize_1.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));

        btnFinalizar.setBackground(new java.awt.Color(223, 57, 51));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar Consulta");
        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinalizar.setFocusPainted(false);
        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseEntered(evt);
            }
        });
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Nome do Paciente:");

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Descrição");

        iptPaciente.setEditable(false);

        iptDesc.setEditable(false);
        iptDesc.setColumns(20);
        iptDesc.setRows(5);
        jScrollPane1.setViewportView(iptDesc);

        btnExame.setBackground(new java.awt.Color(223, 57, 51));
        btnExame.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExame.setForeground(new java.awt.Color(255, 255, 255));
        btnExame.setText("Solicitar Exame");
        btnExame.setBorderPainted(false);
        btnExame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExame.setFocusPainted(false);
        btnExame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExameMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExameMouseEntered(evt);
            }
        });
        btnExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameActionPerformed(evt);
            }
        });

        btnCid.setBackground(new java.awt.Color(223, 57, 51));
        btnCid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCid.setForeground(new java.awt.Color(255, 255, 255));
        btnCid.setText("Consultar Tabela CID");
        btnCid.setBorderPainted(false);
        btnCid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCid.setFocusPainted(false);
        btnCid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCidMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCidMouseEntered(evt);
            }
        });
        btnCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCidActionPerformed(evt);
            }
        });

        btnReceita.setBackground(new java.awt.Color(223, 57, 51));
        btnReceita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnReceita.setText("Emitir Receita");
        btnReceita.setBorderPainted(false);
        btnReceita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReceita.setFocusPainted(false);
        btnReceita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReceitaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReceitaMouseEntered(evt);
            }
        });
        btnReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceitaActionPerformed(evt);
            }
        });

        btnAtestado.setBackground(new java.awt.Color(223, 57, 51));
        btnAtestado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtestado.setForeground(new java.awt.Color(255, 255, 255));
        btnAtestado.setText("Emitir Atestado");
        btnAtestado.setBorderPainted(false);
        btnAtestado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtestado.setFocusPainted(false);
        btnAtestado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtestadoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtestadoMouseEntered(evt);
            }
        });
        btnAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtestadoActionPerformed(evt);
            }
        });

        iptDiag.setColumns(20);
        iptDiag.setRows(5);
        jScrollPane2.setViewportView(iptDiag);

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Diagnóstico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addGap(19, 19, 19)
                            .addComponent(iptPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel29))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel30))))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtestado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(iptPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(112, 112, 112)
                .addComponent(jLabel3))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseExited
        btnFinalizar.setBackground(new Color(223, 57, 51));
        btnFinalizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnFinalizarMouseExited

    private void btnFinalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseEntered
        btnFinalizar.setBackground(new Color(235, 235, 235));
        btnFinalizar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_btnFinalizarMouseEntered

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        Diagnostico diag = new Diagnostico();
        Connection con = Conexao.AbrirConexao();
        CompromissoDAO sqlC = new CompromissoDAO(con);
        Compromisso consulta = sqlC.Capturar(idComp);

        DiagnosticoDAO sqlD = new DiagnosticoDAO(con);

        diag.setId_paciente(consulta.getPaciente());
        diag.setDiagnostico(iptDiag.getText());

        sqlD.InserirDiagnostico(diag);
        sqlC.RealizarCompromisso(consulta);

        new RightMsg().ReceberMsg("Consulta Realizada!");
        new TrocarPanel(pnlPrincipal, new home(consulta.getMedico()));
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnExameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExameMouseExited

    private void btnExameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExameMouseEntered

    private void btnExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameActionPerformed
        new jfDocumento().ReceberTipo("Exame", "Solicito o exame \npara o paciente", nomeMedico);
    }//GEN-LAST:event_btnExameActionPerformed

    private void btnCidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCidMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCidMouseExited

    private void btnCidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCidMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCidMouseEntered

    private void btnCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCidActionPerformed
        new jfCid().setVisible(true);
    }//GEN-LAST:event_btnCidActionPerformed

    private void btnReceitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReceitaMouseExited

    private void btnReceitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReceitaMouseEntered

    private void btnReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceitaActionPerformed
        new jfDocumento().ReceberTipo("Receita", "Prescrevo o medicamento \npara o paciente", nomeMedico);
    }//GEN-LAST:event_btnReceitaActionPerformed

    private void btnAtestadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtestadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtestadoMouseExited

    private void btnAtestadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtestadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtestadoMouseEntered

    private void btnAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtestadoActionPerformed
        new jfDocumento().ReceberTipo("Atestado", "Declaro o paciente inapto para suas atividades pelo período de ", nomeMedico);
    }//GEN-LAST:event_btnAtestadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtestado;
    private javax.swing.JButton btnCid;
    private javax.swing.JButton btnExame;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnReceita;
    private javax.swing.JTextArea iptDesc;
    private javax.swing.JTextArea iptDiag;
    private javax.swing.JTextField iptPaciente;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}