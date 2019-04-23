package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "cbgv_vb")
public class Cbgv_vbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tennoidung")
    private String tenNoiDung;

    @Column (name = "namcap")
    private String namCap;

    @ManyToOne(optional=false)
    @JoinColumn(name = "CBGV_id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private DanhmucvbEntity danhmucvbEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNoiDung() {
        return tenNoiDung;
    }

    public void setTenNoiDung(String tenNoiDung) {
        this.tenNoiDung = tenNoiDung;
    }

    public String getNamCap() {
        return namCap;
    }

    public void setNamCap(String namCap) {
        this.namCap = namCap;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }

    public DanhmucvbEntity getDanhmucvbEntity() {
        return danhmucvbEntity;
    }

    public void setDanhmucvbEntity(DanhmucvbEntity danhmucvbEntity) {
        this.danhmucvbEntity = danhmucvbEntity;
    }
}
