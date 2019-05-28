/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ricardo
 */
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFuncionario;
    private String NOME,CPF,EMAIL,CONTATO;
    private java.sql.Date dataNascimento;
    
    @ManyToOne
    private TipoFuncionario tipoFuncionario;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNOME() {
        return NOME;
    }
    
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCONTATO() {
        return CONTATO;
    }

    public void setCONTATO(String CONTATO) {
        this.CONTATO = CONTATO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Funcionario() {
    }

    public Funcionario(TipoFuncionario tipoFuncionario, String NOME, String CPF, String EMAIL, java.sql.Date dataNascimento) {
        this.tipoFuncionario = tipoFuncionario;
        this.NOME = NOME;
        this.CPF = CPF;
        this.EMAIL = EMAIL;
        this.dataNascimento = dataNascimento;
    }

  
    
}
