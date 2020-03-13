package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author Maisa Honorato
 */
@Entity
@SequenceGenerator(name = "DIARIO_SEQ", sequenceName = "DIARIO_SEQ", initialValue = 1, allocationSize = 1)
public class Diario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_DIARIO")
    int id;
    @Column(name = "DESC_RICAO")
    String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date ano;
    @OneToMany
    Frequencia frequencia;
    @OneToMany
    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    @OneToOne
    Disciplina disciplina;

    @OneToMany
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Diario() {
    }

    public Diario(int id, String descricao, Date ano, Disciplina disciplina) {
        this.id = id;
        this.descricao = descricao;
        this.ano = ano;

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

    public Date getDataletivo() {
        return ano;
    }

    public void setDataletivo(Date ano) {
        this.ano = ano;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
