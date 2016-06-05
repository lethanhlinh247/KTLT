/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import bai10.View.NumberMenu;

/**
 *
 * @author Giang
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bai10.View.NumberMenu menu = new NumberMenu();
        
        while (true) {            
            menu.showMenu();
        }
    }
    
}
