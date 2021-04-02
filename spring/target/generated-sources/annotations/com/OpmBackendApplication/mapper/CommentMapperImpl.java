package com.OpmBackendApplication.mapper;

import javax.annotation.Generated;

import com.OpmBackendApplication.dto.CommentsDto;
import com.OpmBackendApplication.mapper.CommentsMapper;
import com.OpmBackendApplication.model.Comment;
import com.OpmBackendApplication.model.Post;
import com.OpmBackendApplication.model.User;

import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-31T09:38:32+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentsMapper {

    @Override
    public Comment map(CommentsDto commentsDto, Post post, User user) {
        if ( commentsDto == null && post == null && user == null ) {
            return null;
        }

        Comment comment = new Comment();

        if ( commentsDto != null ) {
            comment.setText( commentsDto.getText() );
        }
        if ( post != null ) {
            comment.setPost( post );
        }
        if ( user != null ) {
            comment.setUser( user );
        }
        comment.setCreatedDate( java.time.Instant.now() );

        return comment;
    }

    @Override
    public CommentsDto mapToDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentsDto commentsDto = new CommentsDto();

        commentsDto.setId( comment.getId() );
        commentsDto.setCreatedDate( comment.getCreatedDate() );
        commentsDto.setText( comment.getText() );

        commentsDto.setUserName( comment.getUser().getUsername() );
        commentsDto.setPostId( comment.getPost().getPostId() );

        return commentsDto;
    }
}
