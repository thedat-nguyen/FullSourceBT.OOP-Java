/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UKB
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Hschuyentoan> list_ct = new ArrayList<Hschuyentoan>();
        
        int choose = 0;
        while(choose != 4){
            System.out.println("Lua chon cong viec");
            System.out.println("1.Nhap vao mot danh sach hoc sinh chuyen toan");
            System.out.println("2.Dua ra hoc sinh co DTB cao nhat");
            System.out.println("3.Dua ra danh sach hoc sinh xep loai gioi");
            System.out.println("4.Thoat");
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Nhap so luong hoc sinh chuyen toan");
                    int n = sc.nextInt();
                    for (int i=0; i<n ;i ++){
                        Hschuyentoan ob = new Hschuyentoan();
                        ob.Input();
                        list_ct.add(ob);
                    }
                    System.out.println("Danh sach hoc sinh chuyen toan la : ");
                    for( Hschuyentoan hs : list_ct)
                        hs.Output();
                    break;
                
                case 2:
                    float max = list_ct.get(0).DTB();
                    for( Hschuyentoan hs : list_ct)
                        if(max < hs.DTB())
                            max = hs.DTB();
                    System.out.println("Hoc sinh co DTB cao nhat la :");
                    int dem = 1;
                    for( Hschuyentoan hs : list_ct)
                        if(hs.DTB() == max)
                            hs.Output();
                    break;
                    
                case 3:
                    System.out.println("Danh sach hoc sinh xep loai gioi la: ");
                    for( Hschuyentoan hs : list_ct)
                        if(hs.Xeploai()== "Gioi")
                        hs.Output();
                    break;
                    
                    
                case 4:
                    break;  
            }
        }
   
    }
    
}
