/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Clinica;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class ClinicaDAO extends ExecuteSQL{
    
    public ClinicaDAO(Connection con) {
        super(con);
    }
    
    
    public boolean Alterar(Clinica a ){
        String sql = "UPDATE tb_clinica SET nome = ?, cnpj = ?, telefone = ?, cabecalho = ?, rua = ?, bairro = ?, cep = ?, numero = ? ";
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getCnpj());
            ps.setString(3, a.getTelefone());
            ps.setString(4, a.getCabecalho());
            ps.setString(5, a.getRua());
            ps.setString(6, a.getBairro());
            ps.setString(6, a.getCep());
            ps.setString(8, a.getNumero());
            
            return ps.execute();
        } catch (SQLException ex) {
            return false;
        }
        
        
    }
}
