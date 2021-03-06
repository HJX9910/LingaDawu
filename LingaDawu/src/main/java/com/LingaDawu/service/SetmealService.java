package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.dto.SetmealDto;
import com.LingaDawu.entity.Setmeal;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
   void removeWithDish(List<Long> ids);



    /**
     * 根据套餐id修改售卖状态
     * @param status
     * @param ids
     */
    void updateSetmealStatusById(Integer status,List<Long> ids);



    /**
     * 套餐分页查询
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    R<Page> page(int page, int pageSize, String name);

    R<List<Setmeal>> list(Setmeal setmeal);


    SetmealDto getData(Long id);
}
