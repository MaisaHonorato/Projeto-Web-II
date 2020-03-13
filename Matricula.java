/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author 201810040005
 */

@Entity
public class Matricula implements Serializable {
     @Id
     @GeneratedValue
     private int id;
     private String descricao;
     private String nome;
     private Status status;
     private Serie serie; 

    public Matricula() {
    }

    public Matricula( String descricao, String nome, Status status, Serie serie) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.status = status;
        this.serie = serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
     
     
}
