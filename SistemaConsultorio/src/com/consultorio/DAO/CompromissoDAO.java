/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Compromisso;

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
public class CompromissoDAO extends ExecuteSQL {

    public CompromissoDAO(Connection con) {
        super(con);
    }

    public boolean Cadastrar(Compromisso a) {

        String sql = "INSERT INTO tb_compromissos VALUES(0,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getMedico());
            ps.setString(2, a.getTipo());
            if (a.getPaciente() == 0) {
                ps.setNull(3, java.sql.Types.INTEGER);
            } else {
                ps.setInt(3, a.getPaciente());
            }

            ps.setString(4, a.getData());
            ps.setString(5, a.getHorario_inicial());
            ps.setString(6, a.getHorario_final());
            ps.setString(7, a.getDescricao());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }

    public List<Compromisso> ListarTabela(int idM) {
        List<Compromisso> lista = new ArrayList<>();

        try {
            String consulta = "select * from tb_compromissos "
                    + "where tb_medico_idtb_medico = ?";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ps.setInt(1, idM);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Compromisso a = new Compromisso();

                    a.setId(rs.getInt(1));
                    a.setMedico(rs.getInt(2));
                    a.setTipo(rs.getString(3));
                    a.setPaciente(rs.getInt(4));
                    a.setData(rs.getString(5));
                    a.setHorario_inicial(rs.getString(6));
                    a.setHorario_final(rs.getString(7));
                    a.setDescricao(rs.getString(8));

                    lista.add(a);

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lista;
    }

    public Compromisso Capturar(int id) {
        Compromisso a = new Compromisso();

        try {
            String consulta = "select * from tb_compromissos "
                    + "where idtb_compromissos = " + id;

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    a.setId(rs.getInt(1));
                    a.setMedico(rs.getInt(2));
                    a.setTipo(rs.getString(3));
                    a.setPaciente(rs.getInt(4));
                    a.setData(rs.getString(5));
                    a.setHorario_inicial(rs.getString(6));
                    a.setHorario_final(rs.getString(7));
                    a.setDescricao(rs.getString(8));

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return a;
    }
    
    public boolean Alterar(Compromisso a) {

        String sql = "UPDATE tb_compromissos SET tb_medico_idtb_medico = ?, tipo = ?, tb_paciente_idtb_paciente = ?, data = ?, horario_inicial = ?, horario_final = ?, descricao = ? WHERE idtb_compromissos = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getMedico());
            ps.setString(2, a.getTipo());
            if (a.getPaciente() == 0) {
                ps.setNull(3, java.sql.Types.INTEGER);
            } else {
                ps.setInt(3, a.getPaciente());
            }

            ps.setString(4, a.getData());
            ps.setString(5, a.getHorario_inicial());
            ps.setString(6, a.getHorario_final());
            ps.setString(7, a.getDescricao());
            ps.setInt(8, a.getId());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }
    
    public boolean Excluir(int id) {

        String sql = "DELETE FROM tb_compromissos WHERE idtb_compromissos = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
           

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
