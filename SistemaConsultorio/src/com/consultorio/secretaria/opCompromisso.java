/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.secretaria;

import com.consultorio.DAO.CompromissoDAO;
import com.consultorio.DAO.Conexao;
import com.consultorio.DAO.ConvenioDAO;
import com.consultorio.DAO.MedicoDAO;
import com.consultorio.DAO.PacienteDAO;
import com.consultorio.DAO.PlanosDAO;
import com.consultorio.main.ErrorMsg;
import com.consultorio.main.RightMsg;
import com.consultorio.model.Compromisso;
import com.consultorio.model.Convenio;
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
public class opCompromisso extends javax.swing.JPanel {
    
    int conv;
    ButtonGroup sexo;
    
    public boolean VerificarCampos() {
        if (comboMedico.getSelectedItem().toString().equals("Selecione...")  || !(rdEx.isSelected() || rdCon.isSelected()) || lblData.getFechaSeleccionada().equals("") ||
             lblInicial.getText().equals("") || lblFinal.getText().equals("")  || lblDesc.getText().equals("") ) {
            new ErrorMsg().ReceberMsg("Nenhum Campo pode estar vazio!");
            return false;
        } else {
            
            return true;
            
        }
    }
    
    public void LimparCampos(){
        
        
        rdCon.setSelected(false);
        rdEx.setSelected(false);
        
        
        comboMedico.setSelectedIndex(0);
        comboPaciente.setSelectedIndex(0);
        
        lblInicial.setText("");
        lblFinal.setText("");
        
        
        lblData.setLimpiarFecha(true);
        
        lblDesc.setText("");
        
        
        
        
    }

    /**
     * Creates new form home
     */
    public opCompromisso(Compromisso a) {
        initComponents();
        
        sexo = new ButtonGroup();
        sexo.add(rdCon);
        sexo.add(rdEx);
        
        AtualizaComboPaciente();
        AtualizaComboMedico();
        
        comboPaciente.setVisible(false);
        txtP.setVisible(false);
        
        lblData.setTextoFecha(a.getData());
        lblInicial.setText(a.getHorario_inicial());
        lblFinal.setText(a.getHorario_final());
        
        if (a.getTipo().equals("Externo")) {
            rdEx.setSelected(true);
        }else{
            rdCon.setSelected(true);
        }
        
        
        
    }
    
    
    
    private void AtualizaComboMedico() {
        comboMedico.removeAllItems();
        Connection con = Conexao.AbrirConexao();
        MedicoDAO sql = new MedicoDAO(con);
        List<Medico> lista = new ArrayList<>();
        lista = sql.ListarCombo();
        comboMedico.addItem("Selecione...");
        
        for (Medico b : lista) {
            comboMedico.addItem(b.getNome());
        }
        
        Conexao.FecharConexao(con);
    }
    
