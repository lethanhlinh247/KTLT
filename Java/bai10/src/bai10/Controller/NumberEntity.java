/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10.Controller;
import bai10.Model.Number;
import java.util.ArrayList;

/**
 *
 * @author Giang
 */
public class NumberEntity extends ArrayList<Number>{
    
    public boolean add(int number) {
        return add(new Number(number));
    }
    
    public int max() {
        try {
            return max_recursive(get(size()-1).getNumber(), size()-1);
        } catch (Exception e) {
            return 0;
        }
    }
    
    private int max_recursive(int n, int i) {
        if (get(i).getNumber() > n) {
            n = get(i).getNumber();
        }
        return (i<=0) ? n : max_recursive(n, i-1);
    }
    
    public double sum() {
        try {
            return sum_recursive(get(size()-1).getNumber(), size()-1);
        } catch (Exception e) {
            return 0;
        }
    }
    
    private double sum_recursive(double n, int i) {
        return (i<=0) ? n : sum_recursive(get(i-1).getNumber()+n, i-1);
    }
}
