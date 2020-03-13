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
import javax.persistence.OneToOne;

/**
 *
 * @author 201810040005
 */

@Entity
public class Usuario implements Serializable {
     @Id
    @GeneratedValue
    private int id;
    private  String usuario;
    private String senha;
    @OneToOne
    private Perfil perfil;
    @OneToOne
    private Aluno aluno;
    @OneToOne
    private Funcionario funcionario;

    public Usuario() {
    }

    public Usuario(String usuario, String senha, Perfil perfil, Aluno aluno, Funcionario funcionario) {
        this.usuario = usuario;
        this.senha = senha;
        this.perfil = perfil;
        this.aluno = aluno;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
