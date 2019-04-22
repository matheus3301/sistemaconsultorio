/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.secretaria;

import com.consultorio.main.TrocarPanel;
import com.consultorio.secretaria.*;

/**
 *
 * @author aluno
 */
public class home extends javax.swing.JPanel {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        menuMedico.setVisible(false);
        menuPaciente.setVisible(false);
        menuAgenda.setVisible(false);
        
        
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
        bgConvenio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        bgPaciente = new javax.swing.JPanel();
        menuPaciente = new javax.swing.JPanel();
        bncCadastrarPaciente = new rojerusan.RSButtonMetro();
        bntConsultarPaciente = new rojerusan.RSButtonMetro();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bgMedico = new javax.swing.JPanel();
        menuMedico = new javax.swing.JPanel();
        rSButtonMetro19 = new rojerusan.RSButtonMetro();
        rSButtonMetro21 = new rojerusan.RSButtonMetro();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        bgAgenda = new javax.swing.JPanel();
        menuAgenda = new javax.swing.JPanel();
        rSButtonMetro26 = new rojerusan.RSButtonMetro();
        rSButtonMetro28 = new rojerusan.RSButtonMetro();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(790, 470));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setText("Medical Center");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("A sua melhor escolha de consultórios médicos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fullsize_1.png"))); // NOI18N

        BgPanel.setBackground(new java.awt.Color(32, 47, 90));

        bgConvenio.setBackground(new java.awt.Color(106, 118, 145));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Buscar Convênios");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Cadastrar Convênios");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgConvenioLayout = new javax.swing.GroupLayout(bgConvenio);
        bgConvenio.setLayout(bgConvenioLayout);
        bgConvenioLayout.setHorizontalGroup(
            bgConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgConvenioLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel12)
                .addGap(125, 125, 125)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgConvenioLayout.setVerticalGroup(
            bgConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgPaciente.setBackground(new java.awt.Color(106, 116, 145));
        bgPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgPaciente.setPreferredSize(new java.awt.Dimension(213, 189));
        bgPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgPacienteMouseEntered(evt);
            }
        });
        bgPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPaciente.setBackground(new java.awt.Color(106, 116, 145));
        menuPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPaciente.setPreferredSize(new java.awt.Dimension(213, 197));
        menuPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPacienteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPacienteMouseEntered(evt);
            }
        });

        bncCadastrarPaciente.setBackground(new java.awt.Color(32, 47, 90));
        bncCadastrarPaciente.setText("Cadastrar Paciente");
        bncCadastrarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bncCadastrarPacienteMouseEntered(evt);
            }
        });
        bncCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncCadastrarPacienteActionPerformed(evt);
            }
        });

        bntConsultarPaciente.setBackground(new java.awt.Color(32, 47, 90));
        bntConsultarPaciente.setText("Consultar Paciente");
        bntConsultarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntConsultarPacienteMouseEntered(evt);
            }
        });
        bntConsultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConsultarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPacienteLayout = new javax.swing.GroupLayout(menuPaciente);
        menuPaciente.setLayout(menuPacienteLayout);
        menuPacienteLayout.setHorizontalGroup(
            menuPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bncCadastrarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(bntConsultarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPacienteLayout.setVerticalGroup(
            menuPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPacienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(bncCadastrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bntConsultarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        bgPaciente.add(menuPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paciente.png"))); // NOI18N
        bgPaciente.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Paciente");
        bgPaciente.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 128, -1));

        bgMedico.setBackground(new java.awt.Color(106, 116, 145));
        bgMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgMedico.setPreferredSize(new java.awt.Dimension(213, 189));
        bgMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgMedicoMouseEntered(evt);
            }
        });
        bgMedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuMedico.setBackground(new java.awt.Color(106, 116, 145));
        menuMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuMedico.setPreferredSize(new java.awt.Dimension(213, 197));
        menuMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMedicoMouseExited(evt);
            }
        });

        rSButtonMetro19.setBackground(new java.awt.Color(32, 47, 90));
        rSButtonMetro19.setText("Consultar Médico");
        rSButtonMetro19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonMetro19MouseEntered(evt);
            }
        });
        rSButtonMetro19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro19ActionPerformed(evt);
            }
        });

        rSButtonMetro21.setBackground(new java.awt.Color(32, 47, 90));
        rSButtonMetro21.setText("Cadastrar Médico");
        rSButtonMetro21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonMetro21MouseEntered(evt);
            }
        });
        rSButtonMetro21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuMedicoLayout = new javax.swing.GroupLayout(menuMedico);
        menuMedico.setLayout(menuMedicoLayout);
        menuMedicoLayout.setHorizontalGroup(
            menuMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro21, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuMedicoLayout.setVerticalGroup(
            menuMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuMedicoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(rSButtonMetro21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(rSButtonMetro19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        bgMedico.add(menuMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Médico");
        bgMedico.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 128, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/medico.png"))); // NOI18N
        bgMedico.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        bgAgenda.setBackground(new java.awt.Color(106, 116, 145));
        bgAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgAgenda.setPreferredSize(new java.awt.Dimension(213, 189));
        bgAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgAgendaMouseEntered(evt);
            }
        });
        bgAgenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuAgenda.setBackground(new java.awt.Color(106, 116, 145));
        menuAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuAgenda.setPreferredSize(new java.awt.Dimension(213, 197));
        menuAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAgendaMouseExited(evt);
            }
        });

        rSButtonMetro26.setBackground(new java.awt.Color(32, 47, 90));
        rSButtonMetro26.setText("Agendar Compromisso");
        rSButtonMetro26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonMetro26MouseEntered(evt);
            }
        });
        rSButtonMetro26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro26ActionPerformed(evt);
            }
        });

        rSButtonMetro28.setBackground(new java.awt.Color(32, 47, 90));
        rSButtonMetro28.setText("Consultar Agenda");
        rSButtonMetro28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonMetro28MouseEntered(evt);
            }
        });
        rSButtonMetro28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAgendaLayout = new javax.swing.GroupLayout(menuAgenda);
        menuAgenda.setLayout(menuAgendaLayout);
        menuAgendaLayout.setHorizontalGroup(
            menuAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro28, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuAgendaLayout.setVerticalGroup(
            menuAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAgendaLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(rSButtonMetro26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(rSButtonMetro28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        bgAgenda.add(menuAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agenda.png"))); // NOI18N
        bgAgenda.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Agenda Médica");
        bgAgenda.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 128, -1));

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addComponent(bgMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(bgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(bgAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bgConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(bgAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
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

    private void bncCadastrarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bncCadastrarPacienteMouseEntered
        menuPaciente.setVisible(true);
    }//GEN-LAST:event_bncCadastrarPacienteMouseEntered

    private void bntConsultarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntConsultarPacienteMouseEntered
        menuPaciente.setVisible(true);
    }//GEN-LAST:event_bntConsultarPacienteMouseEntered

    private void menuPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPacienteMouseExited
        menuPaciente.setVisible(false);
    }//GEN-LAST:event_menuPacienteMouseExited

    private void menuPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPacienteMouseEntered
        menuPaciente.setVisible(true);
    }//GEN-LAST:event_menuPacienteMouseEntered

    private void bgPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgPacienteMouseEntered
        menuPaciente.setVisible(true);
    }//GEN-LAST:event_bgPacienteMouseEntered

    private void rSButtonMetro19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro19MouseEntered
        menuMedico.setVisible(true);
    }//GEN-LAST:event_rSButtonMetro19MouseEntered

    private void rSButtonMetro21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro21MouseEntered
        menuMedico.setVisible(true);
    }//GEN-LAST:event_rSButtonMetro21MouseEntered

    private void rSButtonMetro21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro21ActionPerformed
        new TrocarPanel(pnlPrincipal, new cdMedico());
    }//GEN-LAST:event_rSButtonMetro21ActionPerformed

    private void menuMedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMedicoMouseExited
        menuMedico.setVisible(false);
    }//GEN-LAST:event_menuMedicoMouseExited

    private void bgMedicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMedicoMouseEntered
        menuMedico.setVisible(true);
    }//GEN-LAST:event_bgMedicoMouseEntered

    private void rSButtonMetro26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro26MouseEntered
        menuAgenda.setVisible(true);
    }//GEN-LAST:event_rSButtonMetro26MouseEntered

    private void rSButtonMetro28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro28MouseEntered
        menuAgenda.setVisible(true);
    }//GEN-LAST:event_rSButtonMetro28MouseEntered

    private void menuAgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgendaMouseExited
        menuAgenda.setVisible(false);
    }//GEN-LAST:event_menuAgendaMouseExited

    private void bgAgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgAgendaMouseEntered
        menuAgenda.setVisible(true);
    }//GEN-LAST:event_bgAgendaMouseEntered

    private void rSButtonMetro19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro19ActionPerformed
        new TrocarPanel(pnlPrincipal, new bcMedico());
    }//GEN-LAST:event_rSButtonMetro19ActionPerformed

    private void bncCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncCadastrarPacienteActionPerformed
        new TrocarPanel(pnlPrincipal, new cdPaciente());
    }//GEN-LAST:event_bncCadastrarPacienteActionPerformed

    private void bntConsultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarPacienteActionPerformed
        new TrocarPanel(pnlPrincipal, new bcPaciente());
    }//GEN-LAST:event_bntConsultarPacienteActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        new TrocarPanel(pnlPrincipal, new cdConvenio());
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new TrocarPanel(pnlPrincipal, new bcConvenio());
    }//GEN-LAST:event_jLabel12MouseClicked

    private void rSButtonMetro26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro26ActionPerformed
       new TrocarPanel(pnlPrincipal, new cdCompromisso());
    }//GEN-LAST:event_rSButtonMetro26ActionPerformed

    private void rSButtonMetro28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro28ActionPerformed
       new TrocarPanel(pnlPrincipal, new bcCompromisso());
    }//GEN-LAST:event_rSButtonMetro28ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel bgAgenda;
    private javax.swing.JPanel bgConvenio;
    private javax.swing.JPanel bgMedico;
    private javax.swing.JPanel bgPaciente;
    private rojerusan.RSButtonMetro bncCadastrarPaciente;
    private rojerusan.RSButtonMetro bntConsultarPaciente;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel menuAgenda;
    private javax.swing.JPanel menuMedico;
    private javax.swing.JPanel menuPaciente;
    private javax.swing.JPanel pnlPrincipal;
    private rojerusan.RSButtonMetro rSButtonMetro19;
    private rojerusan.RSButtonMetro rSButtonMetro21;
    private rojerusan.RSButtonMetro rSButtonMetro26;
    private rojerusan.RSButtonMetro rSButtonMetro28;
    // End of variables declaration//GEN-END:variables
}
