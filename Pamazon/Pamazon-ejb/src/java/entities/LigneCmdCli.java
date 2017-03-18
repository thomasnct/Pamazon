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
import javax.persistence.OneToOne;
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
public class LigneCmdCli implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLigneCom;
    
    
    @OneToOne
    private CommandeCli cmdCli;
    
    @OneToOne
    private  Article article;
    @Column(name = "qteArticle", nullable = false)
    @Min(0)
    private Integer qteArticle;
    @Column(name = "prixTotLigne", nullable = false)
    @Min(0)
    private double prixTotLigne;

    public LigneCmdCli() {
        super();
    }

    public Integer getIdLigneCom() {
        return idLigneCom;
    }

    public void setIdLigneCom(Integer idLigneCom) {
        this.idLigneCom = idLigneCom;
    }

    public CommandeCli getCmdCli() {
        return cmdCli;
    }

    public void setCmdCli(CommandeCli cmdCli) {
        this.cmdCli = cmdCli;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
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
        hash += (idLigneCom != null ? idLigneCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneCmdCli)) {
            return false;
        }
        LigneCmdCli other = (LigneCmdCli) object;
        if ((this.idLigneCom == null && other.idLigneCom != null) 
           || (this.idLigneCom != null && !this.idLigneCom.equals(other.idLigneCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.LigneCmdCli[ id=" + idLigneCom + " ]";
    }
    
}
