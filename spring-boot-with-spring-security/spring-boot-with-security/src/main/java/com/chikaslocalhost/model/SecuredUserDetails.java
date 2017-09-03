package com.chikaslocalhost.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 6/16/17 Time : 10:18 AM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.chikaslocalhost.model
 * Class Name : SecuredUserDetails
 */
public class SecuredUserDetails implements UserDetails {

    private User user;

    public SecuredUserDetails(User user){
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
