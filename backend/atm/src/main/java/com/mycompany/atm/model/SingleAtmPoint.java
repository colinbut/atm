/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.model;

import com.mycompany.atm.user.AtmUser;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * An implementation of a single cash point abstraction
 *
 * @author colin
 */
public class SingleAtmPoint implements AtmPoint {

    private Lock lock = new ReentrantLock();

    private CashMachine cashMachine; // just the single cash machine

    /**
     * Constructor
     */
    public SingleAtmPoint() {
        cashMachine = new AtmMachine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accessAtm(AtmUser atmUser) {
        try {

            System.out.println(atmUser.getName() + " is waiting to access an ATM machine");
            lock.lock();

            System.out.println(atmUser.getName() + " is accessing an ATM machine");

            BigDecimal balance = cashMachine.balance();
            System.out.println("The balance is: " + balance);

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace(); //nobody can interrupt the user whilst they're using the machine
        } finally {
            System.out.println(atmUser.getName() + " is done using the ATM machine");
            lock.unlock();
        }
    }
}
