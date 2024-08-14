package com.MV_Ranked.MV_RankingForum.repository;

import com.MV_Ranked.MV_RankingForum.model.Post;
import com.MV_Ranked.MV_RankingForum.model.Subreddit;
import com.MV_Ranked.MV_RankingForum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
