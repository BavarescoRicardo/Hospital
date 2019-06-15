/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Login;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class LoginDao {
        private EntityManager em;

    public LoginDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    public Login getById(int id){
        return em.find(Login.class,id);
    }

    
    public List<Login> listar(){
        List<Login> lista = new ArrayList<Login>();
         lista = em.createQuery("from Login l").getResultList();
        
        return lista;
    }
}
  
