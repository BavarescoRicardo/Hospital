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
import modelo.Prontuario;
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

    public Diagnostico getById(int id) {
        return em.find(Diagnostico.class, id);
    }

    public void inserir(Diagnostico d) {
        boolean existente = false;
        ProntuarioDao prontuarioDao = new ProntuarioDao();
        Prontuario prontuario;

        for (Prontuario p : prontuarioDao.listar()) {
            if (p.getIdProntuario() == d.getProntuario().getIdProntuario()) {
                existente = true;
                prontuario = d.getProntuario();

                for (Diagnostico diagnostico : this.listar()) {
                    if (diagnostico.getProntuario().getIdProntuario() == prontuario.getIdProntuario()) {
                        diagnostico.setDoenca(d.getDoenca());
                        diagnostico.setSTATUS(d.getSTATUS());

                        em.getTransaction().begin();
                        em.merge(diagnostico);
                        em.getTransaction().commit();
                        break;
                    }
                }
            }
        }
        if (!existente) {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }
    }

    public List<Diagnostico> listar() {
        List<Diagnostico> lista = new ArrayList<Diagnostico>();
        lista = em.createQuery("from Diagnostico d").getResultList();

        return lista;
    }

    public void remove(Diagnostico d) {
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
    }

}
