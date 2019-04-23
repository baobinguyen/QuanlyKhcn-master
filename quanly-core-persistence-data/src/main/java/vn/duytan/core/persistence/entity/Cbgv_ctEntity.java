package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "cbgv_ct")
public class Cbgv_ctEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tencongtrinh")
    private String tenCongTrinh;

    @Column (name = "tacgia")
    private String tacGia;

    @Column(name = "noicongbo")
    private String noiCongBo;

    @Column(name = "CBGV_CTcol")
    private String CBGV_CTcol;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNoiCongBo() {
        return noiCongBo;
    }

    public void setNoiCongBo(String noiCongBo) {
        this.noiCongBo = noiCongBo;
    }

    public String getCBGV_CTcol() {
        return CBGV_CTcol;
    }

    public void setCBGV_CTcol(String CBGV_CTcol) {
        this.CBGV_CTcol = CBGV_CTcol;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }

    public DanhmucctEntity getDanhmucctEntity() {
        return danhmucctEntity;
    }

    public void setDanhmucctEntity(DanhmucctEntity danhmucctEntity) {
        this.danhmucctEntity = danhmucctEntity;
    }
}
