/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author UKB
 */
public class Hocsinh {
    private String Hoten;
    private String Ngaysinh;
    private float DiemToan,DiemLy,DiemHoa;

    public Hocsinh(String Hoten, String Ngaysinh, float DiemToan, float DiemLy, float DiemHoa) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
    }

    public Hocsinh() {
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho ten: ");
        Hoten = sc.nextLine();
        System.out.println("Nhap Ngay sinh: ");
        Ngaysinh = sc.nextLine();
        System.out.println("Nhap Diem toan: ");
        DiemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap Diem ly: ");
        DiemLy = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap Diem hoa: ");
        DiemHoa = Float.parseFloat(sc.nextLine());
        
        
    }
    public void Output()
    {
        System.out.println("Ho ten: " + this.Hoten);
        System.out.println("Ngay sinh: " + this.Ngaysinh);
        System.out.println("Diem toan: " + this.DiemToan);
        System.out.println("Diem ly: " + this.DiemLy);
        System.out.println("Diem hoa: " + this.DiemHoa);
    }
    public float DTB(){
        return (DiemToan+DiemLy+DiemHoa)/3;
    }
    public float getDt(){
        return DiemToan;
    }
    public float getDl(){
        return DiemLy;
    }
    public float getDh(){
        return DiemHoa;
    }
    
    
}
