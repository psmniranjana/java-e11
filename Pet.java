/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author Admin
 */
public class Pet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Animal dog = new Dog();
       Animal cat = new Rat();
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();
    }
    
}
