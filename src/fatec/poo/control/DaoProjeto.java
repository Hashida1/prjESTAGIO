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
    
    

    
    public void inserir(Projeto projeto){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO tbprojeto(id,nome_aluno,nome_banner,prof_orientador,media_banner,media_tg,arredondamento) VALUES(?,?)");   
            ps.setInt(1,projeto.getId());
            ps.setString(2,projeto.getAluno());
            ps.setString(3,projeto.getNomeBanner());
            ps.setString(4,projeto.getOrientador());
            ps.setDouble(5,projeto.getMediaBanner());
            ps.setDouble(6,projeto.getMediaTg());
            ps.setDouble(7,projeto.getArredondamento());
            
            
            ps.execute();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
    }
    public Projeto consultar (int id){
        Projeto p = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from tbprojeto where id = ?");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()== true){
                p = new Projeto (id, rs.getInt("id"));
                p.setAluno(rs.getString("nome_aluno"));
                p.setArredondamento(rs.getFloat("arredondamento"));
                p.setMediaBanner(rs.getFloat("media_banner"));
                p.setMediaTg(rs.getFloat("media_tg"));
                p.setNomeBanner(rs.getString("nome_banner"));
                p.setOrientador(rs.getString("prof_orientador"));
                
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(p);
    }
    public void alterar(Projeto projeto){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE orientador set nome_aluno=?,nome_banner=?,prof_orientador=?,media_banner=?,media_tg=?,arredondamento = ? where id = ?");   
            ps.setInt(1,projeto.getId());
            ps.setString(2,projeto.getAluno());
            ps.setString(3,projeto.getNomeBanner());
            ps.setString(4,projeto.getOrientador());
            ps.setDouble(5,projeto.getMediaBanner());
            ps.setDouble(6,projeto.getMediaTg());
            ps.setDouble(7,projeto.getArredondamento());
            
            ps.execute();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
    }    
    
        public void excluir(Projeto projeto){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM orientador where id = ?");   
            ps.setInt(1,projeto.getId());
            
            ps.execute();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
    }

}
