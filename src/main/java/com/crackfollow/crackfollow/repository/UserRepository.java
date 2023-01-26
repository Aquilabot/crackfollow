package com.crackfollow.crackfollow.repository;

import com.crackfollow.crackfollow.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
    List<User> findByName(String name);
}

