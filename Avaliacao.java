/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Maisa Honorato
 */
@Entity
public class Avaliacao implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String nome;
    double nota;
    String situacao;
    @ManyToOne
    Disciplina disciplina;
    @OneToOne
    Aluno aluno;

    

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Avaliacao() {
    }

    public Avaliacao(double nota, String situacao, Disciplina Disciplina, Aluno aluno) {
        this.nota = nota;
        this.situacao = situacao;
        this.aluno = aluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
