package lab.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lab.Entity.Role;
import lab.Entity.User;

public class MyUserService implements UserDetails {

    private static final long serialVersionUID = 1L;
    private User user;

    public MyUserService(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Role> roles = user.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Có thể tùy chỉnh theo logic của bạn.
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Có thể tùy chỉnh theo logic của bạn.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Có thể tùy chỉnh theo logic của bạn.
    }

    @Override
    public boolean isEnabled() {
        return user.isEnable(); // Sửa tên phương thức để khớp với yêu cầu của `UserDetails`.
    }
}
