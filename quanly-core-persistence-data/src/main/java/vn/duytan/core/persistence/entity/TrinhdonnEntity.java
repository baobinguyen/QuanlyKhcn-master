package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table (name = "trinhdonn")
public class TrinhdonnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tenngoaingu")
    private String tenNgoaiNgu;

    @Column (name = "nghe")
    private String nge;

    @Column(name = "noi")
    private String noi;

    @Column(name = "doc")
    private String doc;

    @Column(name = "viet")
    private String viet;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNgoaiNgu() {
        return tenNgoaiNgu;
    }

    public void setTenNgoaiNgu(String tenNgoaiNgu) {
        this.tenNgoaiNgu = tenNgoaiNgu;
    }

    public String getNge() {
        return nge;
    }

    public void setNge(String nge) {
        this.nge = nge;
    }

    public String getNoi() {
        return noi;
    }

    public void setNoi(String noi) {
        this.noi = noi;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }
}
