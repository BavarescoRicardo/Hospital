/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Medicamento;
import servico.Gerenciador;

/**
 *
 * @author sk
 */
public class MedicamentoDao {
   
    private EntityManager em;

    public MedicamentoDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
        
    public Medicamento getById(int id){
        return em.find(Medicamento.class,id);
    }
    
      public void alterar (Medicamento m) {

        em.getTransaction().begin();
        em.merge(m);
        em.getTransaction().commit();
    }
    
    public void salvar(Medicamento m) {

        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
    }
    
    public List<Medicamento> listar(){
        List<Medicamento> lista = new ArrayList<Medicamento>();
         lista = em.createQuery("from Medicamento m").getResultList();
        
        return lista;
    }
    
    public void remove(Medicamento m){
        em.getTransaction().begin();
        em.remove(m);
        em.getTransaction().commit();
    }
    
}
