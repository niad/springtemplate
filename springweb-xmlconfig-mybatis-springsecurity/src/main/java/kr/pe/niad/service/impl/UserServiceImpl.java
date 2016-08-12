package kr.pe.niad.service.impl;

import kr.pe.niad.domain.User;
import kr.pe.niad.repo.UserRepository;
import kr.pe.niad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Long createUser(User user) {
		return userRepository.createUser(user);
	}

	@Override
	public User findUser(Long id) {
		return userRepository.findUser(id);
	}

	@Override
	public User findUserByLoginId(String loginId) {
		return userRepository.findUserByLoginId(loginId);
	}

	@Override
	public List<User> findUsers() {
		return userRepository.findUsers();
	}

}
