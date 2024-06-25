package com.otaku.api.controller;

import com.otaku.api.domain.Post;
import com.otaku.api.request.PostCreate;
import com.otaku.api.response.PostResponse;
import com.otaku.api.service.PostService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;


    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate request) {
        postService.write(request);
    }

    @GetMapping("posts/{postId}")
    public PostResponse get(@PathVariable(name = "postId") Long id) {
        PostResponse response = postService.get(id);



        return response;
    }
}
