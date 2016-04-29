/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm;

import com.mycompany.atm.model.AtmPoint;
import com.mycompany.atm.model.MultipleAtmPoint;
import com.mycompany.atm.user.AtmUser;
import com.mycompany.atm.user.Person;

/**
 * ATM
 *
 * @author colin
 *
 */
public class AtmApplication {


    /**
     * Main entry
     *
     * @param args
     */
    public static void main( String[] args ) {

        AtmPoint atmPoint = new MultipleAtmPoint();

        Person mickey = new AtmUser("Mickey", atmPoint);
        Person donald = new AtmUser("Donald", atmPoint);
        Person tom = new AtmUser("Tom", atmPoint);
        Person jerry = new AtmUser("Jerry", atmPoint);
        Person casper = new AtmUser("Casper", atmPoint);

        new Thread((AtmUser)mickey).start();
        new Thread((AtmUser)donald).start();
        new Thread((AtmUser)tom).start();
        new Thread((AtmUser)jerry).start();
        new Thread((AtmUser)casper).start();


    }
}
