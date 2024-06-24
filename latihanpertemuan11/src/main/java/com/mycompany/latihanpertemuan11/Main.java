/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanpertemuan11;

/**
 *
 * @author A-25
 */
public class Main {
    
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Innova");
        MobilBekas mobilbekas1 = new MobilBekas(2017, 30000000, "Toyota", "Kijang");
        mobilbekas1.info();
    }
    
}
