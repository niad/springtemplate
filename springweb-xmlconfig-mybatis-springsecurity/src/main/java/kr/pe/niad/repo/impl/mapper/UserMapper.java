package kr.pe.niad.repo.impl.mapper;

import kr.pe.niad.common.annotation.Mapper;
import kr.pe.niad.domain.User;

import java.util.List;

@Mapper
public interface UserMapper {

	void insert(User user);

	User selectOne(Long id);

	User selectByLoginId(String loginId);

	List<User> selectList();

}
