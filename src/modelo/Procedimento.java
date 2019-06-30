/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import javax.persistence.Column;
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
public class Procedimento {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int idProcedimento;
    @ManyToOne
    private Medicamento medicamento;
    @ManyToOne
    private Prontuario prontuario;
    @Column
    private java.sql.Date dataInicial;
    @Column
    private java.sql.Date dataFinal;
    @Column
    private String descricao;
    @Column
    private String observacao;

    
    public Procedimento() {
    }

    public Procedimento(Medicamento medicamento, Prontuario prontuario, Date dataInicial, String descricao) {
        this.medicamento = medicamento;
        this.prontuario = prontuario;
        this.dataInicial = dataInicial;
        this.descricao = descricao;
    }

    public int getIdProcedimento() {
        return idProcedimento;
    }

    public void setIdProcedimento(int idProcedimento) {
        this.idProcedimento = idProcedimento;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
