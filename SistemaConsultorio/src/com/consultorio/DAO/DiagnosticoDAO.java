/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Diagnostico> ListarDiagnostico(int idPaciente) {
        List<Diagnostico> lista = new ArrayList<>();

        try {
            String consulta = "select * from tb_diagnostico "
                    + "where tb_paciente_idtb_paciente = ?";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            
            ps.setInt(1, idPaciente);
            
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Diagnostico a = new Diagnostico();

                    a.setId(rs.getInt(1));
                    a.setId_paciente(rs.getInt(2));
                    a.setDiagnostico(rs.getString(3));

                    lista.add(a);

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lista;
    }
    
}
