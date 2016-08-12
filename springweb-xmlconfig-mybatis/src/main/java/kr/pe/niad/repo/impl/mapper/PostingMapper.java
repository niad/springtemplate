package kr.pe.niad.repo.impl.mapper;

import kr.pe.niad.common.annotation.Mapper;
import kr.pe.niad.domain.Posting;

import java.util.List;

@Mapper
public interface PostingMapper {

	void insert(Posting posting);

//	void updatePosting(Posting posting);

//	void deletePositing(Long id);

	Posting selectOne(Long id);

	List<Posting> selectList();

}
