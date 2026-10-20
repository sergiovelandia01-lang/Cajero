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
public class Main {
     public static void main(String[] args) throws InsufficientBalanceException {
         BankAccount account=new BankAccount("001", "1234", 500);
         ATM atm=new ATM(account);
         try {
             atm.withdraw(100, "0000");
         } catch (IncorrectKeyException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }catch (InsufficientBalanceException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }catch (InvalidAmountException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }finally {
            JOptionPane.showMessageDialog(null,"Intento procesado");
        }
         
        try {
            atm.withdraw(1000, "1234");
        } catch (IncorrectKeyException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (InsufficientBalanceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (InvalidAmountException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null,"Intento procesado");
        }
         
        try {
            atm.withdraw(-50, "1234");
        } catch (IncorrectKeyException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (InsufficientBalanceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (InvalidAmountException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null,"Intento procesado");
        }
        
        try {
            atm.withdraw(200, "1234");
        } catch (IncorrectKeyException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (InsufficientBalanceException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (InvalidAmountException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null,"Intento procesado");
        }
         JOptionPane.showMessageDialog(null,"Pruebas finalizadas.\n"
                 + "Saldo final: $"+ account.getBalance()
        );          
    }
}
