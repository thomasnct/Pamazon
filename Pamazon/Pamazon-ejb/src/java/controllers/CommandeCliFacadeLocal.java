/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.CommandeCli;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface CommandeCliFacadeLocal {

    void create(CommandeCli commandeCli);

    void edit(CommandeCli commandeCli);

    void remove(CommandeCli commandeCli);

    CommandeCli find(Object id);

    List<CommandeCli> findAll();

    List<CommandeCli> findRange(int[] range);

    int count();
    
}
