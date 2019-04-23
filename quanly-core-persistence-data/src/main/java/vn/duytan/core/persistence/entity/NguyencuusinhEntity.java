package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "nghiencuusinh")
public class NguyencuusinhEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hoten")
    private String hoTen;

    @Column (name = "hinhthuchuongdan")
    private String hinhThucHuongDan;

    @Column(name = "donvicongtac")
    private String donViCongTac;

    @Column(name = "nambaovethanhcong")
    private String namBaoVeThanhCong;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHinhThucHuongDan() {
        return hinhThucHuongDan;
    }

    public void setHinhThucHuongDan(String hinhThucHuongDan) {
        this.hinhThucHuongDan = hinhThucHuongDan;
    }

    public String getDonViCongTac() {
        return donViCongTac;
    }

    public void setDonViCongTac(String donViCongTac) {
        this.donViCongTac = donViCongTac;
    }

    public String getNamBaoVeThanhCong() {
        return namBaoVeThanhCong;
    }

    public void setNamBaoVeThanhCong(String namBaoVeThanhCong) {
        this.namBaoVeThanhCong = namBaoVeThanhCong;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }
}
