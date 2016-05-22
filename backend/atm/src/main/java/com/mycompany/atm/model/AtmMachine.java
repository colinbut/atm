/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.model;


import java.math.BigDecimal;

/**
 * Represents an Automated Teller Machine
 *
 * This is a resource which should be protected because it would be accessed by
 * multiple threads.
 *
 * @author colin
 */
public class AtmMachine implements CashMachine {

    /**
     {@inheritDoc}
     */
    @Override
    public BigDecimal balance() {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    /**
     {@inheritDoc}
     */
    @Override
    public void cash(BigDecimal amount) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    /**
     {@inheritDoc}
     */
    @Override
    public String cashWithReceipt(BigDecimal amount) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    /**
     {@inheritDoc}
     */
    @Override
    public void mobilePhoneTopUp(BigDecimal amount) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    /**
     {@inheritDoc}
     */
    @Override
    public String printedBalance() {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    /**
     {@inheritDoc}
     */
    @Override
    public void charityAndOtherServices() {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }
}
