/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

/**
 *
 * @author blank
 */
import modelo.Login;
import org.hibernate.envers.RevisionListener;


public class ExambleListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {
        RevEntity revisa = (RevEntity) revisionEntity;
        revisa.setUsername(Login.NOME);
        
    }
}
