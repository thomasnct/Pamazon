/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.LigneCmdCli;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thomas
 */
@Stateless
public class LigneCmdCliFacade extends AbstractFacade<LigneCmdCli> implements LigneCmdCliFacadeLocal {

    @PersistenceContext(unitName = "Pamazon-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneCmdCliFacade() {
        super(LigneCmdCli.class);
    }
    
}
