package vn.duytan.core.dto;

import java.io.Serializable;

public class DonviDTO implements Serializable {
    private Integer id;
    private String tenDonVi;
    private String ten_Nguoi_Dung_Dau;
    private String diaChiDonVi;
    private String dienThoai;
    private String website;
    private String Fax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public String getTen_Nguoi_Dung_Dau() {
        return ten_Nguoi_Dung_Dau;
    }

    public void setTen_Nguoi_Dung_Dau(String ten_Nguoi_Dung_Dau) {
        this.ten_Nguoi_Dung_Dau = ten_Nguoi_Dung_Dau;
    }

    public String getDiaChiDonVi() {
        return diaChiDonVi;
    }

    public void setDiaChiDonVi(String diaChiDonVi) {
        this.diaChiDonVi = diaChiDonVi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }
}
