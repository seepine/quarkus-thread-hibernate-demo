package com.example.dao;

import com.example.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

@Singleton
public class UserDao implements PanacheRepositoryBase<User, Long> {

  @Transactional
  public void save(User entities) {
    persist(entities);
  }
}
