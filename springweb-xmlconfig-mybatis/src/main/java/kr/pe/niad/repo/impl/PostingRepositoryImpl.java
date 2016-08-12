package kr.pe.niad.repo.impl;


import kr.pe.niad.domain.Posting;
import kr.pe.niad.repo.PostingRepository;
import kr.pe.niad.repo.impl.mapper.PostingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostingRepositoryImpl implements PostingRepository {

	@Autowired
	private PostingMapper postingMapper;

	@Override
	public Long createPosting(Posting posting) {
		postingMapper.insert(posting);
		return posting.getId();
	}

	@Override
	public Posting findPosting(Long id) {
		return postingMapper.selectOne(id);
	}

	@Override
	public List<Posting> findPostings() {
		return postingMapper.selectList();
	}

}
