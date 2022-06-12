package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.dto.DishDto;
import com.LingaDawu.entity.Dish;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);

    //根据传过来的id批量或者是单个的删除菜品
    void deleteByIds(List<Long> ids);

    R<Page> page(int page, int pageSize, String name);

    R<List<DishDto>> list(Dish dish);

    R<String> status(@PathVariable("status") Integer status, @RequestParam List<Long> ids);

    R<String> delete(@RequestParam("ids") List<Long> ids);

}
