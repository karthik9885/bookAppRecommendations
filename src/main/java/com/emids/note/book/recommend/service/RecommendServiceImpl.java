package com.emids.note.book.recommend.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.emids.note.book.recommend.model.Recommend;
import com.emids.note.book.recommend.repo.RecommendRepo;
@Service
public class RecommendServiceImpl implements RecommendService{
	
	private static Logger logger=LoggerFactory.getLogger(RecommendServiceImpl.class);
	@Autowired
	private RecommendRepo fr;

	@Override
	public Recommend deleteFromRecommend(String id, String username) {
		Recommend fa = null;
		try {
		
			 fa =fr.deleteByBookIdAndUsername(id,username);
			
		}
		catch(Exception e)
		{
			logger.error("Error while deleting from recommend");
		}
		
		return fa;
	}

	@Override
	public List<Recommend> getRecommendBooksByIdAndUsername(int id, String username) {
		
		List<Recommend> o=fr.findByBookIdAndUsername(id, username);
		if(!o.isEmpty())
		{
			return o;
		}
		return null;
	}

	@Override
    public Recommend saveRecommend(Recommend f) {
		
		return fr.save(f);
	}
	@Override
       public List<Recommend> getUsersAllRecommend(String username) {
		
		List<Recommend> o=fr.findByUsername(username);
		if(!o.isEmpty())
		{
			return o;
		}
		return null;
	}
	@Override
      public List<Recommend> getAllRecommend() {
	
		
		
		List<Recommend> o=fr.findAll();
		if(!o.isEmpty())
		{
			return o;
		}
		return null;
	}

	

	

}
