/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.perpustakaan.java.helper;

import javax.swing.JTextField;

/**
 *
 * @author ROBBIABD
 */
public class Validation {
    public static boolean numberValidation(JTextField text) {
        try {
            int number = Integer.parseInt(text.getText());
            
            return number > 0;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
