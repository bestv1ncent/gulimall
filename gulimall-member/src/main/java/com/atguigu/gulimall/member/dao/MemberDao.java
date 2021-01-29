package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author best
 * @email 983874606@qq.com
 * @date 2021-01-20 21:29:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
