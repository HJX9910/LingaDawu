package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

public interface UserService extends IService<User> {

    R<String> sendMsg(@RequestBody User user, HttpSession session);
    R<User> login(@RequestBody Map map, HttpSession session);
}
