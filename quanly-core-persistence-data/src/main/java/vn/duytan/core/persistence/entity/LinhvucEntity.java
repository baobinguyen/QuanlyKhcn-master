package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "linhvuc")
public class LinhvucEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "malinhvuc")
    private String maLinhVuc;

    @Column (name = "tengoi")
    private String tenGoi;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    @OneToMany(mappedBy = "linhvucEntity", fetch = FetchType.LAZY)
    private List<NganhEntity> nganhEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaLinhVuc() {
        return maLinhVuc;
    }

    public void setMaLinhVuc(String maLinhVuc) {
        this.maLinhVuc = maLinhVuc;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }

    public List<NganhEntity> getNganhEntityList() {
        return nganhEntityList;
    }

    public void setNganhEntityList(List<NganhEntity> nganhEntityList) {
        this.nganhEntityList = nganhEntityList;
    }

}
