/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Maisa Honorato
 */
@Entity
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_DISCIPLINA")
    int id;
    String nome;
    int ano;
    int quantaula;
    String professor;
     @OneToMany
    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    
    @OneToMany
    ArrayList<Frequencia> frequencias = new ArrayList<>();
    
    @OneToMany
    ArrayList<Aluno> alunos = new ArrayList<>();
    
    @OneToMany
    ArrayList<Professor> professores = new ArrayList<>();
    
   

    public Disciplina() {
    }

    public Disciplina(String nome, int ano, int quantaula, String professor) {
        this.nome = nome;
        this.ano = ano;
        this.quantaula = quantaula;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoletivo() {
        return ano;
    }

    public void setAnoletivo(int ano) {
        this.ano = ano;
    }

    public int getQuantaula() {
        return quantaula;
    }

    public void setQuantaula(int quantaula) {
        this.quantaula = quantaula;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    
}
