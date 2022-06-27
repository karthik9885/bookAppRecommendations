package com.emids.note.book.recommend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.emids.note.book.recommend.model.Recommend;
import com.emids.note.book.recommend.service.RecommendService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
//@EnableSwagger2
public class RecommendedController {
	@Autowired
	private RecommendService recommendService;
	
	@RequestMapping(value="/bookApp/getRecommendBooksByIdAndUsername",method=RequestMethod.GET)
	public ResponseEntity<?> getBookByReccommendationByIdAndUsername (@RequestParam("id") int id,@RequestParam ("username") String username) 
	{
		
		ResponseEntity<?> rs=null;
		try {
			List<Recommend> b=recommendService.getRecommendBooksByIdAndUsername(id, username);
			if(rs!=null)
			rs=ResponseEntity.status(HttpStatus.OK).body(b);
			else
			rs=ResponseEntity.status(HttpStatus.BAD_REQUEST).body(b);
		}
		catch(Exception e)
		{
			rs=ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
	@GetMapping("/bookApp/getMyRecommendBooks/{username}")
	public ResponseEntity<?> getBookByReccommendation (@PathVariable ("username") String username) 
	{
		
		ResponseEntity<?> rs=null;
		try {
			List<Recommend> b=recommendService.getUsersAllRecommend(username);
			rs=ResponseEntity.status(HttpStatus.OK).body(b);
		}
		catch(Exception e)
		{
			rs=ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
	
	@GetMapping("/bookApp/getAllRecommendBooks")
	public ResponseEntity<?> getAllBooks () 
	{

		ResponseEntity<?> rs=null;
		try {
			List<Recommend> b=recommendService.getAllRecommend();
			
			rs=ResponseEntity.status(HttpStatus.OK).body(b);
		}
		catch(Exception e)
		{
			rs=ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
	
	@PostMapping("/bookApp/addToRecommendBooks")
	public ResponseEntity<?> saveBook(@RequestBody Recommend b) 
	{
		ResponseEntity<?> rs=null;
		try
		{
			Recommend bk=recommendService.saveRecommend(b);
			if(bk!=null)
			{
				rs=ResponseEntity.status(HttpStatus.CREATED).build();
			}
			else
			{
				rs=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		catch(Exception e)
		{
			rs=ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
	@DeleteMapping("/bookApp/unrecommend/{id}/{username}")
	  public ResponseEntity<?> deleteRecommend(@PathVariable("id") String id, @PathVariable("username") String username) {
	    	 
	    ResponseEntity<?> rs=null;		
	    recommendService.deleteFromRecommend(id, username);			
			rs=ResponseEntity.status(HttpStatus.OK).build();	
		return rs;
	    
	  }
	@RequestMapping(value="/addition", method=RequestMethod.GET)
	public ResponseEntity<Integer> addition(@RequestParam("firstnumber") int firstnumber,@RequestParam("secondnumber") int secondnumber){
		int sum=firstnumber+secondnumber;
		return ResponseEntity.status(HttpStatus.OK).body(sum);
				
	}
	

}
