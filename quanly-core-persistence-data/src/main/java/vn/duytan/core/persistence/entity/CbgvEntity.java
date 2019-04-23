package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "cbgv")
public class CbgvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hoten")
    private String hoTen;

    @Column (name = "matkhau")
    private String matKhau;

    @Column(name = "ngaysinh")
    private String ngaySinh;

    @Column(name = "gioitinh")
    private String gioiTinh;

    @Column(name = "hocham")
    private String hocHam;

    @Column(name = "hocvi")
    private String hocVi;

    @Column(name = "namduocphong")
    private String namDuocPhong;

    @Column(name = "namdathocvi")
    private String namDatHocVi;

    @Column(name = "chucdanhnc")
    private String chucdanhnc;

    @Column(name = "dienthoaiNR")
    private String dienThoaiNr;

    @Column(name = "CQ")
    private String cq;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "linhvucchuyenmonsau")
    private String linhVucChuyenMonSau;

    @Column(name = "createddate")
    private String createddate;

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    @ManyToOne(optional=false)
    @JoinColumn(name = "roleid", insertable=false, updatable=false)
    private RoleEntity roleEntity;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<TrinhdonnEntity> trinhdonnEntityList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<NguyencuusinhEntity> nguyencuusinhEntityList;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    private DonviEntity donviEntity;

    public DonviEntity getDonviEntity() {
        return donviEntity;
    }

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<QuatrinhctEntity> quatrinhctEntityList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<KinhnghiemkhcnEntity> kinhnghiemkhcnEntityList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<QuatrinhdtEntity> quatrinhdtEntityList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<Cbgv_vbEntity> cbgvVbList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<DetaikhcngandayEntity> detaikhcngandayEntityList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<LinhvucEntity> linhvucEntityList;

    @OneToMany(mappedBy = "cbgvEntity", fetch = FetchType.LAZY)
    private List<Cbgv_ctEntity> cbgvCtList;

    public List<NguyencuusinhEntity> getNguyencuusinhEntityList() {
        return nguyencuusinhEntityList;
    }

    public void setNguyencuusinhEntityList(List<NguyencuusinhEntity> nguyencuusinhEntityList) {
        this.nguyencuusinhEntityList = nguyencuusinhEntityList;
    }

    public List<TrinhdonnEntity> getTrinhdonnEntityList() {
        return trinhdonnEntityList;
    }

    public void setTrinhdonnEntityList(List<TrinhdonnEntity> trinhdonnEntityList) {
        this.trinhdonnEntityList = trinhdonnEntityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getNamDuocPhong() {
        return namDuocPhong;
    }

    public void setNamDuocPhong(String namDuocPhong) {
        this.namDuocPhong = namDuocPhong;
    }

    public String getNamDatHocVi() {
        return namDatHocVi;
    }

    public void setNamDatHocVi(String namDatHocVi) {
        this.namDatHocVi = namDatHocVi;
    }

    public String getChucdanhnc() {
        return chucdanhnc;
    }

    public void setChucdanhnc(String chucdanhnc) {
        this.chucdanhnc = chucdanhnc;
    }

    public String getDienThoaiNr() {
        return dienThoaiNr;
    }

    public void setDienThoaiNr(String dienThoaiNr) {
        this.dienThoaiNr = dienThoaiNr;
    }

    public String getCq() {
        return cq;
    }

    public void setCq(String cq) {
        this.cq = cq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinhVucChuyenMonSau() {
        return linhVucChuyenMonSau;
    }

    public void setLinhVucChuyenMonSau(String linhVucChuyenMonSau) {
        this.linhVucChuyenMonSau = linhVucChuyenMonSau;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public void setDonviEntity(DonviEntity donviEntity) {
        this.donviEntity = donviEntity;
    }

    public List<QuatrinhctEntity> getQuatrinhctEntityList() {
        return quatrinhctEntityList;
    }

    public void setQuatrinhctEntityList(List<QuatrinhctEntity> quatrinhctEntityList) {
        this.quatrinhctEntityList = quatrinhctEntityList;
    }

    public List<KinhnghiemkhcnEntity> getKinhnghiemkhcnEntityList() {
        return kinhnghiemkhcnEntityList;
    }

    public void setKinhnghiemkhcnEntityList(List<KinhnghiemkhcnEntity> kinhnghiemkhcnEntityList) {
        this.kinhnghiemkhcnEntityList = kinhnghiemkhcnEntityList;
    }

    public List<QuatrinhdtEntity> getQuatrinhdtEntityList() {
        return quatrinhdtEntityList;
    }

    public void setQuatrinhdtEntityList(List<QuatrinhdtEntity> quatrinhdtEntityList) {
        this.quatrinhdtEntityList = quatrinhdtEntityList;
    }

    public List<Cbgv_vbEntity> getCbgvVbList() {
        return cbgvVbList;
    }

    public void setCbgvVbList(List<Cbgv_vbEntity> cbgvVbList) {
        this.cbgvVbList = cbgvVbList;
    }

    public List<DetaikhcngandayEntity> getDetaikhcngandayEntityList() {
        return detaikhcngandayEntityList;
    }

    public void setDetaikhcngandayEntityList(List<DetaikhcngandayEntity> detaikhcngandayEntityList) {
        this.detaikhcngandayEntityList = detaikhcngandayEntityList;
    }

    public List<LinhvucEntity> getLinhvucEntityList() {
        return linhvucEntityList;
    }

    public void setLinhvucEntityList(List<LinhvucEntity> linhvucEntityList) {
        this.linhvucEntityList = linhvucEntityList;
    }

    public List<Cbgv_ctEntity> getCbgvCtList() {
        return cbgvCtList;
    }

    public void setCbgvCtList(List<Cbgv_ctEntity> cbgvCtList) {
        this.cbgvCtList = cbgvCtList;
    }

}