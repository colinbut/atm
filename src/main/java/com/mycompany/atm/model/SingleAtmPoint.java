/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.model;

import com.mycompany.atm.user.AtmUser;

/**
 * An implementation of a single cash point abstraction
 *
 * @author colin
 */
public class SingleAtmPoint implements AtmPoint {


    /**
     * Constructor
     */
    public SingleAtmPoint(){
        //
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void accessAtm(AtmUser atmUser) {
        throw new UnsupportedOperationException("Not Yet Implemented!");
    }
}
