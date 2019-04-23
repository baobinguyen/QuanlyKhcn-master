package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Chuyennganh")
public class ChuyennganhEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "machuyennganh")
    private String maChuyenNganh;

    @Column (name = "tengoi")
    private String tenGoi;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private NganhEntity nganhEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public NganhEntity getNganhEntity() {
        return nganhEntity;
    }

    public void setNganhEntity(NganhEntity nganhEntity) {
        this.nganhEntity = nganhEntity;
    }
}
