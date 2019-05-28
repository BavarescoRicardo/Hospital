/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Funcionario;
import servico.Gerenciador;

/**
 *
 * @author sk
 */
public class FuncionarioDao {
    
    private EntityManager em;

    public FuncionarioDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    
    public void salvar(Funcionario f) {

        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
    
    public List<Funcionario> listar(){
        List<Funcionario> lista = new ArrayList<Funcionario>();
         lista = em.createQuery("from Funcionario f").getResultList();
        
        return lista;
    }
    
    public void remove(Funcionario f){
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }
    
    public void atualliza(Funcionario f){
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }
    
       public Funcionario getById (int id){
        return em.find(Funcionario.class, id);
    }
    
}