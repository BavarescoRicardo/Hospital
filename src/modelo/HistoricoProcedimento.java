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
public class HistoricoProcedimento {
    private int idHistoricoProcedimento,idResponsavel,idMedicamento;
    private java.sql.Date data;
    private String observacao;

    public HistoricoProcedimento() {
    }

    public HistoricoProcedimento(int idResponsavel, int idMedicamento, Date data, String observacao) {
        this.idResponsavel = idResponsavel;
        this.idMedicamento = idMedicamento;
        this.data = data;
        this.observacao = observacao;
    }

    public int getIdHistoricoProcedimento() {
        return idHistoricoProcedimento;
    }

    public void setIdHistoricoProcedimento(int idHistoricoProcedimento) {
        this.idHistoricoProcedimento = idHistoricoProcedimento;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
