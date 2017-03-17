/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Type;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface TypeFacadeLocal {

    void create(Type type);

    void edit(Type type);

    void remove(Type type);

    Type find(Object id);

    List<Type> findAll();

    List<Type> findRange(int[] range);

    int count();
    
}
