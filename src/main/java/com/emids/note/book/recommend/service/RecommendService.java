package com.emids.note.book.recommend.service;
import java.util.List;

import com.emids.note.book.recommend.model.Recommend;

public interface RecommendService {
	public Recommend saveRecommend(Recommend f);
	public List<Recommend> getUsersAllRecommend (String username);
	
	
	public List<Recommend> getAllRecommend();

	public List<Recommend> getRecommendBooksByIdAndUsername(int id, String username);
	
	public Recommend deleteFromRecommend(String id, String username);

}
