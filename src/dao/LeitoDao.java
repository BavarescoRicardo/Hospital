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

import modelo.Leito;

/**
 *
 * @author sk
 */
public class LeitoDao {

    private EntityManager em;

    public LeitoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    public Leito getById(int id){
        return em.find(Leito.class,id);
    }
    
      public void alterar(Leito l) {

        em.getTransaction().begin();
        em.merge(l);
        em.getTransaction().commit();
    }
            
    public void salvar(Leito l) {

        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
    
    public List<Leito> listar(){
        List<Leito> lista = new ArrayList<Leito>();
         lista = em.createQuery("from Leito l").getResultList();
        
        return lista;
    }
    
    public void remove(Leito l){
        em.getTransaction().begin();
        em.remove(l);
        em.getTransaction().commit();
    }
    
}
