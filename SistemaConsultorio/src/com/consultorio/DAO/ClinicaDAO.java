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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ClinicaDAO extends ExecuteSQL {

    public ClinicaDAO(Connection con) {
        super(con);
    }

    public boolean Alterar(Clinica a) {
        String sql = "UPDATE tb_clinica SET nome = ?, cnpj = ?, telefone = ?, cabecalho = ?, rua = ?, bairro = ?, cep = ?, numero = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getCnpj());
            ps.setString(3, a.getTelefone());
            ps.setString(4, a.getCabecalho());
            ps.setString(5, a.getRua());
            ps.setString(6, a.getBairro());
            ps.setString(7, a.getCep());
            ps.setString(8, a.getNumero());
            
            

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }

    }

    public Clinica Capturar() {
        Clinica a = new Clinica();

        try {
            String consulta = "select * from tb_clinica ";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setCnpj(rs.getString(3));
                    a.setTelefone(rs.getString(4));
                    a.setCabecalho(rs.getString(5));
                    a.setRua(rs.getString(6));
                    a.setBairro(rs.getString(7));
                    a.setCep(rs.getString(8));
                    a.setNumero(rs.getString(9));

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return a;
    }

}
