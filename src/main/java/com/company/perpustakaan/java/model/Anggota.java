/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.perpustakaan.java.model;

/**
 *
 * @author ROBBIABD
 */
public class Anggota extends Pengguna {

    public Anggota(int id, String nama, String email) {
        super(id, nama, email);
    }
    
    public boolean pinjamBuku() {
        return true;
    }
    
    public boolean kembalikanBuku() {
        return true;    
    }
    
    public void lihatBukuDipinjam() {
        
    }
}
