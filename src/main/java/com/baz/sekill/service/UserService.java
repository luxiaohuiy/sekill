package com.baz.sekill.service;

import com.baz.sekill.model.SkUser;

public interface UserService {

    /**
     * 注册
     * @param skUser
     */
    int register(SkUser skUser);

    /**
     * 登陆
     * @param skUser
     * @return
     */
    SkUser login(SkUser skUser);
}
