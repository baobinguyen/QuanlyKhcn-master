package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "donvi")
public class DonviEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tendonvi")
    private String tenDonVi;

    @Column (name = "nguoidungdau")
    private String ten_Nguoi_Dung_Dau;

    @Column(name = "diachidonvi")
    private String diaChiDonVi;

    @Column(name = "dienthoai")
    private String dienThoai;

    @Column(name = "website")
    private String website;

    @Column(name = "fax")
    private String fax;

    @OneToMany(mappedBy = "donviEntity", fetch = FetchType.LAZY)
    private List<CbgvEntity> cbgvEntityList;

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
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public List<CbgvEntity> getCbgvEntityList() {
        return cbgvEntityList;
    }

    public void setCbgvEntityList(List<CbgvEntity> cbgvEntityList) {
        this.cbgvEntityList = cbgvEntityList;
    }

    public String getDiaChiDonVi() {
        return diaChiDonVi;
    }

    public void setDiaChiDonVi(String diaChiDonVi) {
        this.diaChiDonVi = diaChiDonVi;
    }
}
