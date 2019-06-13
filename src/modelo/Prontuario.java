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
import javax.persistence.Temporal;


/**
 *
 * @author Ricardo
 */

@Entity
public class Prontuario {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int idProntuario;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Leito leito;
    @ManyToOne
    private Medico medico;
    // @Temporal
    private java.sql.Date dataEntrada;
    private java.sql.Date dataAlta;

    public int getProntuario() {
        return idProntuario;
    }

    public void setProntuario(int prontuario) {
        this.idProntuario = prontuario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public Prontuario() {
    }

    public Prontuario(int prontuario, Paciente paciente, Leito leito, Medico medico, Date dataEntrada) {
        this.idProntuario = prontuario;
        this.paciente = paciente;
        this.leito = leito;
        this.medico = medico;
        this.dataEntrada = dataEntrada;
    }
    
    


    
}
