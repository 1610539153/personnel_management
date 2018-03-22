package com.iotek.dao;

import com.iotek.po.Post;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface PostDao {
   boolean addPost(Post post);
   Post checkPost(Post post);


}
