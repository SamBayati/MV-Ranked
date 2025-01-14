package com.MV_Ranked.MV_RankingForum.repository;

import com.MV_Ranked.MV_RankingForum.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
