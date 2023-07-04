package com.donghao.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donghao.common.utils.PageUtils;
import com.donghao.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 20:30:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

