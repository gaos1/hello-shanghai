package com.apollo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by Simon on 3/1/16.
 */
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

    @RestResource(path="by-name")
    Collection<User> findByName(@Param("name") String name);
}