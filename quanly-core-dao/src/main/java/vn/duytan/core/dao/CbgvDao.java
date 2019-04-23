package vn.duytan.core.dao;

import vn.duytan.core.data.dao.GenericDao;
import vn.duytan.core.persistence.entity.CbgvEntity;

public interface CbgvDao extends GenericDao<Integer, CbgvEntity> {
    CbgvEntity findCbgvbyHotenAndMatkhau(String hoTen, String matKhau);

}
