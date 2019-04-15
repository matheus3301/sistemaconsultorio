/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Plano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class PlanosDAO extends ExecuteSQL{
    
    public PlanosDAO(Connection con) {
        super(con);
    }
    
    public boolean Cadastrar(Plano a){
        String sql = "INSERT INTO tb_planos VALUES(0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId_convenio());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getDescricao());
            
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
            
            
            
        } catch (SQLException ex) {
           return false;
        }
        
    }
    
}
