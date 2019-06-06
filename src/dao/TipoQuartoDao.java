/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.TipoQuarto;
import servico.Gerenciador;

/**
 *
 * @author blank
 */

public class TipoQuartoDao {
    
     private EntityManager em;

    public TipoQuartoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    public TipoQuarto getById(int id){
        return em.find(TipoQuarto.class,id);
    }
    
      public void alterar(TipoQuarto d) {

        em.getTransaction().begin();
        em.merge(d);
        em.getTransaction().commit();
    }
            
    public void salvar(TipoQuarto d) {

        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
    }
    
    public List<TipoQuarto> listar(){
        List<TipoQuarto> lista = new ArrayList<TipoQuarto>();
         lista = em.createQuery("from TipoQuarto d").getResultList();
        
        return lista;
    }
    
    public void remove(TipoQuarto d){
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
    }

}
