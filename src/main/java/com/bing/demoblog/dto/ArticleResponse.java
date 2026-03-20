package com.bing.demoblog.dto;

import com.bing.demoblog.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article aticle){
        this.title = aticle.getTitle();
        this.content = aticle.getContent();
    }
}
