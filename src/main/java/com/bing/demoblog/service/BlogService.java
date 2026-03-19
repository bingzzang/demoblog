package com.bing.demoblog.service;

import com.bing.demoblog.domain.Article;
import com.bing.demoblog.dto.AddArticleRequest;
import com.bing.demoblog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메소드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
