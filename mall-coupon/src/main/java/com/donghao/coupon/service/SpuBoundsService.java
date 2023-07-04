package com.donghao.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donghao.common.utils.PageUtils;
import com.donghao.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 11:40:05
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

