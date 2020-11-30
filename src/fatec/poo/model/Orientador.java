/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author fabio
 */
public class Orientador {
    private Integer idOrientador;
    private String orientador;

    public Orientador(int id, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Integer getIdOrientador() {
        return idOrientador;
    }

    public void setIdOrientador(Integer idOrientador) {
        this.idOrientador = idOrientador;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
    
    @Override
    public String toString(){
        return getOrientador();
    }
}
