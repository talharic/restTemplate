package com.talharic.resttemplate.dto.converter;

import com.talharic.resttemplate.dto.PostDto;
import com.talharic.resttemplate.model.Post;
import org.springframework.stereotype.Component;

@Component
public class PostDtoConverter {

    public PostDto convert(Post from) {
        return  PostDto
                .builder()
                .userID(from.getUserID())
                .title(from.getTitle())
                .body(from.getBody())
                .build();
    }

}