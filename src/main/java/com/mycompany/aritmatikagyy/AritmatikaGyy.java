/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aritmatikagyy;

/**
 *
 * @author user
 */
public class AritmatikaGyy {
    private double bilSatu;
    private double bilDua;

    public AritmatikaGyy(double bilSatu, double bilDua) {
        this.bilSatu = bilSatu;
        this.bilDua = bilDua;
    }

    public double getBilSatu() {
        return bilSatu;
    }

    public void setBilSatu(double bilSatu) {
        this.bilSatu = bilSatu;
    }

    public double getBilDua() {
        return bilDua;
    }

    public void setBilDua(double bilDua) {
        this.bilDua = bilDua;
    }
    
    /* Penjumlahan */
    public double penjumlahan(){
        return bilSatu+bilDua;
    }
    
    /* Pengurangan */
    public double pengurangan(){
        return bilSatu-bilDua;
    }
    
    /* Perkalian */
    public double perkalian(){
        return bilSatu*bilDua;
    }
    
    /* Pembagian */
    public double pembagian(){
        return bilSatu/bilDua;
    }
        
    
}
