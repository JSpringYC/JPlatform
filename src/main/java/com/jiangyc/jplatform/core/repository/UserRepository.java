package com.jiangyc.jplatform.core.repository;

import com.jiangyc.jplatform.core.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户表(com_user)数据库操作类
 *
 * @author jiangyc
 */
@Repository
@Transactional(rollbackFor = {SQLException.class})
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * 根据用户名模糊查询出所有用户，并分页显示
     *
     * @param name 要模糊查询的用户名
     * @param pageable 分页信息
     * @return 用户名和给定用户名相似的用户的集合
     */
    List<User> findByNameLike(String name, Pageable pageable);
}
