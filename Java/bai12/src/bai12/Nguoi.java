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
public class Nguoi {
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    public void setHoTen(String hoten){
        this.hoten=hoten;
    }
    public void setNgaySinh(String ngaysinh){
        this.ngaysinh=ngaysinh;
    }
    public void setGioiTinh(String gioitinh){
        this.gioitinh=gioitinh;
    }
    public String getHoTen(){
        return this.hoten;
    }
    public String getNgaySinh(){
        return this.ngaysinh;
    }
    public String getGioiTinh(){
        return this.gioitinh;
    }
    
}
