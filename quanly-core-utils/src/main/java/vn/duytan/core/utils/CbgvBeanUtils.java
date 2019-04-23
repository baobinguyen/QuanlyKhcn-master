package vn.duytan.core.utils;

import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.persistence.entity.CbgvEntity;

public class CbgvBeanUtils {
    public static CbgvDTO entity2Dto(CbgvEntity entity){
        CbgvDTO cbgvDTO = new CbgvDTO();
            cbgvDTO.setId(entity.getId());
            cbgvDTO.setHoTen(entity.getHoTen());
            cbgvDTO.setMatKhau(entity.getMatKhau());
            cbgvDTO.setNgaySinh(entity.getNgaySinh());
            cbgvDTO.setGioiTinh(entity.getGioiTinh());
            cbgvDTO.setHocHam(entity.getHocHam());
            cbgvDTO.setHocVi(entity.getHocVi());
            cbgvDTO.setNamDuocPhong(entity.getNamDuocPhong());
            cbgvDTO.setNamDatHocVi(entity.getNamDatHocVi());
            cbgvDTO.setChucdanhnc(entity.getChucdanhnc());
            cbgvDTO.setDienThoaiNr(entity.getDienThoaiNr());
            cbgvDTO.setCq(entity.getCq());
            cbgvDTO.setMobile(entity.getMobile());
            cbgvDTO.setEmail(entity.getEmail());
            cbgvDTO.setLinhVucChuyenMonSau(entity.getLinhVucChuyenMonSau());
            cbgvDTO.setCreateddate(entity.getCreateddate());
            cbgvDTO.setRoleDTO(RoleBeanUtils.entity2Dto(entity.getRoleEntity()));
            cbgvDTO.setDonviDTO(DonviBeanUtils.entity2Dto(entity.getDonviEntity()));
        return cbgvDTO;
    }
    public static CbgvEntity dto2Entity (CbgvDTO dto){
        CbgvEntity entity = new CbgvEntity();
        entity.setId(dto.getId());
        entity.setHoTen(dto.getHoTen());
        entity.setMatKhau(dto.getMatKhau());
        entity.setNgaySinh(dto.getNgaySinh());
        entity.setGioiTinh(dto.getGioiTinh());
        entity.setHocHam(dto.getHocHam());
        entity.setHocVi(dto.getHocVi());
        entity.setNamDuocPhong(dto.getNamDuocPhong());
        entity.setNamDatHocVi(dto.getNamDatHocVi());
        entity.setChucdanhnc(dto.getChucdanhnc());
        entity.setDienThoaiNr(dto.getDienThoaiNr());
        entity.setCq(dto.getCq());
        entity.setMobile(dto.getMobile());
        entity.setEmail(dto.getEmail());
        entity.setLinhVucChuyenMonSau(dto.getLinhVucChuyenMonSau());
        entity.setCreateddate(dto.getCreateddate());
        entity.setRoleEntity(RoleBeanUtils.dto2Entity(dto.getRoleDTO()));
        entity.setDonviEntity(DonviBeanUtils.dto2Entity(dto.getDonviDTO()));
        return entity;
    }
}



