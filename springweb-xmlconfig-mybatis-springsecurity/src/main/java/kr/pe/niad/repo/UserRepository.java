package kr.pe.niad.repo;

import kr.pe.niad.domain.User;

import java.util.List;

public interface UserRepository {

	Long createUser(User user);

	User findUser(Long id);

	User findUserByLoginId(String loginId);

	List<User> findUsers();

}
