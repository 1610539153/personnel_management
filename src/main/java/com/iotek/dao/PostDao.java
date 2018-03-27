package com.iotek.dao;

import com.iotek.po.Post;
import javafx.geometry.Pos;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface PostDao {
   boolean addPost(Post post);
   Post checkPost(Post post);
   List<Post> queryPostUpdateEmp();
   List<Post> queryPostByDepartmentId(Post post);

}
