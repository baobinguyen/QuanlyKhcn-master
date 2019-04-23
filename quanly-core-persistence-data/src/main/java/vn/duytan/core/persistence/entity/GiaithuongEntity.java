package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "giaithuong")
public class GiaithuongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hinhthucnoidung")
    private String hinhThucNoiDung;

    @Column (name = "namtangthuong")
    private String namTangThuong;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private DanhmucctEntity danhmucctEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHinhThucNoiDung() {
        return hinhThucNoiDung;
    }

    public void setHinhThucNoiDung(String hinhThucNoiDung) {
        this.hinhThucNoiDung = hinhThucNoiDung;
    }

    public String getNamTangThuong() {
        return namTangThuong;
    }

    public void setNamTangThuong(String namTangThuong) {
        this.namTangThuong = namTangThuong;
    }

    public DanhmucctEntity getDanhmucctEntity() {
        return danhmucctEntity;
    }

    public void setDanhmucctEntity(DanhmucctEntity danhmucctEntity) {
        this.danhmucctEntity = danhmucctEntity;
    }
}
