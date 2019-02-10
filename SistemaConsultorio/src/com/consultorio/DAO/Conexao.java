/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    public static Connection AbrirConexao(){
        Connection connection = null;
        
        try {
 
            // Carregando o JDBC Driver padrão

            String driverName = "com.mysql.jdbc.Driver";                        

            Class.forName(driverName);



            // Configurando a nossa conexão com um banco de dados//
 
            String serverName = "localhost";    //caminho do servidor do BD
 
            String mydatabase = "db_consultorio";        //nome do seu banco de dados
 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
 
            String username = "root";        //nome de um usuário de seu BD      
 
            String password = "";      //sua senha de acesso
 
            connection = DriverManager.getConnection(url, username, password);
 
  
 
            
 
  
 
            return connection;
 
  
 
        } catch (ClassNotFoundException e) {  //Driver não encontrado
 
  
 
            System.out.println("O driver expecificado nao foi encontrado.");
 
            return null;
 
        } catch (SQLException e) {
 
//Não conseguindo se conectar ao banco
 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
 
            return null;
 
        }
  
 
    
    }
    
    public static void FecharConexao(Connection con){
        try{
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
