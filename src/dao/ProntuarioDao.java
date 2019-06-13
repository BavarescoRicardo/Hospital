/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Prontuario;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class ProntuarioDao {
    
     private EntityManager em;

    public ProntuarioDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
        
    public Prontuario getById(int id){
        return em.find(Prontuario.class,id);
    }
    
      public void alterar (Prontuario p) {

        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
    public void salvar(Prontuario p) {

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public List<Prontuario> listar(){
        List<Prontuario> lista = new ArrayList<Prontuario>();
         lista = em.createQuery("from Prontuario p").getResultList();
        
        return lista;
    }
    
    public void remove(Prontuario p){
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
}
