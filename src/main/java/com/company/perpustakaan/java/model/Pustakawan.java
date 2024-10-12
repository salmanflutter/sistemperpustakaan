/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.perpustakaan.java.model;

/**
 *
 * @author ROBBIABD
 */
public class Pustakawan extends Pengguna {

    public Pustakawan(int id, String nama, String email) {
        super(id, nama, email);
    }
   
    public boolean tambahBuku() {
        return true;
    }
    
    public boolean hapusBuku() {
        return true;
    }
    
    public boolean perbaruiBuku() {
        return true;
    }
    
    public void lihatListBuku() {
        
    }
}
