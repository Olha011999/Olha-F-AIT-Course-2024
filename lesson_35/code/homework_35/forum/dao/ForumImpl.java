package homework_35.forum.dao;

import homework_35.forum.model.Post;

import java.time.LocalDate;

public class ForumImpl implements  Forum{

    Post[] posts;
    int size;

    public ForumImpl(int capasity) {
        this.posts = new Post[capasity];
        this.size = 0;
    }

    @Override
    public boolean addPost(Post post) {
        return false;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(String content, int postId) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
