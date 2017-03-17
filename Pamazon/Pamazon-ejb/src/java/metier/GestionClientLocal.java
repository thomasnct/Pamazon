/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface GestionClientLocal {
    
    public void creerClient(String nom, String email, String mdp);
}
