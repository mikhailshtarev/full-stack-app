package com.shtarev.FullApp.repository;

import com.shtarev.FullApp.Entity.security.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {

    UserEntity getByUsername(String username);
}
