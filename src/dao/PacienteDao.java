/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Paciente;
import servico.Gerenciador;

/**
 *
 * @author blank
 */
public class PacienteDao {
        private EntityManager em;

    public PacienteDao() {
        this.em = Gerenciador.getInstancia().getEm();
    }
    
    
    public void salvar(Paciente p) {

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public Paciente getById (int id){
        return em.find(Paciente.class, id);
    }
    
    public List<Paciente> listar(){
        List<Paciente> lista = new ArrayList<Paciente>();
         lista = em.createQuery("from Paciente p").getResultList();
        
        return lista;
    }
    
    public void remove(Paciente p){
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
    
    public void altera(Paciente p){
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
        public List<Paciente> filtrar(String filtro) {
        List<Paciente> lista = new ArrayList<Paciente>();

        Query q = em.createQuery("from Paciente p WHERE p.NOME like :filtro");
        q.setParameter("filtro", filtro + "%");
        lista = (List<Paciente>) q.getResultList();

        return lista;
    }
}
