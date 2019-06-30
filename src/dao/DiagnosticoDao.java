/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Diagnostico;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class DiagnosticoDao {
    
    
    private EntityManager em;

    public DiagnosticoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    public Diagnostico getById(int id){
        return em.find(Diagnostico.class,id);
    }
    
      public void alterar(Diagnostico d) {

        em.getTransaction().begin();
        em.merge(d);
        em.getTransaction().commit();
    }
            
    public void salvar(Diagnostico d) {

        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
    }
    
    public List<Diagnostico> listar(){
        List<Diagnostico> lista = new ArrayList<Diagnostico>();
         lista = em.createQuery("from Doenca d").getResultList();
        
        return lista;
    }
    
    public void remove(Diagnostico d){
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
    }
    
    
}
