/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Date;


/**
 *
 * @author Ricardo
 */
public class Prontuario {
    private Prontuario prontuario;
    private Paciente paciente;
    private Leito leito;
    private Medico medico;
    private java.sql.Date dataEntrada,dataAlta;

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
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

    public Prontuario(Prontuario prontuario, Paciente paciente, Leito leito, Medico medico, Date dataEntrada) {
        this.prontuario = prontuario;
        this.paciente = paciente;
        this.leito = leito;
        this.medico = medico;
        this.dataEntrada = dataEntrada;
    }
    
    


    
}
