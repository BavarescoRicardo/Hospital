/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sk
 */
public class Gerenciador {
        
    private EntityManager em;
    private static Gerenciador instacia = null;
    
    public static Gerenciador getInstancia(){
        if (instacia == null){
            instacia = new  Gerenciador();
        }
        
        return instacia;
        
    }
    
    private Gerenciador(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persis");
        em = emf.createEntityManager();
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
