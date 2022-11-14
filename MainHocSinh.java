package ClassHocSinh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainHocSinh {
    public static void main(String[] args) {
//        ClassHocSinh hs = new ClassHocSinh();
//        hs.Nhap();
//        hs.Xuat();

        Scanner in = new Scanner(System.in);

        ArrayList<ClassHocSinh> hs_list = new ArrayList<ClassHocSinh>();

        int LuaChon = 0;
        while (LuaChon!=6) {
            System.out.println(" Lua Chon Cong Viec :");

            System.out.println("1. Nhap Danh Sach Hoc Sinh ");
            System.out.println("2. Them 1 Hoc Sinh Moi ");
            System.out.println("3. Xoa 1 Hoc Sinh ");
            System.out.println("4. Sap Xep Theo Tuoi ");
            System.out.println("5. Tim Hoc Sinh Duoi 18 Tuoi ");
            System.out.println("6. Thoat ");

            LuaChon = in.nextInt();
            in.nextLine();
            switch (LuaChon) {
                case 1:
                    System.out.println(" Nhap So Luong Hoc Sinh ");
                    int n = Integer.parseInt(in.nextLine());
                    for (int i = 0; i < n; i++) {
                        ClassHocSinh obj = new ClassHocSinh();
                        obj.Nhap();
                        hs_list.add(obj);
                    }
                    System.out.println(" Danh Sach Hoc Sinh Vua Nhap ");
                    for (ClassHocSinh hs1 : hs_list) {
                        hs1.Xuat();
                    }
                    break;


                case 2:
                    System.out.println(" Nhap Thong Tin Hoc Sinh Can Them ");
                    ClassHocSinh obj = new ClassHocSinh();
                    obj.Nhap();
                    hs_list.add(obj);
                    System.out.println(" Danh Sach Hoc Sinh Sau Khi Them ");
                    for (ClassHocSinh hs1 : hs_list) {
                        hs1.Xuat();
                    }
                    break;

                case 3:
                    System.out.println(" Nhap Vi Tri Can Xoa ");
                    int i = Integer.parseInt(in.nextLine());
                    hs_list.remove(i);
                    System.out.println(" Danh Sach Hoc Sinh Sau Khi Xoa ");
                    for (ClassHocSinh hs1 : hs_list) {
                        hs1.Xuat();
                    }
                    break;

                case 4:
                    Collections.sort(hs_list);
                    System.out.println(" Danh Sach Hoc Sinh Sap Xep Theo Tuoi ");
                    for (ClassHocSinh hs1 : hs_list) {
                        hs1.Xuat();
                    }
                    break;

                case 5:
                    System.out.println(" Danh Sach Hoc Sinh Duoi 18 Tuoi La ");
                    for (ClassHocSinh hs1 : hs_list) {
                        if (hs1.getTuoi() < 18) {
                            hs1.Xuat();
                        }
                    }
                    break;

                case 6:
                    break;
            }
        }
    }
}
