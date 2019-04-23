package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "kinhnghiemkhcn")
public class KinhnghiemkhcnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hinhthuchoidong")
    private String hinhThucHoiDong;

    @Column (name = "solan")
    private String soLan;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHinhThucHoiDong() {
        return hinhThucHoiDong;
    }

    public void setHinhThucHoiDong(String hinhThucHoiDong) {
        this.hinhThucHoiDong = hinhThucHoiDong;
    }

    public String getSoLan() {
        return soLan;
    }

    public void setSoLan(String soLan) {
        this.soLan = soLan;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }
}
