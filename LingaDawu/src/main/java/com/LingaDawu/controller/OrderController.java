package com.LingaDawu.controller;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.Orders;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.LingaDawu.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 订单
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    /**
     * 用户下单
     * @param orders
     * @return
     */
    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        log.info("订单数据：{}",orders);
        orderService.submit(orders);
        return R.success("下单成功");
    }







    @GetMapping("/userPage")
    public R<Page> page(int page, int pageSize){
     return orderService.page(page,pageSize);
    }


    /**
     * 后台查询订单明细
     * @param page
     * @param pageSize
     * @param number
     * @param beginTime
     * @param endTime
     * @return
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String number,String beginTime,String endTime){
       return orderService.page(page,pageSize,number,beginTime,endTime);
    }

  // 修改订单状态
     @PutMapping
    public R<String> orderStatusChange(@RequestBody Map<String,String> map){
         return orderService.orderStatusChange(map);

    }
}