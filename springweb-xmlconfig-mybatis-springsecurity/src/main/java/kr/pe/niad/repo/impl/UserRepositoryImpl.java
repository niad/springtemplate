package kr.pe.niad.repo.impl;

import kr.pe.niad.domain.User;
import kr.pe.niad.repo.UserRepository;
import kr.pe.niad.repo.impl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Long createUser(User user) {
		userMapper.insert(user);
		return user.getId();
	}

	@Override
	public User findUser(Long id) {
		return userMapper.selectOne(id);
	}

	@Override
	public User findUserByLoginId(String loginId) {
		return userMapper.selectByLoginId(loginId);
	}

	@Override
	public List<User> findUsers() {
		return userMapper.selectList();
	}
}
