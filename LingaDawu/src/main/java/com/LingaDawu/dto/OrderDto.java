package com.LingaDawu.dto;

import com.LingaDawu.entity.OrderDetail;
import com.LingaDawu.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * 2022/6/6
 * 15:44
 * 黄佳鑫
 */

@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;


}
