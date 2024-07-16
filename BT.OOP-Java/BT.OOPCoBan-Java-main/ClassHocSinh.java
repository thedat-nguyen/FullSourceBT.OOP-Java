package ClassHocSinh;

import java.util.Scanner;

public class ClassHocSinh {
    String HoTen;
    int Tuoi;
    String QueQuan;
    String GioiTinh;

    public ClassHocSinh() {
    }

    public ClassHocSinh(String hoTen, int tuoi, String queQuan, String gioiTinh) {
        HoTen = hoTen;
        Tuoi = tuoi;
        QueQuan = queQuan;
        GioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhap Ho Ten ");
        HoTen = sc.nextLine();
        System.out.println(" Nhap So Tuoi ");
        Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println(" Nhap Que Quan ");
        QueQuan = sc.nextLine();
        System.out.println(" Nhap Gioi Tinh ");
        GioiTinh = sc.nextLine();

    }

    public void Xuat(){

        System.out.println(" Ho Ten La "+HoTen);
        System.out.println(" So Tuoi La "+Tuoi);
        System.out.println(" Que Quan La "+QueQuan);
        System.out.println(" Gioi Tinh La "+GioiTinh);
    }
}
