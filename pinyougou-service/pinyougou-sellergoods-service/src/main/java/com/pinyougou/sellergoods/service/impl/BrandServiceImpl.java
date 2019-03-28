package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * 服务接口实现类
 */
@Service(interfaceName = "com.pinyougou.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {

    /** 注入数据访问接口代理对象 */

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public void save(Brand brand) {

    }

    @Override
    public void update(Brand brand) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void deleteAll(Serializable[] ids) {

    }

    @Override
    public Brand findOne(Serializable id) {
        return null;
    }

    @Override
    public List<Brand> findAll() {
        //分页查询
        PageInfo<Brand> pageInfo = PageHelper.startPage(1,10).doSelectPageInfo(new ISelect() {
            @Override
            public void doSelect() {
                brandMapper.selectAll();
            }
        });

        System.out.println("总记录数" + pageInfo.getTotal());
        System.out.println("总页数" + pageInfo.getPages());
        return pageInfo.getList();
    }

    @Override
    public List<Brand> findByPage(Brand brand, int page, int rows) {
        return null;
    }
}
