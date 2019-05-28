/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ricardo
 */
public class TipoQuarto {
    private int idTipoQuarto;
    private String nome;

    public int getIdTipoQuarto() {
        return idTipoQuarto;
    }

    public void setIdTipoQuarto(int idTipoQuarto) {
        this.idTipoQuarto = idTipoQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoQuarto() {
    }

    public TipoQuarto(String nome) {
        this.nome = nome;
    }

    public TipoQuarto(int idTipoQuarto, String nome) {
        this.idTipoQuarto = idTipoQuarto;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return idTipoQuarto + "  " + nome;
    }
    
    
}
