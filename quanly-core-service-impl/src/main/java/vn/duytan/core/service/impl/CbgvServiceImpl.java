package vn.duytan.core.service.impl;

import vn.duytan.core.dao.CbgvDao;
import vn.duytan.core.daoimpl.CbgvDaoImpl;
import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.persistence.entity.CbgvEntity;
import vn.duytan.core.service.CbgvService;
import vn.duytan.core.utils.CbgvBeanUtils;

public class CbgvServiceImpl implements CbgvService {
    public CbgvDTO isUseExist(CbgvDTO dto) {
        CbgvDao cbgvDao = new CbgvDaoImpl();
        CbgvEntity entity = cbgvDao.findCbgvbyHotenAndMatkhau(dto.getHoTen(),dto.getMatKhau());
        return CbgvBeanUtils.entity2Dto(entity);
    }

    public CbgvDTO findRoleByCbgv(CbgvDTO dto) {
        CbgvDao cbgvDao = new CbgvDaoImpl();
        CbgvEntity entity = cbgvDao.findCbgvbyHotenAndMatkhau(dto.getHoTen(),dto.getMatKhau());
        return CbgvBeanUtils.entity2Dto(entity);
    }
}
