package com.divyansh.fullstacklabs.springSecurityApplication.repositories;

import com.divyansh.fullstacklabs.springSecurityApplication.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
