package com.star.service;

import com.star.pojo.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyService {

    /**
     * 查询全部企业 传入起始位置和页面容量
     * @param currentPage
     * @param pageSize
     * @return hao
     */
    public List<Company> getCompanyList(int currentPage, int pageSize);


    /**
     * 总记录数
     * @return hao
     */
    public int getTotalCount();

    /**
     * 删除企业信息
     * @param id
     * @return
     */
    public int delCompany(int id);

    /**
     * 添加公司信息
     * @param company
     * @return hao
     */
    public int insetCompany(Company company);


    /**
     * 查看公司详细信息
     * @param id
     * @return hao
     */
    public List<Company> getCompany(@Param("id")int id);


    /**
     * 根据公司名查询
     * @param companyName
     * @return hao
     */
    public List<Company> getListOfCompany(@Param("companyName")String companyName);

    /**
     * 修改公司信息
     * @param company
     * @return hao
     */
    public int upOfCompany(@Param("company")Company company);

    /**
     * 查询公司下的员工
     * @param currentPage
     * @param pageSize
     * @return lai
     */
    public List<Company> getCompanyMap(int currentPage,int pageSize);


}
