package com.emids.note.book.recommend.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.emids.note.book.recommend.model.Recommend;

@CrossOrigin(origins = "*")
@Repository
public interface RecommendRepo extends MongoRepository<Recommend, Integer> {
	
	public List<Recommend> findByUsername(String username);

	public Recommend deleteByBookIdAndUsername(String id,String username);
	
	public List<Recommend> findAll();
	
	public List<Recommend> findByBookIdAndUsername(int id,String username);

}

