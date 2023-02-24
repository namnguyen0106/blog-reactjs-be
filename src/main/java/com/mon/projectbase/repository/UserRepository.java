package com.mon.projectbase.repository;

import com.mon.projectbase.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends BaseRepository<Users>, JpaRepository<Users, Long> {
}
