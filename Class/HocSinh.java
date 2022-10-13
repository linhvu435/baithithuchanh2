package ThiModule2.Class;

import java.io.Serializable;

public class HocSinh implements Serializable  {
    public int MaSinhVien;
    public String name;
    public int Tuoi;
    public String GioiTinh;
    public String DiaChi;
    public double DiemTB;

    public HocSinh() {
    }

    public HocSinh(int maSinhVien, String name, int tuoi, String gioiTinh, String diaChi, double diemTB) {
        MaSinhVien = maSinhVien;
        this.name = name;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        DiaChi = diaChi;
        DiemTB = diemTB;
    }

    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double diemTB) {
        DiemTB = diemTB;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "MaSinhVien=" + MaSinhVien +
                ", name='" + name + '\'' +
                ", Tuoi=" + Tuoi +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", DiemTB=" + DiemTB +
                '}';
    }
}
