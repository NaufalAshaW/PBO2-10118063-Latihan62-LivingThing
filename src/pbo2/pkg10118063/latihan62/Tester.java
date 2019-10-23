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
public class Tester {

    /**
     * @param args
     */
      public static void main(String[] args){
          Human human = new Human();
          human.setNama("Naufal Asha");
          human.walk(human.getNama());
          human.breath(human.getNama());
          human.eat(human.getNama());
    }
}
