/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author Thomas
 */
@Table(name = "BANQUE")
@Entity
public class Banque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCompte", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompte;
    @Column(name = "idCompte", nullable = false)
    @Min(0)
    private double soldeCompte;
 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompte != null ? idCompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banque)) {
            return false;
        }
        Banque other = (Banque) object;
        if ((this.idCompte == null && other.idCompte != null) 
           || (this.idCompte != null && !this.idCompte.equals(other.idCompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Banque[ id=" + idCompte + " ]";
    }
    
}
