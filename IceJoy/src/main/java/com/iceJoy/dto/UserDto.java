package com.iceJoy.dto;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by user on 18.04.2016.
 */
public class UserDto {

    private String name;
    private String password;
    private Collection<? extends GrantedAuthority> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }


}
