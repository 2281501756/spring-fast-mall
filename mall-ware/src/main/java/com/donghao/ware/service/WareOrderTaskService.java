package com.donghao.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donghao.common.utils.PageUtils;
import com.donghao.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 20:37:19
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

