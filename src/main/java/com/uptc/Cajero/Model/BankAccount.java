/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.Cajero.Model;
/**
 *
 * @author sergio
 */
    public class BankAccount {
    private String accountNumber;
    private String password;
    private double balance;
    /**
     * Crea una cuenta bancaria con sus datos iniciales.
     *
     * @param accountNumber número de la cuenta bancaria
     * @param password clave de acceso a la cuenta
     * @param balance saldo inicial de la cuenta
     */
    public BankAccount(String accountNumber, String password,
                       double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }
    /**
     * Obtiene el número de la cuenta bancaria.
     *
     * @return número de la cuenta
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * Obtiene la clave de la cuenta bancaria.
     *
     * @return clave de acceso
     */
    public String getPassword() {
        return password;
    }
    /**
     * Obtiene el saldo disponible de la cuenta.
     *
     * @return saldo actual
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Actualiza el saldo de la cuenta bancaria.
     *
     * @param balance nuevo saldo de la cuenta
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
