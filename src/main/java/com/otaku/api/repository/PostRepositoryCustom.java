package com.otaku.api.repository;

import com.otaku.api.domain.Post;
import com.otaku.api.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {
    List<Post> getList(PostSearch postSearch);
}
