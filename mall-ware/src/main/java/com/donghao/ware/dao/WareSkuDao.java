package com.donghao.ware.dao;

import com.donghao.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 20:37:19
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
