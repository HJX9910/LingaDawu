package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ShoppingCartService extends IService<ShoppingCart> {
    R<ShoppingCart> add(@RequestBody ShoppingCart shoppingCart);

    R<String> clean();

    R<ShoppingCart> sub(@RequestBody ShoppingCart shoppingCart);

    R<List<ShoppingCart>> listt();
}
