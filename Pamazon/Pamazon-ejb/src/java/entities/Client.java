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
import javax.persistence.Table;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IdClient", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idClient;
    @Column(name = "nomClient", nullable = false)
    private String nomClient; 
    @Column(name = "prenomClient", nullable = true)
    private String prenomClient;
    @Column(name = "mdpClient", nullable = false)
    private String mdpClient;
    @Column(name = "mailClient", nullable = false)
    private String mailClient;
    @Column(name = "adresseClient", nullable = true)
    private String adresseClient; 
    @Column(name = "villeClient", nullable = true)
    private String villeClient;
    @Column(name = "cpClient", nullable = true)
    private String cpClient;
    
    @OneToOne
    private Banque compte;

    public Client() {
        super();
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getMdpClient() {
        return mdpClient;
    }

    public void setMdpClient(String mdpClient) {
        this.mdpClient = mdpClient;
    }

    public String getMailClient() {
        return mailClient;
    }

    public void setMailClient(String mailClient) {
        this.mailClient = mailClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getVilleClient() {
        return villeClient;
    }

    public void setVilleClient(String villeClient) {
        this.villeClient = villeClient;
    }

    public String getCpClient() {
        return cpClient;
    }

    public void setCpClient(String cpClient) {
        this.cpClient = cpClient;
    }

    public Banque getCompte() {
        return compte;
    }

    public void setCompte(Banque compte) {
        this.compte = compte;
    }

  
    
    
    
    
    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer id) {
        this.idClient = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClient != null ? idClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idClient == null && other.idClient != null) 
           || (this.idClient != null && !this.idClient.equals(other.idClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Client[ id=" + idClient + " ]";
    }
    
}
