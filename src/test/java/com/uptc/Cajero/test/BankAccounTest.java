/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.uptc.Cajero.test;

import com.uptc.Cajero.Model.BankAccount;
import javax.security.auth.login.AccountException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.uptc.Cajero.Presenter.ATM;
import com.uptc.Cajero.exceptions.IncorrectKeyException;
import com.uptc.Cajero.exceptions.InsufficientBalanceException;
import com.uptc.Cajero.exceptions.InvalidAmountException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author sergio
 */
public class BankAccounTest {
     BankAccount account;
     ATM atm;
    public BankAccounTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    account = new BankAccount("001","1234",500);
    atm=new ATM(account);
    }
    
    @AfterEach
    public void tearDown() {
    }
@Test
public void validateUserAccount(){
    assertEquals("001",account.getAccountNumber());
}

@Test
public void validateBalance(){
    assertEquals(500.0,account.getBalance(),0.1);
}
@Test
public void depositBankAccount(){
    account.deposit(500);
    assertEquals(1000, account.getBalance());
}
@Test
public void withdraw()throws InsufficientBalanceException, IncorrectKeyException, InvalidAmountException {
 atm.withdraw(200, "1234");
}
@ParameterizedTest
@ValueSource(doubles={1002,1200,1000})
public void validateKeyExpections(double amount){
    assertThrows(IncorrectKeyException.class,()->{
        atm.withdraw(amount, "2020");
    });
     
}
}