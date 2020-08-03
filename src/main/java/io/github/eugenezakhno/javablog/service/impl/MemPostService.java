package io.github.eugenezakhno.javablog.service.impl;

import io.github.eugenezakhno.javablog.dto.Post;
import io.github.eugenezakhno.javablog.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemPostService implements PostService {

    private List<Post> posts = new ArrayList<Post>(Arrays.asList(
            Post.builder()
                .title("First title")
                .body("First body")
                .build(),
            Post.builder()
                .title("Second title")
                .body("Second body")
                .build(),
            Post.builder()
                .title("Third title")
                .body("Third body")
                .build()
        )
    );

    @Override
    public List<Post> search() {
        return posts;
    }
}
