/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import servico.Gerenciador;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Doenca;

/**
 *
 * @author sk
 */
public class DoencaDao {

    private EntityManager em;

    public DoencaDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    
    public void salvar(Doenca d) {

        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
    }
    
    public List<Doenca> listar(){
        List<Doenca> lista = new ArrayList<Doenca>();
         lista = em.createQuery("from Doenca d").getResultList();
        
        return lista;
    }
    
    public void remove(Doenca d){
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
    }
    
}
