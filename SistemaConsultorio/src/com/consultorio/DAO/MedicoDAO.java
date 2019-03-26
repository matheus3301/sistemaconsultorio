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
import com.consultorio.model.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class MedicoDAO extends ExecuteSQL{
    
    public MedicoDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String login,String senha){
        boolean finalResult = false;
        
        try{
            String consulta = "select login, senha from tb_medico "
            + "where login = '"+login+"' and senha = '"+senha+"'";
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Medico a = new Medico();
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
    
    public boolean Cadastrar(Medico a){
        
        
        String sql = "INSERT INTO tb_medico VALUES(0,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getCpf());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getRg());
            ps.setString(4, a.getCrm());
            ps.setString(5, a.getTelefone());
            ps.setString(6, a.getSexo());
            ps.setString(7, a.getRua());
            ps.setString(8, a.getNumero());
            ps.setString(9, a.getBairro());
            ps.setString(10, a.getCep());
            ps.setString(11, a.getLogin());
            ps.setString(12, a.getSenha());
        
            
            if(ps.executeUpdate() > 0){
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            return false;
        }
        
        
    }
    
    public List<Medico> ListarMedicos(String nome,String crm){
        List<Medico> lista = new ArrayList<>();
        
        try{
            String consulta = "select * from tb_medico "
            + "where nome LIKE '%"+nome+"%' and crm LIKE '%"+crm+"%'";
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Medico a = new Medico();
                    
                    a.setId(rs.getInt(1));
                    a.setCpf(rs.getString(2));
                    a.setNome(rs.getString(3));
                    a.setRg(rs.getString(4));
                    a.setCrm(rs.getString(5));
                    a.setTelefone(rs.getString(6));
                    a.setSexo(rs.getString(7));
                    a.setRua(rs.getString(8));
                    a.setNumero(rs.getString(9));
                    a.setBairro(rs.getString(10));
                    a.setCep(rs.getString(11));
                    a.setLogin(rs.getString(12));
                    a.setSenha(rs.getString(13));
                    
                    lista.add(a);
                    
                }
            }
        } catch(SQLException ex){
            ex.getMessage();
        }
        
        return lista;
    }
    
     public Medico CapturarMedico(int id){
        Medico a = new Medico();
        
        try{
            String consulta = "select * from tb_medico "
            + "where idtb_medico = "+id;
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    
                    
                    a.setId(rs.getInt(1));
                    a.setCpf(rs.getString(2));
                    a.setNome(rs.getString(3));
                    a.setRg(rs.getString(4));
                    a.setCrm(rs.getString(5));
                    a.setTelefone(rs.getString(6));
                    a.setSexo(rs.getString(7));
                    a.setRua(rs.getString(8));
                    a.setNumero(rs.getString(9));
                    a.setBairro(rs.getString(10));
                    a.setCep(rs.getString(11));
                    a.setLogin(rs.getString(12));
                    a.setSenha(rs.getString(13));
                    
                    
                    
                }
            }
        } catch(SQLException ex){
            ex.getMessage();
        }
        
        return a;
    }
}
