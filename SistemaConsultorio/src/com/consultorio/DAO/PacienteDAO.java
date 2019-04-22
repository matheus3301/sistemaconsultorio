/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Paciente;
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
public class PacienteDAO extends ExecuteSQL {

    public PacienteDAO(Connection con) {
        super(con);
    }

    public boolean Cadastrar(Paciente a) {

        String sql = "INSERT INTO tb_paciente VALUES(0,?,?,?,?,?,0,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getTelefone());
            ps.setString(3, a.getCpf());
            ps.setString(4, a.getRg());
            ps.setString(5, a.getSexo());
            ps.setString(6, a.getRua());
            ps.setString(7, a.getNumero());
            ps.setString(8, a.getBairro());
            ps.setString(9, a.getCep());
            ps.setInt(10, a.getIdPlanoConvenio());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }

    public List<Paciente> ListarPacientes(String nome, String crm) {
        List<Paciente> lista = new ArrayList<>();

        try {
            String consulta = "select * from tb_paciente "
                    + "where nome LIKE '%" + nome + "%' and cpf LIKE '%" + crm + "%'";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Paciente a = new Paciente();

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setTelefone(rs.getString(3));
                    a.setCpf(rs.getString(4));
                    a.setRg(rs.getString(5));
                    a.setSexo(rs.getString(6));

                    a.setRua(rs.getString(8));
                    a.setNumero(rs.getString(9));
                    a.setBairro(rs.getString(10));
                    a.setCep(rs.getString(11));
                    a.setIdPlanoConvenio(rs.getInt(12));

                    lista.add(a);

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lista;
    }

    public Paciente Capturar(int id) {
        Paciente a = new Paciente();

        try {
            String consulta = "select * from tb_paciente "
                    + "where idtb_paciente = " + id;

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setTelefone(rs.getString(3));
                    a.setCpf(rs.getString(4));
                    a.setRg(rs.getString(5));
                    a.setSexo(rs.getString(6));

                    a.setRua(rs.getString(8));
                    a.setNumero(rs.getString(9));
                    a.setBairro(rs.getString(10));
                    a.setCep(rs.getString(11));
                    a.setIdPlanoConvenio(rs.getInt(12));

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return a;
    }
    
    public boolean Alterar(Paciente a) {

        String sql = "UPDATE tb_paciente SET nome = ?, telefone = ?, cpf = ?, rg = ?, sexo = ?, rua = ?, numero = ?, bairro = ?, cep = ?, tb_planos_idtb_planos = ? WHERE idtb_paciente = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getTelefone());
            ps.setString(3, a.getCpf());
            ps.setString(4, a.getRg());
            ps.setString(5, a.getSexo());
            ps.setString(6, a.getRua());
            ps.setString(7, a.getNumero());
            ps.setString(8, a.getBairro());
            ps.setString(9, a.getCep());
            ps.setInt(10, a.getIdPlanoConvenio());
            ps.setInt(11, a.getId());

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

        String sql = "DELETE FROM tb_paciente WHERE idtb_paciente = ?";

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
     
     public List<Paciente> ListarCombo(){
        String sql = "select nome from tb_paciente order by nome";
        List<Paciente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Paciente a = new Paciente();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }
                
                return lista;
            }else{
                return lista;
            }
        }catch(SQLException e){
            return null;
        }
    }
     
      public int CapturarId(String nome){
        String sql = "select idtb_paciente FROM tb_paciente WHERE nome = ?";
        int id = -1;
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                id = rs.getInt(1);
            }
            
            return id;
            
        } catch (SQLException ex) {
           return id;
        }
        
        
        
        
    }
}
