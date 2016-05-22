/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.atm.model;


import java.math.BigDecimal;

/**
 * Represents an abstraction for a 'Cash Machine' which is a machine
 * that you can withdraw money from. A cash machine allows you to perform a lot of
 * other actions too.
 *
 * @author colin
 */
public interface CashMachine {

    /**
     * Retrieves the balance
     *
     * @return the balance
     */
    BigDecimal balance();


    /**
     * Withdraws cash
     *
     * @param amount the amount to take out
     */
    void cash(BigDecimal amount);


    /**
     * Withdraws cash and also get a receipt for it
     *
     * @param amount the amount to take out
     * @return a printed receipt
     */
    String cashWithReceipt(BigDecimal amount);


    /**
     * Tops up mobile phone balance
     *
     * @param amount the amount to top up the mobile phone
     */
    void mobilePhoneTopUp(BigDecimal amount);


    /**
     * Gets a printed balance
     *
     * @return printed balance (that is readable)
     */
    String printedBalance();


    /**
     * Performs charitable activities plus other services that is applicable
     */
    void charityAndOtherServices();

}
