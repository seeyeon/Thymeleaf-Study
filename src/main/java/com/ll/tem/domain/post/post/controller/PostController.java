package com.ll.tem.domain.post.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/posts")
public class PostController {

	@GetMapping("/write")
	@ResponseBody
	public String showWrite(){
		return """
				<form>
				<form action="/posts/doWrite">
					<input type="text" name="title" placeholder="제목">
					<textarea name="content" placeholder="내용"></textarea>
					<button type="submit">글쓰기</button>
				</form>
				""";
	}

	@GetMapping("/doWrite")
	@ResponseBody
	public String write(String title,String content){
		return """
				 <h1>글쓰기 완료</h1>
				
				 <div>
				   <h2>%s</h2>
				   <p>%s</p>
				   </div>
				""".formatted(title,content);
	}
}
