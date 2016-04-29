/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.model;

import com.mycompany.atm.user.AtmUser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * An implementation of a multiple cash point abstraction
 *
 * A typical cash point can have at least one or many atms
 *
 * @author colin
 */
public class MultipleAtmPoint implements AtmPoint {

    private static final int NUMBER_OF_ATM_MACHINES = 2;

    private Semaphore machines = new Semaphore(NUMBER_OF_ATM_MACHINES);

    private List<CashMachine> cashMachines = new ArrayList<>();

    /**
     * Constructor
     */
    public MultipleAtmPoint() {
        // add only 2 atms
        cashMachines.add(new AtmMachine());
        cashMachines.add(new AtmMachine());
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void accessAtm(AtmUser atmUser) {
        try {

            System.out.println(atmUser.getName() + " is waiting to access an ATM machine");
            machines.acquire(); // using it the machine...

            System.out.println(atmUser.getName() + " is using the ATM");
            Thread.sleep(3000);

            machines.release(); // when finished
            System.out.println(atmUser.getName() + " has finished using the ATM machine");

        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }


}
