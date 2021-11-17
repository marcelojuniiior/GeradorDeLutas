/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.entidade;

import java.util.Date;

/**
 *
 * @author eedu1
 */
public class Campeonato {
    private Integer id;
    private String nome;
    private String logradouro;
    private String numero;
    private String dtcampeonato;
    private Double valorinscricao;
    private boolean condicao;

    public Campeonato() {
    }

    public Campeonato(String nome, String logradouro, String numero, String dtcampeonato, Double valorinscricao) {
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.dtcampeonato = dtcampeonato;
        this.valorinscricao = valorinscricao;
    }

    public boolean isCondicao() {
        return condicao;
    }

    public void setCondicao(boolean condicao) {
        this.condicao = condicao;
    }

    
     
    
    @Override
    public String toString() {
        return this.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDtcampeonato() {
        return dtcampeonato;
    }

    public void setDtcampeonato(String dtcampeonato) {
        this.dtcampeonato = dtcampeonato;
    }

    public Double getValorinscricao() {
        return valorinscricao;
    }

    public void setValorinscricao(Double valorinscricao) {
        this.valorinscricao = valorinscricao;
    }

   

    
    
    
    
}
