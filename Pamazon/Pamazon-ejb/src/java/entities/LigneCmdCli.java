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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "LIGNECMDCLI")
@SecondaryTables({
  @SecondaryTable(name="COMMANDECLI",
     pkJoinColumns={@PrimaryKeyJoinColumn(name="idCmdCli")}),
  @SecondaryTable(name="ARTICLE",
     pkJoinColumns={@PrimaryKeyJoinColumn (name="idArticle")})
})
public class LigneCmdCli implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCmdCli", table = "COMMANDECLI")
    private Integer idCmdCli;
    @Column(name = "idArticle", table = "ARTICLE")
    private Integer idArticle;
    @Column(name = "qteArticle", nullable = false)
    @Min(0)
    private Integer qteArticle;
    @Column(name = "prixTotLigne", nullable = false)
    @Min(0)
    private double prixTotLigne;

    public LigneCmdCli() {
        super();
    }

    public Integer getIdCmdCli() {
        return idCmdCli;
    }

    public void setIdCmdCli(Integer idCmdCli) {
        this.idCmdCli = idCmdCli;
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public Integer getQteArticle() {
        return qteArticle;
    }

    public void setQteArticle(Integer qteArticle) {
        this.qteArticle = qteArticle;
    }

    public double getPrixTotLigne() {
        return prixTotLigne;
    }

    public void setPrixTotLigne(double prixTotLigne) {
        this.prixTotLigne = prixTotLigne;
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
        if (!(object instanceof LigneCmdCli)) {
            return false;
        }
        LigneCmdCli other = (LigneCmdCli) object;
        if ((this.idCmdCli == null && other.idCmdCli != null) 
           || (this.idCmdCli != null && !this.idCmdCli.equals(other.idCmdCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.LigneCmdCli[ id=" + idCmdCli + " ]";
    }
    
}
