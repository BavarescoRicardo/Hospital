/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ricardo
 */

@Entity
public class TipoFuncionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoFuncionario;
    private String descricao;

    /*  Erro para lista funcionarios
    @OneToMany(mappedBy = "Funcionario")
    private List<Funcionario> funcionario;
    */

    public int getIdTipoFuncionario() {
        return idTipoFuncionario;
    }

    public void setIdTipoFuncionario(int idTipoFuncionario) {
        this.idTipoFuncionario = idTipoFuncionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoFuncionario() {
    }

    public TipoFuncionario(String descricao) {
        this.descricao = descricao;
    }

    public TipoFuncionario(int idTipoFuncionario, String descricao) {
        this.idTipoFuncionario = idTipoFuncionario;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return idTipoFuncionario + " Cargo " + descricao;
    }
    
    
}
