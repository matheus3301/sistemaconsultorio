/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Convenio;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author aluno
 */
public class ConvenioDAO extends ExecuteSQL {

    public ConvenioDAO(Connection con) {
        super(con);
    }
    public int Cadastrar(Convenio a) {
        
        int id = -1;

        String sql = "INSERT INTO tb_convenio VALUES(0,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getTelefone());
            ps.setString(3, a.getCnpj());
            ps.setString(4, a.getRua());
            ps.setString(5, a.getNumero());
            ps.setString(6, a.getBairro());
            ps.setString(7, a.getCep());
            
            

            if (ps.executeUpdate() > 0) {
                String consulta = "SELECT idtb_convenio FROM tb_convenio WHERE nome = ?";
                PreparedStatement ps1 = getCon().prepareStatement(consulta);
                ps1.setString(1, a.getNome());
                
                ResultSet rs = ps1.executeQuery();
                
                while(rs.next()){
                    id = rs.getInt(1);
                }
                
            } else {
                return id;
            }

        } catch (SQLException ex) {
            return id;
        }
        return id;
    }
    
    
}
