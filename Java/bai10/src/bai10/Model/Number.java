/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10.Model;

/**
 *
 * @author Giang
 */
public class Number {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number+"";
    }
}
