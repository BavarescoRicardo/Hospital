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
import java.util.Date;
import javax.persistence.Basic;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@RevisionEntity(ExambleListener.class)
public class RevEntity {
    @Id
    @GeneratedValue
    @RevisionNumber
    private int id;

    @RevisionTimestamp
    private long timestamp;

    private String username;
    private java.util.Date utilD = new Date();
 
    private java.sql.Date utilTime = new java.sql.Date(utilD.getTime());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getUtilD() {
        return utilD;
    }

    public void setUtilD(Date utilD) {
        this.utilD = utilD;
    }

    public java.sql.Date getUtilTime() {
        return utilTime;
    }

    public void setUtilTime(java.sql.Date utilTime) {
        this.utilTime = utilTime;
    }
    
    
    
}
 