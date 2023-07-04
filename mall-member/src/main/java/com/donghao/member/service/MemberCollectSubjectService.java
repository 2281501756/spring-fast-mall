package com.donghao.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.donghao.common.utils.PageUtils;
import com.donghao.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 20:22:46
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

