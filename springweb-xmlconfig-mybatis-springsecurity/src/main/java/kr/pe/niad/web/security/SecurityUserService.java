package kr.pe.niad.web.security;

import kr.pe.niad.domain.User;
import kr.pe.niad.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by ned on 6/7/16.
 */
public class SecurityUserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findUserByLoginId(username);

		if (user == null) throw new UsernameNotFoundException("No user found");

		LoginUser loginUser = new LoginUser(user.getLoginId(), user.getPassword(), user.getRole(), user.getName());
		return loginUser;
	}

}
