package com.project.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.dto.BlogDto;
import com.project.backend.dto.CommentBlogDto;
import com.project.backend.dto.CommentDto;
import com.project.backend.entity.Blog;
import com.project.backend.entity.CommentBlog;
import com.project.backend.entity.Group;
import com.project.backend.service.BlogService;
import com.project.backend.service.CommentBlogService;
import com.project.backend.service.CommentService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/blogs")
@SecurityRequirement(name = "bearerAuth")
public class BlogController {

	private BlogService blogService;
	private CommentBlogService commentService;
	//GetAll
//	 @GetMapping
//	    public ResponseEntity<List<BlogDto>> getAll(){
//	        List<BlogDto> blogs = blogService.getAll();
//	        return ResponseEntity.ok(blogs);
//	    }
	
	
	//GetBlogInGroupPrivate
	 @GetMapping("/public")
    public ResponseEntity<List<BlogDto>> getAll(){
        List<BlogDto> blogs = blogService.findBlogsByGroupStatus();
        return ResponseEntity.ok(blogs);
    }
	
	 
	 @GetMapping("/commentblog/{blogId}")
	 public ResponseEntity<List<CommentBlogDto>> getCommentsByBlog(@PathVariable Long blogId) 
	 {
	     List<CommentBlogDto> comments = commentService.findCommentsByBlogId(blogId);
	     return ResponseEntity.ok(comments);
	 }

	 
	 @GetMapping("{id}")
	    public ResponseEntity<BlogDto> getBlogById(@PathVariable("id") Long blogId){
	        BlogDto blogDto = blogService.getBlogById(blogId);
	        return ResponseEntity.ok(blogDto);
	    }
	 
//	 @GetMapping("/{groupid}/{id}")
//	    public ResponseEntity<List<Blog>> getBloginGroup(@PathVariable("id") Long blogId, @PathVariable("groupid") Long groupId){
//	        List<Blog> blogDto = blogService.findBlogInGroup(groupId);
//	        return ResponseEntity.ok(blogDto);
//	    }
	 

//	    @GetMapping("/group/{groupId}")
//	    public ResponseEntity<List<Blog>> getBlogsByGroup(@PathVariable("groupId") Long groupId) {
//	        List<Blog> blogs = blogService.findBlogInGroup(groupId);
//	        return ResponseEntity.ok(blogs);
//	    }
	 
	   @GetMapping("/group/{groupId}")
	    public List<BlogDto> getBlogsByGroupId(@PathVariable Long groupId) {
	        return blogService.findBlogInGroup(groupId);
	    }
	 
	   
	   @CrossOrigin(origins = "http://localhost:3000")
	   @PostMapping("/group/{groupId}")
	   public ResponseEntity<BlogDto> createBlog(@PathVariable Long groupId, @RequestBody BlogDto blogDto) {
	       Group group = new Group();  
	       group.setId(groupId);       
	       blogDto.setGroup(group);   
	       // Giai quyet cai groupId bang cach nay
	       BlogDto createdBlog = blogService.createBlog(blogDto); 
	       return ResponseEntity.ok(createdBlog);
	   }

	   
//	   @CrossOrigin(origins = "http://localhost:3000")
//	   @PostMapping("/group/{groupId}")
//	   public ResponseEntity<BlogDto> createBlog(@PathVariable Long groupId, @RequestBody BlogDto blogDto) {
//	       BlogDto createdBlog = blogService.createBlog(blogDto, groupId); // Truyền groupId vào service
//	       return ResponseEntity.ok(createdBlog);
//	   }

	   
	 
}
