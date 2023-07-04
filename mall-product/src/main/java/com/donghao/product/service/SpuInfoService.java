package com.donghao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donghao.common.utils.PageUtils;
import com.donghao.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 09:57:23
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

