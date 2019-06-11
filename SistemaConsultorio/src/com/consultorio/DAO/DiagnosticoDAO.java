/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author matheus
 */
public class DiagnosticoDAO extends ExecuteSQL{
    
    public DiagnosticoDAO(Connection con) {
        super(con);
    }
    
    public boolean InserirDiagnostico(Diagnostico a){
        String sql = "INSERT INTO tb_diagnostico VALUES(0,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId_paciente());
            ps.setString(2, a.getDiagnostico());
            
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
