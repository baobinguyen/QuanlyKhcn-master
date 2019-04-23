package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "danhmucct")
public class DanhmucctEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tapchiquocte")
    private String tapChiQuocTe;

    @Column (name = "tapchiquocgia")
    private String tapChiQuocGia;

    @Column(name = "hoinghiquocte")
    private String hoiNghiQuocTe;

    @Column (name = "hoinghiquocgia")
    private String hoiNghiQuocGia;

    @Column(name = "sachchuyenkhao")
    private String sachChuyenKhao;

    @OneToMany(mappedBy = "danhmucctEntity", fetch = FetchType.LAZY)
    private List<Cbgv_ctEntity> cbgvCtList;

    @OneToMany(mappedBy = "danhmucctEntity", fetch = FetchType.LAZY)
    private List<GiaithuongEntity> giaithuongEntityList;

    @OneToMany(mappedBy = "danhmucctEntity", fetch = FetchType.LAZY)
    private List<CtadthuctienEntity> ctadthuctienEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTapChiQuocTe() {
        return tapChiQuocTe;
    }

    public void setTapChiQuocTe(String tapChiQuocTe) {
        this.tapChiQuocTe = tapChiQuocTe;
    }

    public String getTapChiQuocGia() {
        return tapChiQuocGia;
    }

    public void setTapChiQuocGia(String tapChiQuocGia) {
        this.tapChiQuocGia = tapChiQuocGia;
    }

    public String getHoiNghiQuocTe() {
        return hoiNghiQuocTe;
    }

    public void setHoiNghiQuocTe(String hoiNghiQuocTe) {
        this.hoiNghiQuocTe = hoiNghiQuocTe;
    }

    public String getHoiNghiQuocGia() {
        return hoiNghiQuocGia;
    }

    public void setHoiNghiQuocGia(String hoiNghiQuocGia) {
        this.hoiNghiQuocGia = hoiNghiQuocGia;
    }

    public String getSachChuyenKhao() {
        return sachChuyenKhao;
    }

    public void setSachChuyenKhao(String sachChuyenKhao) {
        this.sachChuyenKhao = sachChuyenKhao;
    }

    public List<Cbgv_ctEntity> getCbgvCtList() {
        return cbgvCtList;
    }

    public void setCbgvCtList(List<Cbgv_ctEntity> cbgvCtList) {
        this.cbgvCtList = cbgvCtList;
    }

    public List<GiaithuongEntity> getGiaithuongEntityList() {
        return giaithuongEntityList;
    }

    public void setGiaithuongEntityList(List<GiaithuongEntity> giaithuongEntityList) {
        this.giaithuongEntityList = giaithuongEntityList;
    }

    public List<CtadthuctienEntity> getCtadthuctienEntityList() {
        return ctadthuctienEntityList;
    }

    public void setCtadthuctienEntityList(List<CtadthuctienEntity> ctadthuctienEntityList) {
        this.ctadthuctienEntityList = ctadthuctienEntityList;
    }
}
