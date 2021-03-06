package com.sparta.weeklytestspring.service;

import com.sparta.weeklytestspring.domain.Article;
import com.sparta.weeklytestspring.dto.ArticleRequestDto;
import com.sparta.weeklytestspring.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article setArticle(ArticleRequestDto articleRequestDto){
        Article article = new Article();
        article.setContent(articleRequestDto.getContent());
        article.setTitle(articleRequestDto.getTitle());

        articleRepository.save(article);
        return article;
    }

    public Article getArticle(Long id){
        return articleRepository.findById(id).get();
    }

    public List<Article> getAllArticle(){
        return articleRepository.findAll();
    }
}
