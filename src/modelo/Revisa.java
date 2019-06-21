/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

/**
 *
 * @author blank
 */

//@Entity
//@RevisionEntity(UserRevisionListener.class)
public class Revisa extends DefaultRevisionEntity{

    @Id
    private Long ID;
    private String username;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
