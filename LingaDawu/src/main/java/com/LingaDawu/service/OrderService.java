package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.OrderDetail;
import com.LingaDawu.entity.Orders;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
     void submit(Orders orders);


    /**
     * 后台查询订单明细
     * @param page
     * @param pageSize
     * @param number
     * @param beginTime
     * @param endTime
     * @return
     */
    R<Page> page(int page, int pageSize, String number, String beginTime, String endTime);

//修改订单状态
    R<String> orderStatusChange(@RequestBody Map<String,String> map);


    List<OrderDetail> getOrderDetailListByOrderId(Long orderId);



    R<Page> page(int page, int pageSize);
}
