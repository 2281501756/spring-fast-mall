package com.donghao.product.dao;

import com.donghao.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 09:57:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
