/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author UKB
 */
public class Bai2 {
    

    public String Result(int n){
        int i = 2;
        String kq="";
        while (n > 1){
            while(n%i ==0){
                n = n/i;
                kq += i ;
                if(n != 1)
                    kq += ".";
            }
            i++;
        }
        return kq;
    }
    
    
}
