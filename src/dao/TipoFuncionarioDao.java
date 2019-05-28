/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.TipoFuncionario;
import servico.Gerenciador;

/**
 *
 * @author sk
 */
public class TipoFuncionarioDao {
    
    private EntityManager em;

    public TipoFuncionarioDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    
    public void salvar(TipoFuncionario t) {

        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
    
    public List<TipoFuncionario> listar(){
        List<TipoFuncionario> lista = new ArrayList<TipoFuncionario>();
         lista = em.createQuery("from TipoFuncionario t").getResultList();
        
        return lista;
    }
    
    public void remove(TipoFuncionario t){
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }
}
