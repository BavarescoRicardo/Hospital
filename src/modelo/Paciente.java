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

/**
 *
 * @author Ricardo
 */
@Entity
public class Paciente {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPaciente;
    
    private String NOME;
    private String CPF;
    private String EMAIL;
    private java.sql.Date dataNascimento;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public Paciente() {
    }

    public Paciente(String NOME, String CPF, String EMAIL, Date dataNascimento) {
        this.NOME = NOME;
        this.CPF = CPF;
        this.EMAIL = EMAIL;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return NOME + " CPF " + CPF + "\n EMAIL " + EMAIL + "\n Nascimento " + dataNascimento;
    }
    
    
    
}
