package com.LingaDawu.service.impl;

import com.LingaDawu.entity.OrderDetail;
import com.LingaDawu.mapper.OrderDetailMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.LingaDawu.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}