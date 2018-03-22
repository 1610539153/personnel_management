package com.iotek.service;

import com.iotek.po.Post;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface PostService {
    boolean addPost(Post post);
    Post checkPost(Post post);
}
