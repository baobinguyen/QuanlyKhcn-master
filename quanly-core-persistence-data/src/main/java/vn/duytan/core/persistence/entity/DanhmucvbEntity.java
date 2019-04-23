package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "danhmucvb")
public class DanhmucvbEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "docquyensangche")
    private String docQuyenSangChe;

    @Column (name = "giaiphaphuuich")
    private String giaiPhapHuuIch;

    @Column(name = "vanbangbaohoGCT")
    private String vanBangBaoHoGCT;

    @Column (name = "TKBTMTH")
    private String TKBTMTH;


    @OneToMany(mappedBy = "danhmucvbEntity", fetch = FetchType.LAZY)
    private List<Cbgv_vbEntity> cbgvVbEntityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocQuyenSangChe() {
        return docQuyenSangChe;
    }

    public void setDocQuyenSangChe(String docQuyenSangChe) {
        this.docQuyenSangChe = docQuyenSangChe;
    }

    public String getGiaiPhapHuuIch() {
        return giaiPhapHuuIch;
    }

    public void setGiaiPhapHuuIch(String giaiPhapHuuIch) {
        this.giaiPhapHuuIch = giaiPhapHuuIch;
    }

    public String getVanBangBaoHoGCT() {
        return vanBangBaoHoGCT;
    }

    public void setVanBangBaoHoGCT(String vanBangBaoHoGCT) {
        this.vanBangBaoHoGCT = vanBangBaoHoGCT;
    }

    public String getTKBTMTH() {
        return TKBTMTH;
    }

    public void setTKBTMTH(String TKBTMTH) {
        this.TKBTMTH = TKBTMTH;
    }

    public List<Cbgv_vbEntity> getCbgvVbEntityList() {
        return cbgvVbEntityList;
    }

    public void setCbgvVbEntityList(List<Cbgv_vbEntity> cbgvVbEntityList) {
        this.cbgvVbEntityList = cbgvVbEntityList;
    }
}
