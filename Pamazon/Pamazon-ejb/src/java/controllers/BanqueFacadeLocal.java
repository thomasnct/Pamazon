/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Banque;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface BanqueFacadeLocal {

    void create(Banque banque);

    void edit(Banque banque);

    void remove(Banque banque);

    Banque find(Object id);

    List<Banque> findAll();

    List<Banque> findRange(int[] range);

    int count();
    
}
