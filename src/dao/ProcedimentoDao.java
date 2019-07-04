/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Procedimento;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class ProcedimentoDao {
    
       private EntityManager em;

    public ProcedimentoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
        
    public Procedimento getById(int id){
        return em.find(Procedimento.class,id);
    }
    
      public void alterar (Procedimento p) {

        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
    public void salvar(Procedimento p) {

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public List<Procedimento> listar(){
        List<Procedimento> lista = new ArrayList<Procedimento>();
        lista = em.createQuery("from Procedimento procedimento").getResultList();
        
        return lista;
    }
    
    public void remove(Procedimento p){
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
}
