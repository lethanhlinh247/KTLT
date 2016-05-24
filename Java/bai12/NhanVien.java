/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author song1
 */
public class NhanVien extends Nguoi{
    private String congviec;
    private String phong;
    public void setCongViec(String congviec){
        this.congviec=congviec;
    }
    public void setPhong(String phong){
        this.phong=phong;
    }
    public String getCongViec(){
        return this.congviec;
    }
    public String getPhong(){
        return this.phong;
    }
}
