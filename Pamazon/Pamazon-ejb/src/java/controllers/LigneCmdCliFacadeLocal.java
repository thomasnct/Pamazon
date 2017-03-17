/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.LigneCmdCli;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface LigneCmdCliFacadeLocal {

    void create(LigneCmdCli ligneCmdCli);

    void edit(LigneCmdCli ligneCmdCli);

    void remove(LigneCmdCli ligneCmdCli);

    LigneCmdCli find(Object id);

    List<LigneCmdCli> findAll();

    List<LigneCmdCli> findRange(int[] range);

    int count();
    
}
