/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.user;

import com.mycompany.atm.model.AtmPoint;

/**
 * A person who uses an ATM
 *
 * @author colin
 */
public class AtmUser extends Person implements Runnable {

    private AtmPoint atmPoint;

    /**
     * Constructor
     *
     * @param name the name of this atm user person
     * @param atmPoint the atm point at which this person stands at
     */
    public AtmUser(String name, AtmPoint atmPoint) {
        super(name);
        this.atmPoint = atmPoint;
    }


    @Override
    public void run() {
        atmPoint.accessAtm(this);
    }
}
