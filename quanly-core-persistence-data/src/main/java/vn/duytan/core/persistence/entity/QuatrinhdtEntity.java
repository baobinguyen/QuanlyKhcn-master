package vn.duytan.core.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "quatrinhdt")
public class QuatrinhdtEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bacdaotao")
    private String bacDaoTao;

    @Column (name = "noidaotao")
    private String noiDaoTao;

    @Column(name = "chuyennghanh")
    private String chuyenNghanh;

    @Column (name = "namtotnghiep")
    private String namTotNghiep;


    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private CbgvEntity cbgvEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBacDaoTao() {
        return bacDaoTao;
    }

    public void setBacDaoTao(String bacDaoTao) {
        this.bacDaoTao = bacDaoTao;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public String getNamTotNghiep() {
        return namTotNghiep;
    }

    public void setNamTotNghiep(String namTotNghiep) {
        this.namTotNghiep = namTotNghiep;
    }

    public CbgvEntity getCbgvEntity() {
        return cbgvEntity;
    }

    public void setCbgvEntity(CbgvEntity cbgvEntity) {
        this.cbgvEntity = cbgvEntity;
    }
}
