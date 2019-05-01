package vn.duytan.core.service;

import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.persistence.entity.CbgvEntity;

import java.util.List;

public interface CbgvService  {
    CbgvDTO isUseExist(CbgvDTO dto);
    CbgvDTO findRoleByCbgv(CbgvDTO dto);
    Object[] findCbgvByProperties(String property, Object value, String sortExpresion, String sortDirection, Integer offset, Integer limit );

}
