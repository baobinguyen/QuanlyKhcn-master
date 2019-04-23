package vn.duytan.core.utils;

import vn.duytan.core.dto.DonviDTO;
import vn.duytan.core.persistence.entity.DonviEntity;

public class DonviBeanUtils {
    public static DonviDTO entity2Dto(DonviEntity entity){
        DonviDTO dto = new DonviDTO();
            dto.setId(entity.getId());
            dto.setTenDonVi(entity.getTenDonVi());
            dto.setDiaChiDonVi(entity.getDiaChiDonVi());
            dto.setTen_Nguoi_Dung_Dau(entity.getTen_Nguoi_Dung_Dau());
            dto.setDiaChiDonVi(entity.getDiaChiDonVi());
            dto.setDienThoai(entity.getDienThoai());
            dto.setWebsite(entity.getWebsite());
            dto.setFax(entity.getFax());
        return dto;
    }

    public static DonviEntity dto2Entity(DonviDTO dto){
        DonviEntity donviEntity = new DonviEntity();
        donviEntity.setId(donviEntity.getId());
        dto.setTenDonVi(donviEntity.getTenDonVi());
        donviEntity.setTenDonVi(donviEntity.getDiaChiDonVi());
        donviEntity.setTen_Nguoi_Dung_Dau(donviEntity.getTen_Nguoi_Dung_Dau());
        donviEntity.setDienThoai(donviEntity.getDienThoai());
        donviEntity.setWebsite(donviEntity.getWebsite());
        donviEntity.setFax(donviEntity.getFax());
        return donviEntity;
    }
}
