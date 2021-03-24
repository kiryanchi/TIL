package com.springboot.aws.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 어노테이션 순서를 주요 어노테이션 순으로 정렬
// Lombok 의 경우 Kotlin 으로 가게되면 필요가 없는데
// 이렇게 순서를 정리해둘 경우 Kotlin 으로 갔을 때 쉽게 삭제 가능
@Getter // Lombok Annotation
@NoArgsConstructor // Lombok Annotation
@Entity // JPA Annotation
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
