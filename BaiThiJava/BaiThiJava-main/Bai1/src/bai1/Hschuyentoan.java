/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author UKB
 */
public class Hschuyentoan extends Hocsinh   {
    
    @Override
    public float DTB(){
        return (super.getDt()*2 + super.getDl() + super.getDh())/4;
    }
    public void Input(){
        super.Input();
    }
    public void Output(){
        
        super.Output();
        System.out.println("Diem trung binh: " + DTB());
        
    }
    public String Xeploai(){
        String xl= "";
        if(DTB() <5)
            xl = "Kem";
        else if( DTB()<7)
            xl = "Trung Binh";
        else if( DTB()<8)
            xl = "Kha";
        else if( DTB()<9)
            xl = "Gioi";
        else
            xl = "Xuat sac";
        return xl;
        
    }
    

    
    
    
    
    
    
}
