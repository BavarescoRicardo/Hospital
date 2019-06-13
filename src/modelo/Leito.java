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
import javax.persistence.ManyToOne;

/**
 *
 * @author Ricardo
 */
@Entity
public class Leito {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int idLeito;
    @ManyToOne
    private Quarto quarto;
    @Column
    private String descricao;

    public Leito(Quarto quarto, String descricao) {
        this.quarto = quarto;
        this.descricao = descricao;
    }

    public int getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(int idLeito) {
        this.idLeito = idLeito;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto idQuarto) {
        this.quarto = idQuarto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Leito() {
    }


    
}
