/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Orientador;
import fatec.poo.model.Projeto;
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
    
    public Orientador consultar (int id){
        Orientador o = null;
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * from tbaluno where id = ?");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                o = new Orientador (idOrientador, rs.getInt("id"));
                o.setOrientador(rs.getString("prof_orientador"));
                
            }
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(o);
    }

    public Iterable<Orientador> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
