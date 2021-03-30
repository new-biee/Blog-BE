package com.codygym.blog.service.inteface;

import com.codygym.blog.model.Role;

public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}

