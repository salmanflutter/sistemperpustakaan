/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.perpustakaan.java.model;

/**
 *
 * @author ROBBIABD
 */
public class Buku {
    private int isbn;
    private String judul;
    private String jenisBuku;
    private int tahunTerbit;
    private String penulis;
    private String penerbit;
    private int hargaSewa;

    public Buku(int isbn, String judul, String jenisBuku, int tahunTerbit, String penulis, String penerbit, int hargaSewa) {
        this.isbn = isbn;
        this.judul = judul;
        this.jenisBuku = jenisBuku;
        this.tahunTerbit = tahunTerbit;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.hargaSewa = hargaSewa;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

}
