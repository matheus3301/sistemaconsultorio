/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Convenio;
import com.consultorio.model.Medico;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public List<Convenio> ListarConvenios(String nome, String cnpj) {
        List<Convenio> lista = new ArrayList<>();

        try {
            String consulta = "select * from tb_convenio "
                    + "where nome LIKE '%" + nome + "%' and cnpj LIKE '%" + cnpj + "%'";

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Convenio a = new Convenio();
                    
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setTelefone(rs.getString(3));
                    a.setCnpj(rs.getString(4));
                    a.setRua(rs.getString(5));
                    a.setNumero(rs.getString(6));
                    a.setBairro(rs.getString(7));
                    a.setCep(rs.getString(8));

                    lista.add(a);

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return lista;
    }
    
    public Convenio CapturarConvenio(int id) {
        Convenio a = new Convenio();

        try {
            String consulta = "select * from tb_convenio "
                    + "where idtb_convenio = " + id;

            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                   a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setTelefone(rs.getString(3));
                    a.setCnpj(rs.getString(4));
                    a.setRua(rs.getString(5));
                    a.setNumero(rs.getString(6));
                    a.setBairro(rs.getString(7));
                    a.setCep(rs.getString(8));

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return a;
    }
    
    public boolean Alterar(Convenio a){
        String sql = "UPDATE tb_convenio SET nome = ?, telefone = ?, cnpj = ?, rua = ?, numero = ?, bairro = ?, cep = ? WHERE idtb_convenio = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getTelefone());
            ps.setString(3, a.getCnpj());
            ps.setString(4, a.getRua());
            ps.setString(5, a.getNumero());
            ps.setString(6, a.getBairro());
            ps.setString(7, a.getCep());
            ps.setInt(8, a.getId());
            
            ps.execute();
            
            return true;
            
        }catch(Exception e){
            return false;
        }
    
    }
    
    public boolean Excluir(int id){
        String sql = "DELETE FROM tb_convenio WHERE idtb_convenio = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
        
    }
    
    public List<Convenio> ListarCombo(){
        String sql = "select nome from tb_convenio order by nome";
        List<Convenio> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Convenio a = new Convenio();
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
    
    public int Capturar(String nome){
        String sql = "select idtb_convenio FROM tb_convenio WHERE nome = ?";
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
