/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.Cajero.exceptions;

/**
 *
 * @author sergio
 */
public class InvalidAmountException extends RuntimeException{
     /**
     * Construye una excepción con un mensaje descriptivo.
     *
     * @param mensaje descripción del error ocurrido
     */
    public InvalidAmountException(String mensaje){
        super(mensaje);
    }
}
