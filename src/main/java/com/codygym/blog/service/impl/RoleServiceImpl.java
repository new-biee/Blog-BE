package com.codygym.blog.service.impl;

import com.codygym.blog.model.Role;
import com.codygym.blog.repository.RoleRepository;
import com.codygym.blog.service.inteface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Iterable<Role> findAll() {
        return null;
    }

    @Override
    public void save(Role role) {

    }

    @Override
    public Role findByName(String name) {
        return null;
    }
}
