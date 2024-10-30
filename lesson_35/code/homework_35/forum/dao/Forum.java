package homework_35.forum.dao;

import homework_35.forum.model.Post;

import java.time.LocalDate;

public interface Forum {

    boolean addPost(Post post);
    boolean removePost(int postId);
    boolean updatePost(String content, int postId);
    Post getPostById(int postId);
    Post[] getPostByAuthor(String author);
    Post[] getPostByAuthor(String author, LocalDate dateFrom, LocalDate dateTo);
    int size();



}
