package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "detaikhcnganday")
public class DetaikhcngandayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tenduan")
    private String tenDuan;

    @Column (name = "chutrithamgia")
    private String chuTriThamGia;

    @Column(name = "thoigian")
    private String thoiGian;

    @Column (name = "thuocchuongtrinh")
    private String thuocChuongTrinh;

    @Column (name = "tinhtrang")
    private String tinhTrang;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDuan() {
        return tenDuan;
    }

    public void setTenDuan(String tenDuan) {
        this.tenDuan = tenDuan;
    }

    public String getChuTriThamGia() {
        return chuTriThamGia;
    }

    public void setChuTriThamGia(String chuTriThamGia) {
        this.chuTriThamGia = chuTriThamGia;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getThuocChuongTrinh() {
        return thuocChuongTrinh;
    }

    public void setThuocChuongTrinh(String thuocChuongTrinh) {
        this.thuocChuongTrinh = thuocChuongTrinh;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }
}
