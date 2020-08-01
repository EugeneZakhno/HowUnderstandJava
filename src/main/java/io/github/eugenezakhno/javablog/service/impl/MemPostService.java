package io.github.eugenezakhno.javablog.service.impl;

import io.github.eugenezakhno.javablog.dto.Post;
import io.github.eugenezakhno.javablog.service.api.PostService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemPostService implements PostService {

    private List<Post> posts = new ArrayList<>(Arrays.asList());

    @Override
    public List<Post> search() {
        return null;
    }
}
