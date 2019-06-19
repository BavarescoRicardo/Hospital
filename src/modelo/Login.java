/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author blank
 */
@Entity
public class Login {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int id;
    private static String usuario;
    private static  String senha;

    public Login() {
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Login.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Login.senha = senha;
    }
    
    
    
}
