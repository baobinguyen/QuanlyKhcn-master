package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Ctadthuctien")
public class CtadthuctienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten_cong_trinh")
    private String tenCongTrinh;

    @Column (name = "hinh_thuc_quy_mo")
    private String hinhThucQuyMo;

    @Column (name = "thoi_gian")
    private String thoiGian;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private DanhmucctEntity danhmucctEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenCongTrinh() {
        return tenCongTrinh;
    }

    public void setTenCongTrinh(String tenCongTrinh) {
        this.tenCongTrinh = tenCongTrinh;
    }

    public String getHinhThucQuyMo() {
        return hinhThucQuyMo;
    }

    public void setHinhThucQuyMo(String hinhThucQuyMo) {
        this.hinhThucQuyMo = hinhThucQuyMo;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public DanhmucctEntity getDanhmucctEntity() {
        return danhmucctEntity;
    }

    public void setDanhmucctEntity(DanhmucctEntity danhmucctEntity) {
        this.danhmucctEntity = danhmucctEntity;
    }
}
