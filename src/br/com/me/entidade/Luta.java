/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.entidade;

/**
 *
 * @author eduardo.barbosa
 */
public class Luta {
    
    private String fase;
    private String atleta1;
    private String atleta2;
    private String arbitro;
    private String campeonato;

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getAtleta1() {
        return atleta1;
    }

    public void setAtleta1(String atleta1) {
        this.atleta1 = atleta1;
    }

    public String getAtleta2() {
        return atleta2;
    }

    public void setAtleta2(String atleta2) {
        this.atleta2 = atleta2;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
    
    
    
}
