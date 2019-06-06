/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
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
public class Quarto {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int idQuarto;
   
    @Column
    private String descricao;
    
    @ManyToOne 
    private TipoQuarto tipoQuarto;
   

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public TipoQuarto getIdTipoQuarto() {
        return tipoQuarto;
    }

    public void setIdTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Quarto() {
    }

    public Quarto(TipoQuarto tipoQuarto, String descricao) {
        this.tipoQuarto = tipoQuarto;
        this.descricao = descricao;
    }


    
    
}
