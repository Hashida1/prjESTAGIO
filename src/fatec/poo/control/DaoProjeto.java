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
public class DaoProjeto {
    private Connection conn;
    
    public DaoProjeto (Connection conn){
        this.conn = conn;        
    }
    
    public Projeto consultar (int id){
        Projeto a = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from tbaluno where id = ?");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                a = new Projeto (id, rs.getInt("id"));
                a.setAluno(rs.getString("nome_aluno"));
                a.setArredondamento(rs.getFloat("arredondamento"));
                a.setMediaBanner(rs.getFloat("media_banner"));
                a.setMediaTg(rs.getFloat("media_tg"));
                a.setNomeBanner(rs.getString("nome_banner"));
                a.setOrientador(rs.getString("prof_orientador"));
                
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(a);
    }
    

}
