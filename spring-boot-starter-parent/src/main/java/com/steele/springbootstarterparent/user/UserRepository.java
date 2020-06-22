package com.steele.springbootstarterparent.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    //Spring Data JPA will provide implementations for repo CRUD methods
    
}