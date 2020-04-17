package com.example.excel.bean;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable {

    /**
     * 部门id
     */

    private Integer deptId;
    /**
     * 父Id
     */
    private Integer parentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 排序编号
     */
    private String orderNum;
    /**
     * 删除标识
     */
    private String delFlag;
    /**
     * 子节点
     */
    private List<Department> treeNode;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public List<Department> getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(List<Department> treeNode) {
        this.treeNode = treeNode;
    }
}
