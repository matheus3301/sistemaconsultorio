/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.consultorio.model.Secretaria;

/**
 *
 * @author matheus
 */
public class SecretariaDAO extends ExecuteSQL{
    
    public SecretariaDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String login,String senha){
        boolean finalResult = false;
        
        try{
            String consulta = "select login, senha from tb_secretaria "
            + "where login = '"+login+"' and senha = '"+senha+"'";
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Secretaria a = new Secretaria();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    
                    finalResult = true;
                }
            }
        } catch(SQLException ex){
            ex.getMessage();
        }
        
        return finalResult;
    }
    
    public Secretaria CapturarSecretariaLogin(String login, String senha){
        
        Secretaria a = new Secretaria();
        try{
            String consulta = "select login, senha, nome, idtb_secretaria from tb_secretaria "
            + "where login = '"+login+"' and senha = '"+senha+"'";
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    a.setNome(rs.getString(3));
                    a.setId(rs.getInt(4));
                    
                    
                }
            }
        } catch(SQLException ex){
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
}
