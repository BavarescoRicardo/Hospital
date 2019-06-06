/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Quarto;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class QuartoDao {
     private EntityManager em;

    public QuartoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    
    public void salvar(Quarto q) {

        em.getTransaction().begin();
        em.persist(q);
        em.getTransaction().commit();
    }
    
    public List<Quarto> listar(){
        List<Quarto> lista = new ArrayList<Quarto>();
         lista = em.createQuery("from Quarto q").getResultList();
        
        return lista;
    }
    
    public void remove(Quarto q){
        
        em.getTransaction().begin();
        em.remove(q);
        em.getTransaction().commit();
    
    }
    
        
    public Quarto getById (int id){
        return em.find(Quarto.class, id);
    }
    
    public void alterar(Quarto q){
        em.getTransaction().begin();
        em.merge(q);
        em.getTransaction().commit();
    }
}
