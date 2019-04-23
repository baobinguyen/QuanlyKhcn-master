package vn.duytan.api.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import vn.duytan.core.dao.CbgvDao;
import vn.duytan.core.dao.RoleDao;
import vn.duytan.core.daoimpl.CbgvDaoImpl;
import vn.duytan.core.daoimpl.RoleDaoImpl;
import vn.duytan.core.persistence.entity.CbgvEntity;
import vn.duytan.core.persistence.entity.RoleEntity;

import java.util.ArrayList;
import java.util.List;

public class LoginTest {
    private final Logger log = Logger.getLogger(this.getClass());


    @Test
    public void checkiscbgvExist(){

        CbgvDao cbgvDao = new CbgvDaoImpl();
        String hoTen ="admin";
        String matKhau = "111111";
        CbgvEntity entity = cbgvDao.isUseExist(hoTen, matKhau);
        if (entity != null){
            log.error("login thanh cong");
        }else {
            log.error("login that bai");
        }

    }
    @Test
    public void checkfindrole(){
        CbgvDao cbgvDao = new CbgvDaoImpl();
        String hoTen = "baobi";
        String matKhau = "123456";
        CbgvEntity  entity = cbgvDao.findRoleByCbgv(hoTen,matKhau);
        log.error(entity.getRoleEntity().getRoleid() + "-" + entity.getRoleEntity().getName());
    }
    @Test
    public void checkFindAll(){
        RoleDao roleDao = new RoleDaoImpl();
        List<RoleEntity> list = roleDao.findAll();
    }
    @Test
    public  void checkUpdateRole(){
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = new RoleEntity();
        entity.setRoleid(2);
        entity.setName("USER");
        roleDao.update(entity);
    }
    @Test
    public  void checksaveRole(){
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = new RoleEntity();
        entity.setRoleid(1);
        entity.setName("ADMIN");
        entity.setRoleid(2);
        entity.setName("USER");
        roleDao.update(entity);
    }
    @Test
    public void checkFindId(){
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = roleDao.findById(1);
    }
    @Test
    public void findByProperty(){
        RoleDao roleDao = new RoleDaoImpl();
        String property = null ;
        Object value = null;
        String sortExpresion = null;
        String sortDirection = null;
        Object[] objects = roleDao.findbyProperty(property,value,sortExpresion,sortDirection);
    }
    @Test
    public void checkDelete(){
        List<Integer> listId = new ArrayList<Integer>();
        listId.add(1);
        listId.add(2);
        RoleDao roleDao = new RoleDaoImpl();
        Integer count = roleDao.  delete(listId);
    }
}
