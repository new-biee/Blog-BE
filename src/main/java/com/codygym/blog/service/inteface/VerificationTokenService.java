package com.codygym.blog.service.inteface;


import com.codygym.blog.model.VerificationToken;

public interface
VerificationTokenService {
    VerificationToken findByToken(String token);

    void save(VerificationToken token);
}