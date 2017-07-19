package com.sephora.microservice.demo.profile.repository;

import com.sephora.microservice.demo.profile.entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by sanjaymenonc on 7/9/17.
 */
public interface ProfileRepository extends MongoRepository<Profile, String> {

    public Profile findByNickName(@Param("nickName") String nickName);

}
