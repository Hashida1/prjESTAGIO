/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Orientador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fabio
 */
public class DaoOrientador {
    private Connection conn;
    private int idOrientador;




    
    public DaoOrientador (Connection conn){
        this.conn = conn;        
    }

    public DaoOrientador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void inserir(Orientador orientador){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO orientador(id,orientador) VALUES(?,?)");   
            ps.setInt(1,orientador.getIdOrientador());
            ps.setString(2,orientador.getOrientador());
            
            ps.execute();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
    }
    public Orientador consultar (int id){
        Orientador o = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from orientador where id = ?");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                o = new Orientador (id, rs.getString("orientador"));
                
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(o);
    }
    public void alterar(Orientador orientador){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE orientador set orientador = ? where id = ?");   
            ps.setInt(1,orientador.getIdOrientador());
            ps.setString(2,orientador.getOrientador());
            
            ps.execute();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
    }    
    
        public void excluir(Orientador orientador){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM orientador where id = ?");   
            ps.setInt(1,orientador.getIdOrientador());
            
            ps.execute();
            } catch (SQLException ex){
                System.out.println(ex.toString());
            }
    }

    public Iterable<Orientador> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
