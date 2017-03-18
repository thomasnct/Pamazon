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
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "ARTICLE")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idArticle", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idArticle;
    @OneToOne
    private Type idType;
    @Column(name = "nomArticle", nullable = false)
    private String nomArticle;
    @Column(name = "prixArticle", nullable = false)
    private double prixArticle;
    @Column(name = "descriptionArticle", nullable = true)
    @Lob
    private String descriptionArticle;
    @Column(name = "qteDispoArticle", nullable = false)
    @Min(0)
    private Integer qteDispoArticle;

    public Article() {
        super();
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public Type getIdType() {
        return idType;
    }

    public void setIdType(Type idType) {
        this.idType = idType;
    }

   
    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public double getPrixArticle() {
        return prixArticle;
    }

    public void setPrixArticle(double prixArticle) {
        this.prixArticle = prixArticle;
    }

    public String getDescriptionArticle() {
        return descriptionArticle;
    }

    public void setDescriptionArticle(String descriptionArticle) {
        this.descriptionArticle = descriptionArticle;
    }

    public Integer getQteDispoArticle() {
        return qteDispoArticle;
    }

    public void setQteDispoArticle(Integer qteDispoArticle) {
        this.qteDispoArticle = qteDispoArticle;
    }
            
   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticle != null ? idArticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.idArticle == null && other.idArticle != null) 
            || (this.idArticle != null && !this.idArticle.equals(other.idArticle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Article[ id=" + idArticle + " ]";
    }
    
}
