package vn.duytan.core.utils;

import vn.duytan.core.dto.RoleDTO;
import vn.duytan.core.persistence.entity.RoleEntity;

public class RoleBeanUtils {
    public static RoleDTO entity2Dto(RoleEntity entity){
    RoleDTO dto = new RoleDTO();
        dto.setRoleid(entity.getRoleid());
        dto.setName(entity.getName());
    return dto;
    }

    public static RoleEntity dto2Entity(RoleDTO dto){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleid(roleEntity.getRoleid());
        roleEntity.setName(roleEntity.getName());
        return roleEntity;
    }
}
