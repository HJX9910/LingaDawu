package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.Employee;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

public interface EmployeeService extends IService<Employee> {


    R<Employee> login(HttpServletRequest request, @RequestBody Employee employee);

    R<String> save(HttpServletRequest request,@RequestBody Employee employee);
    R<Page> page(int page, int pageSize, String name);
    R<String> update(HttpServletRequest request,@RequestBody Employee employee);

}
