package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author best
 * @email 983874606@qq.com
 * @date 2021-01-14 22:33:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
