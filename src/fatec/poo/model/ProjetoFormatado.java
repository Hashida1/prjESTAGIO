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
public class ProjetoFormatado {
    private String matricula;
    private String aluno;
    private Date dataBanca;
    private String Orientador;
    private String tema;
    private String avaliador1;
    private Float nota1;
    private String avaliador2;
    private Float nota2;
    private Float notaBanner;
    private Float notaTg;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Date getDataBanca() {
        return dataBanca;
    }

    public void setDataBanca(Date dataBanca) {
        this.dataBanca = dataBanca;
    }

    public String getOrientador() {
        return Orientador;
    }

    public void setOrientador(String Orientador) {
        this.Orientador = Orientador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAvaliador1() {
        return avaliador1;
    }

    public void setAvaliador1(String avaliador1) {
        this.avaliador1 = avaliador1;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public String getAvaliador2() {
        return avaliador2;
    }

    public void setAvaliador2(String avaliador2) {
        this.avaliador2 = avaliador2;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNotaBanner() {
        return notaBanner;
    }

    public void setNotaBanner(Float nota_banner) {
        this.notaBanner = nota_banner;
    }

    public Float getNotaTg() {
        return notaTg;
    }

    public void setNotaTg(Float notaTg) {
        this.notaTg = notaTg;
    }
    
    
    
}
