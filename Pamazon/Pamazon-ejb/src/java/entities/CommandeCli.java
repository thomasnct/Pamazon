/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "COMMANDECLI")

public class CommandeCli implements Serializable {

    protected enum Etat {
        VALIDE,
        AQUITTE,
        EN_PREPARATION,
        LIVRE,
        PAYE,
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCmdCli", nullable = false)
    private Integer idCmdCli;
   
    @ManyToOne
    private Client client;
    @Column(name = "montantCmdCli", nullable = false)
    private double montantCmdCli;
    @Column(name = "etatCmdCli", nullable = false)
    @Enumerated(EnumType.STRING)
    private Etat etatCmdCli;
    @Column(name = "dateCmdCli", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateCmdCli;

    public CommandeCli() {
        super();
    }

    public Integer getIdCmdCli() {
        return idCmdCli;
    }

    public void setIdCmdCli(Integer idCmdCli) {
        this.idCmdCli = idCmdCli;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

  

    public double getMontantCmdCli() {
        return montantCmdCli;
    }

    public void setMontantCmdCli(double montantCmdCli) {
        this.montantCmdCli = montantCmdCli;
    }

    public Etat getEtatCmdCli() {
        return etatCmdCli;
    }

    public void setEtatCmdCli(Etat etatCmdCli) {
        this.etatCmdCli = etatCmdCli;
    }

    public Date getDateCmdCli() {
        return dateCmdCli;
    }

    public void setDateCmdCli(Date dateCmdCli) {
        this.dateCmdCli = dateCmdCli;
    }

    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCmdCli != null ? idCmdCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandeCli)) {
            return false;
        }
        CommandeCli other = (CommandeCli) object;
        if ((this.idCmdCli == null && other.idCmdCli != null) 
            || (this.idCmdCli != null && !this.idCmdCli.equals(other.idCmdCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CommandeCli[ id=" + idCmdCli + " ]";
    }
    
}
