/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10.View;
import bai10.Controller.NumberEntity;
import java.util.Scanner;

/**
 *
 * @author Giang
 */
public class NumberMenu {
    private NumberEntity list;
    private Scanner sc;

    public NumberMenu() {
        list = new NumberEntity();
        sc = new Scanner(System.in);
    }

    public NumberMenu(NumberEntity list) {
        this.list = list;
    }
    
    public void showMenu() {
        System.out.println(" ======== PRIME NUMBER ========");
        System.out.println("[1] Input numbers");
        System.out.println("[2] Get biggest number");
        System.out.println("[3] Sum up");
        System.out.println("[4] Exit program");
        System.out.print  (" >  Please choose:   ");
        process(sc.nextLine());
    }
    
    protected void process(String choice) {
        switch(choice) {
            case "1":
                function1();
                break;
            case "2":
                function2();
                break;
            case "3":
                function3();
                break;
            case "4":
                function4();
                break;
            default:
                System.out.println("\tINVALID CHOICE!!");
                break;
        }
        sc.nextLine();
    }
    
    protected void function1() {
        System.out.print(">> Quntity of numbers:   ");
        int quantity = Integer.parseInt(sc.nextLine());
        try {
            for (int i=0; i<quantity; i++) {
                System.out.print("> ");
                try {
                    list.add(Integer.parseInt(sc.nextLine()));
                } catch (Exception e) {
                    // Ignore
                }
            }
        } catch (Exception e) {
            function1();
        }
    }
    
    protected void function2() {
        System.out.println(" Max: " + list.max());
    }
    
    protected void function3() {
        System.out.println(" Sum: " + list.sum());
    }
    
    protected void function4() {
        System.out.println(" ~ Good bye!");
        sc.nextLine();
        System.exit(1);
    }
}
