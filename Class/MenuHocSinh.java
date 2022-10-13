package ThiModule2.Class;

import java.util.Scanner;

public class MenuHocSinh {
    ChucNangHocSinh chucNangHocSinh = new ChucNangHocSinh();

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int number = 0;
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập Nhập");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            while (true) {
                try {
                    number = Integer.parseInt(sc.nextLine());
                    if (number < 0 || number > 8) {
                        System.out.println("Nhập số từ 1-8");
                    } else break;
                } catch (Exception e) {
                    System.out.println("Nhập Chữ Số Từ 1-8");
                }
            }
            switch (number) {
                case 1:
                    chucNangHocSinh.HienThi();
                    break;
                case 2:
                    HocSinh hocSinh = chucNangHocSinh.TaoHocSinh();
                    chucNangHocSinh.themHocsinh(hocSinh);
                    break;
                case 3:
                    chucNangHocSinh.suaHocsinh();
                    break;
                case 4:
                    chucNangHocSinh.xoaHocsinh();
                    break;
                case 5:
                    int choice = 0;
                    while (choice == 0) {
                        System.out.println("---Sắp xếp học sinh theo điểm trung bình");
                        System.out.println("Chọn chức năng theo số để tiếp tục");
                        System.out.println("1. Sắp xếp theo điểm trung bình tăng dần");
                        System.out.println("2. Sắp xếp theo điểm trung bình giảm dần");
                        System.out.println("3. Thoát");
                        while (true) {
                            try {
                                number = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (Exception e) {
                                System.out.println("Nhập sô từ 1-3");

                            }

                        }
                        switch (number) {
                            case 1 -> chucNangHocSinh.SapXepTheoTangDan();
                            case 2 -> chucNangHocSinh.SapXepTheoGiamDan();
                            case 3 -> ++choice;
                        }
                    }
                    break;
                case 6:
                    chucNangHocSinh.docfile();
                    break;
                case 7:
                    chucNangHocSinh.ghfile();
                    break;
                case 8:
                    return;
            }

        }


    }

}

