/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan62;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public abstract class LivingThings {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " makan");
    }
}
