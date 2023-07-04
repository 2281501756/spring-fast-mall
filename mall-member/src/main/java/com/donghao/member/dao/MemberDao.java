package com.donghao.member.dao;

import com.donghao.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dong-hao
 * @email 2281501756@gmail.com
 * @date 2023-07-04 20:22:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
