/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import controllers.ClientFacadeLocal;
import entities.Client;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Thomas
 */
@Stateless
public class GestionClient implements GestionClientLocal {    
    @EJB
    private ClientFacadeLocal clientFacede;

    @Override
    public void creerClient(String nom, String email, String mdp) {
        Client client = new Client();
        client.setNomClient(nom);
        client.setMailClient(email);
        client.setMdpClient(mdp);
        clientFacede.create(client);
    }

}
