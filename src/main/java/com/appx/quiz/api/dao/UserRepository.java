package com.appx.quiz.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UsersDao, Integer> {
    /**
     * 獲取所有使用者資訊
     * @return
     */
    @Query(value = "select * from employee", nativeQuery = true)
    List<UsersDao> getFindAll();
}
