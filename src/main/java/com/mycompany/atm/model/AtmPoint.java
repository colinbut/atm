/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.model;

import com.mycompany.atm.user.AtmUser;

/**
 * An abstraction for a 'Cash Point'
 *
 * i.e. A place where you can go to withdraw money from a machine
 *
 * @author colin
 */
public interface AtmPoint {

    /**
     * Accessing the ATM
     *
     * @param atmUser the user that is accessing the ATM
     */
    void accessAtm(AtmUser atmUser);
}
