package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.Category;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface CategoryService extends IService<Category> {

    R<Page> page(int page, int pageSize);

    R<List<Category>> list(Category category);
}
