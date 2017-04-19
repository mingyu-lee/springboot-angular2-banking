package com.userfront.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by 이민규 on 2017-04-19.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
