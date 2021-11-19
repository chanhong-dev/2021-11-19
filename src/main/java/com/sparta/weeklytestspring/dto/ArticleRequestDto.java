package com.sparta.weeklytestspring.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;

@Setter
@Getter
public class ArticleRequestDto {

    private String title;


    private String content;
}
