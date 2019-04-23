package vn.duytan.core.service;

import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.persistence.entity.CbgvEntity;

public interface CbgvService  {
    CbgvDTO isUseExist(CbgvDTO dto);
    CbgvDTO findRoleByCbgv(CbgvDTO dto);
}
