package kr.pe.niad.service;

import kr.pe.niad.domain.User;

import java.util.List;

public interface UserService {

	Long createUser(User user);

	User findUser(Long id);

	User findUserByLoginId(String loginId);

	List<User> findUsers();

}
