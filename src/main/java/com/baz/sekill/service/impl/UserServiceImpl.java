package com.baz.sekill.service.impl;

import com.baz.sekill.mapper.SkUserMapper;
import com.baz.sekill.model.SkUser;
import com.baz.sekill.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private SkUserMapper skUserMapper;

    @Override
    public int register(SkUser skUser) {
        int num = skUserMapper.insert(skUser);
        return num;
    }

    @Override
    public SkUser login(SkUser skUser) {
        return skUserMapper.selectByUsernameAndPwd(skUser.getUsername(),skUser.getPassword());
    }
}
