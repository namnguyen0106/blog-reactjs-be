package com.mon.projectbase.repository;

import com.mon.projectbase.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends BaseRepository<Blog>, JpaRepository<Blog, Long> {
}
