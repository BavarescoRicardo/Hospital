/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.envers.Audited;
/**
 *
 * @author Ricardo
 */

@Entity
@Audited(modifiedColumnName = "verificaMed")
@Table
public class Medico {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idMedico;
    private String NOME;
    private String CRM;
    private String CPF;
    private String ESPECIALIDADE;
    private String EMAIL;
    

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getESPECIALIDADE() {
        return ESPECIALIDADE;
    }

    public void setESPECIALIDADE(String ESPECIALIDADE) {
        this.ESPECIALIDADE = ESPECIALIDADE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Medico(String NOME, String CRM, String CPF, String ESPECIALIDADE, String EMAIL) {
        this.NOME = NOME;
        this.CRM = CRM;
        this.CPF = CPF;
        this.ESPECIALIDADE = ESPECIALIDADE;
        this.EMAIL = EMAIL;
    }

    public Medico() {
    }

    @Override
    public String toString() {
        return "Medico  " + NOME + ", CRM = " + CRM + ", CPF = " + CPF + ", ESPECIALIDADE = " + ESPECIALIDADE + ", EMAIL = " + EMAIL + '}';
    }
    
    
    
}
