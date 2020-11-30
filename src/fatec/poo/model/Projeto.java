/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.sql.Date;

/**
 *
 * @author fabio
 */
public class Projeto {
    private int id;
    private String aluno;
    private String nomeBanner;
    private Orientador orientador;
    private Float mediaBanner;
    private Float mediaTg;
    private Float arredondamento;

    public Projeto(int id, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Projeto(String matricula, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getNomeBanner() {
        return nomeBanner;
    }

    public void setNomeBanner(String nomeBanner) {
        this.nomeBanner = nomeBanner;
    }

    public float getMediaBanner() {
        return mediaBanner;
    }

    public void setMediaBanner(float mediaBanner) {
        this.mediaBanner = mediaBanner;
    }

    public float getMediaTg() {
        return mediaTg;
    }

    public void setMediaTg(float mediaTg) {
        this.mediaTg = mediaTg;
    }

    public float getArredondamento() {
        return arredondamento;
    }

    public void setArredondamento(float arredondamento) {
        this.arredondamento = arredondamento;
    }

    public void setAvaliador1(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAvaliador2(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDataBanca(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNota1(float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNota2(float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNotaTg(float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNotaBanner(float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTema(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setOrientador(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
