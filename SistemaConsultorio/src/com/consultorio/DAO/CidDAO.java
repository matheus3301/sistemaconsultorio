/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import com.consultorio.model.Cid;
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
public class CidDAO extends ExecuteSQL {
    
    public CidDAO(Connection con) {
        super(con);
    }
    
    public List<Cid> ListarTabelaCid(String busca) {
        List<Cid> tabela = new ArrayList<>();
        
        try {
            String consulta = "select * from tb_cid WHERE descricaoCid LIKE '%"+busca+"%'";
            
            PreparedStatement ps = getCon().prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Cid a = new Cid();
                    a.setId(rs.getString(1));
                    a.setDescricao(rs.getString(2));
                    
                    
                    tabela.add(a);
                    
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        return tabela;
    }
    
}
