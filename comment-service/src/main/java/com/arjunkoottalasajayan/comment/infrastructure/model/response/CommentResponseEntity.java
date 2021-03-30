package com.arjunkoottalasajayan.comment.infrastructure.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponseEntity {
    private Long commentId;
    private String comment;
    private Long commentedUserId;
    private Long commentToId;
    private Integer level;
    private Timestamp createdTime;
    private List<Long> likedUserIds;
    private List<Long> dislikedUserIds;
}
