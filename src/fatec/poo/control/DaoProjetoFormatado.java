/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fabio
 */
public class DaoProjetoFormatado {
        private Connection conn;
    
    public DaoProjetoFormatado (Connection conn){
        this.conn = conn;        
    }
    
    public Projeto consultar (String matricula){
        Projeto a = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from banner_2_2019 where matricula = ?");
            
            ps.setString(1, matricula);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                a = new Projeto (matricula, rs.getString("matricula"));
                a.setAluno(rs.getString("nome_aluno"));
                a.setAvaliador1(rs.getString("avaliador1"));
                a.setAvaliador2(rs.getString("avaliador2"));
                a.setDataBanca(rs.getDate("data_banca"));
                a.setNota1(rs.getFloat("nota1"));
                a.setNota2(rs.getFloat("nota2"));
                a.setNotaBanner(rs.getFloat("nota_banner"));
                a.setNotaTg(rs.getFloat("nota_para_tg"));
                a.setOrientador(rs.getString("orientador"));
                a.setTema(rs.getString("tema"));
                
                
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(a);
    }
    

}

