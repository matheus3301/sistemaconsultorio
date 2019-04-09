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
    public boolean Cadastrar(Convenio a) {

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
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }
    
    
}
