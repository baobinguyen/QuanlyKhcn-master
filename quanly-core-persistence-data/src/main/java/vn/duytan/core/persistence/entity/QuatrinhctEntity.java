package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "quatrinhct")
public class QuatrinhctEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "thoigian")
    private String thoiGian;

    @Column (name = "vitricongtac")
    private String viTriCongTac;

    @Column(name = "linhvuc")
    private String linhVuc;

    @Column(name = "coquancongtac")
    private String coQuanCongTac;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getViTriCongTac() {
        return viTriCongTac;
    }

    public void setViTriCongTac(String viTriCongTac) {
        this.viTriCongTac = viTriCongTac;
    }

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }

    public String getCoQuanCongTac() {
        return coQuanCongTac;
    }

    public void setCoQuanCongTac(String coQuanCongTac) {
        this.coQuanCongTac = coQuanCongTac;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }
}
