package com.iotek.service.impl;

import com.iotek.dao.PostDao;
import com.iotek.po.Post;
import com.iotek.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service(value = "postService")
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDao postDao;
    @Override
    public boolean addPost(Post post){
        return postDao.addPost(post);
    }

    @Override
    public Post checkPost(Post post) {
        return postDao.checkPost(post);
    }

    @Override
    public List<Post> queryPostUpdateEmp() {
        return postDao.queryPostUpdateEmp();
    }

    @Override
    public List<Post> queryPostByDepartmentId(Post post) {
        return postDao.queryPostByDepartmentId(post);
    }
}
