/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Cliente implements Serializable {
    
    private String nome, morada;
    private int telemovel;
    private boolean tipoConta, Genero;

    public Cliente(String nome, String morada, int telemovel, boolean tipoConta, boolean Genero) {
        this.nome = nome;
        this.morada = morada;
        this.telemovel = telemovel;
        this.tipoConta = tipoConta;
        this.Genero = Genero;
    }
     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    public boolean isTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(boolean tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean isGenero() {
        return Genero;
    }

   
            public void setGenero(boolean Genero) {
        this.Genero = Genero;
    }
    
    
     
    
}
