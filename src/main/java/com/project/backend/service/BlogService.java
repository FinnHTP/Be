package com.project.backend.service;

import java.util.List;

import com.project.backend.dto.BlogDto;

import com.project.backend.entity.Blog;

public interface BlogService {
	BlogDto createBlog(BlogDto Dto);
	BlogDto getBlogById(Long blogId);
	List<BlogDto> getAll();
	BlogDto Update(Long blogId ,BlogDto updatedDto);
	void deleteBlog(Long blogId);
	
	  List<BlogDto> findBlogInGroup(Long groupId);
	  List<Blog> findBlogByAccount(Long accountId);
	  List<Blog> findBlogByGame(Long gameId);
//	  List<Blog> getBloginPrivateGroup(Long groupId);
	  List<BlogDto> findBlogsByGroupStatus();
}
