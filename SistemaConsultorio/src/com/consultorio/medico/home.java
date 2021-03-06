/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.medico;

import com.consultorio.DAO.CompromissoDAO;
import com.consultorio.DAO.Conexao;
import com.consultorio.DAO.MedicoDAO;
import com.consultorio.DAO.PacienteDAO;
import com.consultorio.main.TrocarPanel;
import com.consultorio.model.Compromisso;
import com.consultorio.model.Medico;
import com.consultorio.model.Paciente;
import com.consultorio.secretaria.*;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class home extends javax.swing.JPanel {

    int idM;

    Date dataAtual = new Date();

    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form home
     */
    public home(int id) {
        initComponents();
        VerificaCalendario();
        VerificaTable();

        idM = id;
        System.out.println(idM);

        Connection con = Conexao.AbrirConexao();
        CompromissoDAO sql = new CompromissoDAO(con);

        List<Compromisso> compromissos = sql.ListarTabelaData(idM, formatador.format(dataAtual));
        System.out.println(compromissos);
        DefaultTableModel tbm = (DefaultTableModel) tbCompromisso.getModel();

        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        MedicoDAO sqlM = new MedicoDAO(con);
        int i = 0;
        for (Compromisso atual : compromissos) {
            tbm.addRow(new String[i]);

            tbCompromisso.setValueAt(atual.getId(), i, 0);

            if (atual.getTipo().equals("Externo")) {
                tbCompromisso.setValueAt(atual.getTipo(), i, 3);
            } else {
                PacienteDAO sqlP = new PacienteDAO(con);
                Paciente paciente = sqlP.Capturar(atual.getPaciente());

                tbCompromisso.setValueAt(paciente.getNome(), i, 3);
            }

            tbCompromisso.setValueAt(atual.getHorario_inicial(), i, 1);
            tbCompromisso.setValueAt(atual.getHorario_final(), i, 2);

            i++;

        }

    }

    public void VerificaCalendario() {

        Connection con = Conexao.AbrirConexao();
        CompromissoDAO sql = new CompromissoDAO(con);

        new Thread() {
            public void run() {
                String ultima = calendario.getFechaSeleccionada();
                while (true) {

                    if (calendario.getFechaSeleccionada() != null && !calendario.getFechaSeleccionada().equals(ultima)) {
                        ultima = calendario.getFechaSeleccionada();
                        lblDia.setText("Compromissos de: " + calendario.getFechaSeleccionada());

                        List<Compromisso> compromissos = sql.ListarTabelaData(idM, calendario.getFechaSeleccionada());
                        System.out.println(compromissos);
                        DefaultTableModel tbm = (DefaultTableModel) tbCompromisso.getModel();

                        while (tbm.getRowCount() > 0) {
                            tbm.removeRow(0);
                        }
                        MedicoDAO sqlM = new MedicoDAO(con);
                        int i = 0;
                        for (Compromisso atual : compromissos) {
                            tbm.addRow(new String[i]);

                            tbCompromisso.setValueAt(atual.getId(), i, 0);

                            if (atual.getTipo().equals("Externo")) {
                                tbCompromisso.setValueAt(atual.getTipo(), i, 3);
                            } else {
                                PacienteDAO sqlP = new PacienteDAO(con);
                                Paciente paciente = sqlP.Capturar(atual.getPaciente());

                                tbCompromisso.setValueAt(paciente.getNome(), i, 3);
                            }

                            tbCompromisso.setValueAt(atual.getHorario_inicial(), i, 1);
                            tbCompromisso.setValueAt(atual.getHorario_final(), i, 2);

                            i++;

                        }

                    }

                    try {
                        Thread.sleep(50);
                    } catch (Exception ex) {

                    }
                }
            }

        }.start();
    }

    public void VerificaTable() {

        Connection con = Conexao.AbrirConexao();
        CompromissoDAO sql = new CompromissoDAO(con);

        new Thread() {
            public void run() {
                String ultima = calendario.getFechaSeleccionada();
                while (true) {

                    System.out.println("Verificando");

                    if (tbCompromisso.getSelectedRow() != -1) {
                        if (!tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 3).toString().equals("Externo")) {
                            btnBuscar1.setEnabled(true);
                        }

                    } else {
                        btnBuscar1.setEnabled(false);
                    }

                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {

                    }
                }
            }

        }.start();
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
        Home = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BgPanel = new javax.swing.JPanel();
        calendario = new rojerusan.RSCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCompromisso = new javax.swing.JTable();
        lblDia = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(790, 470));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setText("Medical Center");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("A sua melhor escolha de consultórios médicos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fullsize_1.png"))); // NOI18N

        BgPanel.setBackground(new java.awt.Color(32, 47, 90));

        calendario.setColorBackground(new java.awt.Color(32, 47, 90));
        calendario.setColorButtonHover(new java.awt.Color(1, 1, 1));
        calendario.setFormatoFecha("dd/MM/yyyy");
        calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioMouseClicked(evt);
            }
        });
        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });
        calendario.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                calendarioVetoableChange(evt);
            }
        });

        tbCompromisso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Horário Inicial", "Horário Final", "Compromisso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCompromisso);

        lblDia.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblDia.setForeground(new java.awt.Color(255, 250, 250));
        lblDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDia.setText("Compromissos de: Hoje");
        lblDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnBuscar1.setBackground(new java.awt.Color(14, 196, 10));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Realizar Consulta");
        btnBuscar1.setBorderPainted(false);
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar1.setFocusPainted(false);
        btnBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseEntered(evt);
            }
        });
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(lblDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDia)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(91, 91, 91))
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.add(Home);

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

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange

    }//GEN-LAST:event_calendarioPropertyChange

    private void calendarioVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_calendarioVetoableChange

    }//GEN-LAST:event_calendarioVetoableChange

    private void calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseClicked
        System.out.println("Teste");
    }//GEN-LAST:event_calendarioMouseClicked

    private void btnBuscar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1MouseExited

    private void btnBuscar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1MouseEntered

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        new TrocarPanel(pnlPrincipal, new realizarConsulta(Integer.parseInt(tbCompromisso.getValueAt(tbCompromisso.getSelectedRow(), 0).toString())));
    }//GEN-LAST:event_btnBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel Home;
    private javax.swing.JButton btnBuscar1;
    private rojerusan.RSCalendar calendario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tbCompromisso;
    // End of variables declaration//GEN-END:variables
}
