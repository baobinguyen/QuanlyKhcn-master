package vn.duytan.api.test;

import org.testng.annotations.Test;
import vn.duytan.core.dao.CbgvDao;
import vn.duytan.core.daoimpl.CbgvDaoImpl;

public class CbgvTest {
    @Test
    public void testbgv(){
        CbgvDao cbgvDao = new CbgvDaoImpl();
        Object[] result = cbgvDao.findbyProperty(null, null,null,null,0,2);
    }
}
