/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Convenio;
import com.consultorio.model.Plano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class PlanosDAO extends ExecuteSQL {

    public PlanosDAO(Connection con) {
        super(con);
    }

    public boolean Cadastrar(Plano a) {
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

    public List<Plano> ListarPlanos(int idconvenio) {
        List<Plano> lista = new ArrayList<>();

        try {
            String consulta = "select * from tb_planos "
                    + "where tb_convenio_idtb_convenio = " + idconvenio;

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Plano a = new Plano();

                    a.setId(rs.getInt(1));
                    a.setId_convenio(rs.getInt(2));
                    a.setNome(rs.getString(3));
                    a.setDescricao(rs.getString(4));

                    lista.add(a);

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lista;
    }

    public boolean Excluir(int id) {
        String sql = "DELETE FROM tb_planos WHERE idtb_planos = " + id;

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            return ps.execute();
        } catch (SQLException ex) {
            return false;
        }

    }

    public boolean Alterar(Plano a) {
        String sql = "UPDATE tb_planos SET nome = ?, descricao = ? WHERE idtb_planos = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getDescricao());
            ps.setInt(3, a.getId());

            return ps.execute();
        } catch (SQLException ex) {
            return false;
        }

    }

    public boolean ExcluirTodos(int idconvenio) {
        String sql = "DELETE FROM tb_planos WHERE tb_convenio_idtb_convenio = " + idconvenio;

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public List<Plano> ListarComboPorConvenio(int idConv) {
        String sql = "select nome from tb_planos WHERE tb_convenio_idtb_convenio = ? order by nome";
        List<Plano> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, idConv);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Plano a = new Plano();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }

                return lista;
            } else {
                return lista;
            }
        } catch (SQLException e) {
            return null;
        }
    }

    public int Capturar(String nome, int idConv) {
        String sql = "select idtb_planos FROM tb_planos WHERE nome = ? AND tb_convenio_idtb_convenio = ?";
        int id = -1;

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setInt(2, idConv);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);
            }

            return id;

        } catch (SQLException ex) {
            return id;
        }

    }

    public Plano CapturarAlt(int id) {

        String sql = "SELECT tb_planos.nome, tb_convenio.nome FROM tb_planos INNER JOIN tb_convenio ON tb_planos.tb_convenio_idtb_convenio = tb_convenio.idtb_convenio WHERE idtb_planos = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Plano a = new Plano();
            while (rs.next()) {
                a.setNome(rs.getString(1));
                a.setNome_conv(rs.getString(2));
            }

            return a;

        } catch (SQLException ex) {
            return null;
        }

    }
}
