package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Nganh")
public class NganhEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "manganh")
    private String maNganh;

    @Column (name = "tengoi")
    private String tenGoi;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private LinhvucEntity linhvucEntity;

    @OneToMany(mappedBy = "nganhEntity", fetch = FetchType.LAZY)
    private List<ChuyennganhEntity> chuyennganhEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
    }

    public LinhvucEntity getLinhvucEntity() {
        return linhvucEntity;
    }

    public void setLinhvucEntity(LinhvucEntity linhvucEntity) {
        this.linhvucEntity = linhvucEntity;
    }

    public List<ChuyennganhEntity> getChuyennganhEntityList() {
        return chuyennganhEntityList;
    }

    public void setChuyennganhEntityList(List<ChuyennganhEntity> chuyennganhEntityList) {
        this.chuyennganhEntityList = chuyennganhEntityList;
    }
}
