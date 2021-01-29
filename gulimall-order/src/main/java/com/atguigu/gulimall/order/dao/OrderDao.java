package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author best
 * @email 983874606@qq.com
 * @date 2021-01-20 21:42:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
