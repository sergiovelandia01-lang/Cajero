/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.Cajero.Presenter;

import com.uptc.Cajero.Model.BankAccount;
import com.uptc.Cajero.exceptions.IncorrectKeyException;
import com.uptc.Cajero.exceptions.InsufficientBalanceException;
import com.uptc.Cajero.exceptions.InvalidAmountException;
import javax.swing.JOptionPane;
/**
 *
 * @author sergio
 */
public class ATM {
    private BankAccount account;
    /**
     * Crea un cajero asociado a una cuenta bancaria.
     *
     * @param account cuenta bancaria que utilizará el cajero
     */
    public ATM(BankAccount account) {
        this.account = account;
    }
    /**
     * Deposita dinero en la cuenta bancaria.
     *
     * @param amount monto que se desea depositar
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("El monto del depósito debe ser mayor que cero.");
        }
        account.setBalance(account.getBalance() + amount);
        JOptionPane.showMessageDialog(null,"Depósito realizado correctamente.");
        JOptionPane.showMessageDialog(null,"Saldo actual: " + account.getBalance());
    }
     /**
     * Retira dinero de la cuenta bancaria.
     *
     * @param amount monto que se desea retirar
     * @param passwordEntered clave ingresada por el usuario
     * @throws InsufficientBalanceException si el monto supera el saldo
     * @throws IncorrectKeyException si la clave es incorrecta
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void withdraw(double amount, String passwordEntered)throws InsufficientBalanceException, IncorrectKeyException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("El monto del retiro debe ser mayor que cero.");
        }
        if (!account.getPassword().equals(passwordEntered)) {
            throw new IncorrectKeyException("La clave ingresada es incorrecta.");
        }
        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException("Saldo insuficiente para realizar el retiro.");
        }
        account.setBalance(account.getBalance() - amount);
        JOptionPane.showMessageDialog(null,"Retiro realizado correctamente");
        JOptionPane.showMessageDialog(null,"Saldo actual: $" + account.getBalance());
        
    }



}
