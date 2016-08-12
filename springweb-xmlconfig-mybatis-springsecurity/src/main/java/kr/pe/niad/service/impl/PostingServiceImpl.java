package kr.pe.niad.service.impl;

import kr.pe.niad.domain.Posting;
import kr.pe.niad.repo.PostingRepository;
import kr.pe.niad.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingServiceImpl implements PostingService {

	@Autowired
	private PostingRepository postingRepository;

	@Override
	public Long createPosting(Posting posting) {
		return postingRepository.createPosting(posting);
	}

	@Override
	public Posting findPosting(Long id) {
		return postingRepository.findPosting(id);
	}

	@Override
	public List<Posting> findPostings() {
		return postingRepository.findPostings();
	}

}
