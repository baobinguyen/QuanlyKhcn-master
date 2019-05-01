package vn.duytan.core.service.impl;

import vn.duytan.core.dao.CbgvDao;
import vn.duytan.core.daoimpl.CbgvDaoImpl;
import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.persistence.entity.CbgvEntity;
import vn.duytan.core.service.CbgvService;
import vn.duytan.core.utils.CbgvBeanUtils;

import java.util.ArrayList;
import java.util.List;

public class CbgvServiceImpl implements CbgvService {
    private CbgvDao cbgvDao = new CbgvDaoImpl();
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

    public Object[] findCbgvByProperties(String property, Object value, String sortExpresion, String sortDirection, Integer offset, Integer limit) {
        List<CbgvDTO> result = new ArrayList<CbgvDTO>();
        Object[] objects = cbgvDao.findbyProperty(property,value,sortExpresion,sortExpresion,offset,limit);
        for (CbgvEntity item: (List<CbgvEntity>)objects[1]){
            CbgvDTO dto = CbgvBeanUtils.entity2Dto(item);
            result.add(dto);
        }
        objects[1] = result;
        return objects;
    }

}
