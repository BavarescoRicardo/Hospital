/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ricardo
 */
@Entity
public class Medicamento {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int idMedicamento;
    @Column
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Medicamento() {
    }

    public Medicamento(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medicamento " + " " + nome + "\n";
    }
    
    
}
