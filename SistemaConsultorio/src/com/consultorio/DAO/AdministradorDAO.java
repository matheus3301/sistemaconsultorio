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
import com.consultorio.model.Administrador;

/**
 *
 * @author matheus
 */
public class AdministradorDAO extends ExecuteSQL{
    
    public AdministradorDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String login,String senha){
        boolean finalResult = false;
        
        try{
            String consulta = "select login, senha from tb_administrador "
            + "where login = '"+login+"' and senha = '"+senha+"'";
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Administrador a = new Administrador();
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
    
    public Administrador CapturarAdministradorLogin(String login, String senha){
        
        Administrador a = new Administrador();
        try{
            String consulta = "select login, senha, nome, idtb_administrador from tb_administrador "
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

    
}
