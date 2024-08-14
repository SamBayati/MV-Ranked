package com.MV_Ranked.MV_RankingForum.repository;

import com.MV_Ranked.MV_RankingForum.model.Comment;
import com.MV_Ranked.MV_RankingForum.model.Post;
import com.MV_Ranked.MV_RankingForum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
