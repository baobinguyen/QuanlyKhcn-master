package vn.duytan.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid")
    private Integer roleid;

    @Column(name = "name")
    private String name;

    @OneToMany (mappedBy = "roleEntity", fetch = FetchType.LAZY)
    private List<CbgvEntity> cbgvEntityList;

    public List<CbgvEntity> getCbgvEntityList() {
        return cbgvEntityList;
    }

    public void setCbgvEntityList(List<CbgvEntity> cbgvEntityList) {
        this.cbgvEntityList = cbgvEntityList;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
