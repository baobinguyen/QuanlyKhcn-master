package vn.duytan.core.dto;

import java.io.Serializable;

public class CbgvDTO implements Serializable {
    private Integer id;
    private String hoTen;
    private String matKhau;
    private String ngaySinh;
    private String gioiTinh;
    private String hocHam;
    private String hocVi;
    private String namDuocPhong;
    private String namDatHocVi;
    private String chucdanhnc;
    private String dienThoaiNr;
    private String cq;
    private String mobile;
    private String email;
    private String linhVucChuyenMonSau;
    private String createddate;
    private RoleDTO roleDTO;
    private DonviDTO donviDTO;

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

    public RoleDTO getRoleDTO() {
        return roleDTO;
    }

    public void setRoleDTO(RoleDTO roleDTO) {
        this.roleDTO = roleDTO;
    }

    public DonviDTO getDonviDTO() {
        return donviDTO;
    }

    public void setDonviDTO(DonviDTO donviDTO) {
        this.donviDTO = donviDTO;
    }

}
