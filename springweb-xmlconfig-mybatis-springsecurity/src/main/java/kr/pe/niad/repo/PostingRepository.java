package kr.pe.niad.repo;

import kr.pe.niad.domain.Posting;

import java.util.List;

public interface PostingRepository {

	Long createPosting(Posting posting);

	Posting findPosting(Long id);

	List<Posting> findPostings();

}
