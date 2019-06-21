/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.hibernate.envers.RevisionListener;

/**
 *
 * @author blank
 */
public class UserRevisionListener implements RevisionListener {
        public final static String USERNAME = Login.NOME;
        @Override
        public void newRevision(Object revisionEntity) {
            Revisa exampleRev = (Revisa) revisionEntity;
            exampleRev.setUsername(USERNAME);
        }
    }
