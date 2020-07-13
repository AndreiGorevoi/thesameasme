package com.tms.sameasme.service.post;

import com.tms.sameasme.model.tag.ETag;
import com.tms.sameasme.model.post.Post;

import java.util.Date;
import java.util.List;

public interface PostService {
    List<Post> getAll();
    List<Post> getAllByTag(ETag tag);
    Post getPostById(Long id);
    Post savePost(Post post);
    List<Post> getAllOrOrderByMatchDate();
    boolean deletePostById(Long id);
    List<Post> getAllFromToDate(Date fromDate, Date toDate);
}
