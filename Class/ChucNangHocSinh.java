package ThiModule2.Class;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ChucNangHocSinh  {
    IOHocSinh ioHocSinh = new IOHocSinh();
    IOHocSinh iohocsinh = new IOHocSinh();
    Scanner sc = new Scanner(System.in);
    File file = new File("C:\\Users\\VuHongLinh\\IdeaProjects\\untitled1\\src\\ThiModule2\\Class\\students.cvs");
    ArrayList<HocSinh> hocsinh = ioHocSinh.read(file);

    int maHs = 0;
    int tuoiHs = 0;
    double diemTB = 0;
    int index = 0;

    public void docfile() {
            hocsinh = iohocsinh.read(file);
            System.out.println("Đọc file thành công, chọn chức năng xem danh sách để kiểm tra.");
        }
    public  void  ghfile(){

        ioHocSinh.write(file, hocsinh);
        System.out.println("Ghi File Thành Công");
    }
    public void HienThi() {
        System.out.println("Danh sách học sinh");
        for (int i = 0; i < hocsinh.size(); i++) {
            if (hocsinh.size()>0)
            {
                System.out.println(hocsinh.get(i).toString());
            }
        }

    }

    public void themHocsinh(HocSinh hocSinh) {
        hocsinh.add(hocSinh);
       ioHocSinh.write(file, hocsinh);
    }

    public int TimMaHs(int maHs) {
        for (int i = 0; i < hocsinh.size(); i++) {
            if (hocsinh.get(i).MaSinhVien == maHs) {
                return i;
            }
        }
        return -1;
    }

    public HocSinh TaoHocSinh() {
        System.out.println("Nhập mã học sinh");
        while (true) {
            try {
                maHs = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số cho hocsinh");
                continue;
            }
            index = TimMaHs(maHs);
            if (index == -1) {
                System.out.println("Nhập tên học sinh");
                String tenHs = sc.nextLine();
                System.out.println("Nhập tuổi học sinh");
                while (true) {
                    try {
                        tuoiHs = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Nhập Số Cho Tuổi Học Sinh");
                        continue;
                    }
                    System.out.println("Nhập giới tính cho học sinh");
                    String gioiTinhHs = sc.nextLine();
                    System.out.println("Nhập địa chỉ cho học sinh");
                    String diaChiHs = sc.nextLine();
                    System.out.println("Nhập điểm trung bình hs");
                    while (true) {
                        try {
                            diemTB = Double.parseDouble(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Nhập số cho điểm");
                            continue;
                        }
                        System.out.println("Nhập dữ liệu thành công");
                        return new HocSinh(maHs, tenHs, tuoiHs, gioiTinhHs, diaChiHs, diemTB);
                    }
                }
            } else {
                System.out.println("Mã học sinh đã tồn tại");
            }
        }
    }

    public void suaHocsinh() {
        System.out.println("Nhập mã học sinh bạn muốn sửa");
        while (true) {
            try {
                maHs = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số cho mã học sinh");
                continue;
            }
            index = TimMaHs(maHs);
            if (index != -1) {
                hocsinh.set(index, TaoHocSinh());
                return;
            } else {
                System.out.println("Không tồn tại");
            }
        }
    }

    public void xoaHocsinh() {
        System.out.println("Nhập mã học sinh bạn muốn xóa");
        while (true) {
            try {
                maHs = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số cho mã học sinh");
                continue;
            }
            index = TimMaHs(maHs);
            if ((index != -1)) {
                hocsinh.remove(index);
                ioHocSinh.write(file, hocsinh);
                return;
            } else {
                System.out.println("Không tồn tại mã học sinh");
            }
        }
    }
    public void SapXepTheoGiamDan()
    {
        hocsinh.sort(new Sapxeptheogiamdan());
        System.out.println("Sắp xếp thành công");
        System.out.println(hocsinh.toString());
    }
    public void SapXepTheoTangDan()
    {
        hocsinh.sort(new Sapxeptheotangdan());
        System.out.println("Sắp xếp thành công");
        System.out.println(hocsinh.toString());
    }
}
