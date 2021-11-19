package com.sparta.weeklytestspring.controller;

import com.sparta.weeklytestspring.domain.Article;
import com.sparta.weeklytestspring.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
public class TestController {

    private final ArticleService articleService;

    @GetMapping("/article/{id}")
    public String getArticle(@PathVariable Long id, Model model){
        model.addAttribute("title", articleService.getArticle(id).getTitle());
        model.addAttribute("content", articleService.getArticle(id).getTitle());
        return "view";
    }
}
