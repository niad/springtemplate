package kr.pe.niad.service;

import kr.pe.niad.domain.Posting;

import java.util.List;

/**
 * Created by niad on 8/12/16.
 */
public interface PostingService {

	Long createPosting(Posting posting);

	Posting findPosting(Long id);

	List<Posting> findPostings();
}
