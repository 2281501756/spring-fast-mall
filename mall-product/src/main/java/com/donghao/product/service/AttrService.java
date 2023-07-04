package com.donghao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donghao.common.utils.PageUtils;
import com.donghao.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 09:57:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

