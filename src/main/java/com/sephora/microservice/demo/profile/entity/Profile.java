package com.sephora.microservice.demo.profile.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sanjaymenonc on 7/9/17.
 */
@Document
public @Data class Profile {

    @Id
    private String atgId;

    @TextIndexed
    private String publicId;

    @TextIndexed
    private String nickName;

    private String biStatus;

    private String engagementStatus;

    private String profileImgUrl;

    private String bgImageUrl;

    private String aboutMe;

    private String youtubeLink;

    private String instagramLink;

    private String yearOfBirth;

    private String firstName;

}
