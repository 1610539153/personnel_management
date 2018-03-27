package com.iotek.service;

import com.iotek.po.Post;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface PostService {
    boolean addPost(Post post);
    Post checkPost(Post post);
    List<Post> queryPostUpdateEmp();
    List<Post> queryPostByDepartmentId(Post post);
}
