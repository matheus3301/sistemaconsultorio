/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.consultorio.model.Secretaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class SecretariaDAO extends ExecuteSQL {

    public SecretariaDAO(Connection con) {
        super(con);
    }

    public boolean Logar(String login, String senha) {
        boolean finalResult = false;

        try {
            String consulta = "select login, senha from tb_secretaria "
                    + "where login = '" + login + "' and senha = '" + senha + "'";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Secretaria a = new Secretaria();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));

                    finalResult = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return finalResult;
    }

    public Secretaria CapturarSecretariaLogin(String login, String senha) {

        Secretaria a = new Secretaria();
        try {
            String consulta = "select login, senha, nome, idtb_secretaria from tb_secretaria "
                    + "where login = '" + login + "' and senha = '" + senha + "'";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    a.setNome(rs.getString(3));
                    a.setId(rs.getInt(4));

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return a;
    }

    public boolean Cadastrar(Secretaria a) {

        String sql = "INSERT INTO tb_secretaria VALUES(0,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getCpf());
            ps.setString(3, a.getRg());

            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getSexo());
            ps.setString(6, a.getLogin());
            ps.setString(7, a.getSenha());
            ps.setString(8, a.getRua());
            ps.setString(9, a.getNumero());
            ps.setString(10, a.getBairro());
            ps.setString(11, a.getCep());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }

    public List<Secretaria> ListarSecretarias(String nome, String crm) {
        List<Secretaria> lista = new ArrayList<>();

        try {
            String consulta = "select * from tb_secretaria "
                    + "where nome LIKE '%" + nome + "%' and cpf LIKE '%" + crm + "%'";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Secretaria a = new Secretaria();

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setCpf(rs.getString(3));
                    a.setRg(rs.getString(4));
                    a.setTelefone(rs.getString(5));
                    a.setSexo(rs.getString(6));
                    a.setLogin(rs.getString(7));
                    a.setSenha(rs.getString(8));
                    a.setRua(rs.getString(9));
                    a.setNumero(rs.getString(10));
                    a.setBairro(rs.getString(11));
                    a.setCep(rs.getString(12));

                    lista.add(a);

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lista;
    }

    public Secretaria CapturarSecretaria(int id) {
        Secretaria a = new Secretaria();

        try {
            String consulta = "select * from tb_secretaria "
                    + "where idtb_secretaria = " + id;

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setCpf(rs.getString(3));
                    a.setRg(rs.getString(4));
                    a.setTelefone(rs.getString(5));
                    a.setSexo(rs.getString(6));
                    a.setLogin(rs.getString(7));
                    a.setSenha(rs.getString(8));
                    a.setRua(rs.getString(9));
                    a.setNumero(rs.getString(10));
                    a.setBairro(rs.getString(11));
                    a.setCep(rs.getString(12));

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return a;
    }
    
    public boolean Alterar(Secretaria a) {

        String sql = "UPDATE tb_secretaria SET nome = ?, cpf = ?, rg = ?, telefone = ?, sexo = ?, login = ?, senha = ?, rua = ?, numero = ?, bairro = ?, cep = ? WHERE idtb_secretaria = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
             ps.setString(1, a.getNome());
            ps.setString(2, a.getCpf());
            ps.setString(3, a.getRg());

            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getSexo());
            ps.setString(6, a.getLogin());
            ps.setString(7, a.getSenha());
            ps.setString(8, a.getRua());
            ps.setString(9, a.getNumero());
            ps.setString(10, a.getBairro());
            ps.setString(11, a.getCep());
            ps.setInt(12, a.getId());

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

        String sql = "DELETE FROM tb_secretaria WHERE idtb_secretaria = ?";

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
