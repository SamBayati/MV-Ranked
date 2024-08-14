package com.MV_Ranked.MV_RankingForum.repository;

import com.MV_Ranked.MV_RankingForum.model.Post;
import com.MV_Ranked.MV_RankingForum.model.User;
import com.MV_Ranked.MV_RankingForum.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}