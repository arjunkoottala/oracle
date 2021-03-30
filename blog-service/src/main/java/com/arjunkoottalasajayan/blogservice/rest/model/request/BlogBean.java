package com.arjunkoottalasajayan.blogservice.rest.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogBean {
    private Long blogId;
    private String blogHeading;
    private String blogContent;
    private Long blogTopicId;
    private Long createdUserId;
    private Integer numberOfHits = 0;
    private Timestamp createdTime;
    private Timestamp updatedTime;
}
