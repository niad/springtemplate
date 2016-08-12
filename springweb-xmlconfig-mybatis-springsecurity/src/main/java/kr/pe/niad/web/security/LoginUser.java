package kr.pe.niad.web.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ned on 6/7/16.
 */
public class LoginUser implements UserDetails {
	private static final long serialVersionUID = -8235809413605964581L;

	private String username;
	private String password;
	private List<GrantedAuthority> authorities;
	private String role;
	private String name;


	public LoginUser(String username, String password, String role, String name) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.name = name;

		if (role != null) {
			this.authorities = new ArrayList<>();
			this.authorities.add(new SimpleGrantedAuthority(role));
		}

	}

	public static LoginUser getLoginUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication.getPrincipal() instanceof LoginUser) {
			LoginUser loginUser = (LoginUser) authentication.getPrincipal();
			return loginUser;
		}
		return null;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
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

	public String getName() {
		return name;
	}

}
