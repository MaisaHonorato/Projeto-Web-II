/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Maisa Honorato
 */

@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    private String cpf;
    private String nome;
    private String datanasc;
    private Status status;

    @OneToOne
    private Frequencia frequencia;

    @OneToOne(cascade = CascadeType.REFRESH)
    private Endereco end;

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public Aluno() {
    }

    public Aluno(String nome, String datanasc, String ensino, String serie, String turma, String turno) {
        this.nome = nome;
        this.datanasc = datanasc;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

}
