/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Medico;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class MedicoDao {
    
    private EntityManager em;

    public MedicoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    
    public void salvar(Medico m) {

        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
    }
    
    public List<Medico> listar(){
        List<Medico> lista = new ArrayList<Medico>();
         lista = em.createQuery("from Medico m").getResultList();
        
        return lista;
    }
    
    public void remove(Medico m){
        
        em.getTransaction().begin();
        em.remove(m);
        em.getTransaction().commit();
    
    }
    
        
    public Medico getById (int id){
        return em.find(Medico.class, id);
    }
    
    public void alterar(Medico m){
        em.getTransaction().begin();
        em.merge(m);
        em.getTransaction().commit();
    }
}