    private void AtualizaComboPaciente() {
        comboPaciente.removeAllItems();
        
        Connection con = Conexao.AbrirConexao();
        PacienteDAO sql = new PacienteDAO(con);
        List<Paciente> lista = new ArrayList<>();
        lista = sql.ListarCombo();
        comboPaciente.addItem("Selecione...");
        
        for (Paciente b : lista) {
            comboPaciente.addItem(b.getNome());
        }
        
        Conexao.FecharConexao(con);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rdEx = new javax.swing.JRadioButton();
        rdCon = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        comboMedico = new javax.swing.JComboBox<>();
        txtP = new javax.swing.JLabel();
        comboPaciente = new javax.swing.JComboBox<>();
        lblData = new rojerusan.RSDateChooser();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDesc = new javax.swing.JTextArea();
        lblFinal = new javax.swing.JFormattedTextField();
        lblInicial = new javax.swing.JFormattedTextField();
        btnCadastrar1 = new javax.swing.JButton();
        btnCadastrar2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(880, 470));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Alterar Compromisso");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fullsize_1.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Médico");

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Data");

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tipo");

        rdEx.setBackground(new java.awt.Color(32, 47, 90));
        rdEx.setForeground(new java.awt.Color(254, 254, 254));
        rdEx.setText("Externo");

        rdCon.setBackground(new java.awt.Color(32, 47, 90));
        rdCon.setForeground(new java.awt.Color(254, 254, 254));
        rdCon.setText("Consulta");
        rdCon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdConStateChanged(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Hora Inicial");

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Hora Final");

        btnCadastrar.setBackground(new java.awt.Color(223, 57, 51));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Excluir Compromisso");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        comboMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMedicoItemStateChanged(evt);
            }
        });
        comboMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicoActionPerformed(evt);
            }
        });

        txtP.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtP.setForeground(new java.awt.Color(204, 204, 204));
        txtP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtP.setText("Paciente");

        comboPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPacienteItemStateChanged(evt);
            }
        });

        lblData.setColorBackground(new java.awt.Color(215, 215, 215));
        lblData.setFormatoFecha("dd/MM/yyyy");
        lblData.setPlaceholder("Selecione a Data...");

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Descrição");

        lblDesc.setColumns(20);
        lblDesc.setRows(5);
        jScrollPane1.setViewportView(lblDesc);

        try {
            lblFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lblFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFinalActionPerformed(evt);
            }
        });

        try {
            lblInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastrar1.setBackground(new java.awt.Color(223, 57, 51));
        btnCadastrar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar1.setText("Salvar Alterações");
        btnCadastrar1.setBorderPainted(false);
        btnCadastrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar1.setFocusPainted(false);
        btnCadastrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrar1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrar1MouseEntered(evt);
            }
        });
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });

        btnCadastrar2.setBackground(new java.awt.Color(223, 57, 51));
        btnCadastrar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar2.setText("Buscar Compromissos");
        btnCadastrar2.setBorderPainted(false);
        btnCadastrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar2.setFocusPainted(false);
        btnCadastrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrar2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrar2MouseEntered(evt);
            }
        });
        btnCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdCon)
                                .addGap(46, 46, 46)
                                .addComponent(rdEx)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFinal)
                                    .addComponent(lblInicial)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel19)
                        .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(rdEx)
                    .addComponent(rdCon)
                    .addComponent(lblInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(comboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP)
                    .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(112, 112, 112)
                .addComponent(jLabel3))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(new Color(223, 57, 51));
        btnCadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setBackground(new Color(235, 235, 235));
        btnCadastrar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(VerificarCampos()){
            Compromisso a = new Compromisso();
            a.setData(lblData.getFechaSeleccionada());
            a.setDescricao(lblDesc.getText());
            a.setHorario_final(lblFinal.getText());
            a.setHorario_inicial(lblInicial.getText());
            
            Connection con = Conexao.AbrirConexao();
            MedicoDAO sqlM = new MedicoDAO(con);            
            PacienteDAO sqlP = new PacienteDAO(con);
            
            CompromissoDAO sqlC = new CompromissoDAO(con);
            
            
            
            a.setMedico(sqlM.CapturarId(comboMedico.getSelectedItem().toString()));
            
            if (rdCon.isSelected()) {
                a.setTipo("Consulta");
                if (comboPaciente.getSelectedItem().toString().equals("Selecione...")) {
                    new ErrorMsg().ReceberMsg("Selecione um Paciente");
                }else{
                    a.setPaciente(sqlP.CapturarId(comboPaciente.getSelectedItem().toString()));
                    sqlC.Cadastrar(a);
                    
                    
                }
            }else{
                a.setTipo("Externo");
                sqlC.Cadastrar(a);
            }
            
            new RightMsg().ReceberMsg("Compromisso Marcado!");
            LimparCampos();
            
        }

            
        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void comboMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMedicoItemStateChanged
        

    }//GEN-LAST:event_comboMedicoItemStateChanged

    private void comboMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMedicoActionPerformed

    private void comboPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPacienteItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPacienteItemStateChanged

    private void lblFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFinalActionPerformed

    private void rdConStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdConStateChanged
        if (rdCon.isSelected()) {
            comboPaciente.setVisible(true);
            txtP.setVisible(true);
        }else{
            txtP.setVisible(false);
            comboPaciente.setVisible(false);
        }
    }//GEN-LAST:event_rdConStateChanged

    private void btnCadastrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar1MouseExited

    private void btnCadastrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar1MouseEntered

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    private void btnCadastrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar2MouseExited

    private void btnCadastrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar2MouseEntered

    private void btnCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnCadastrar2;
    private javax.swing.JComboBox<String> comboMedico;
    private javax.swing.JComboBox<String> comboPaciente;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSDateChooser lblData;
    private javax.swing.JTextArea lblDesc;
    private javax.swing.JFormattedTextField lblFinal;
    private javax.swing.JFormattedTextField lblInicial;
    private javax.swing.JRadioButton rdCon;
    private javax.swing.JRadioButton rdEx;
    private javax.swing.JLabel txtP;
    // End of variables declaration//GEN-END:variables
}
