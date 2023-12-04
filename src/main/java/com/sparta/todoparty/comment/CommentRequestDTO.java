package com.sparta.todoparty.comment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDTO {
    private Long todoId;
    private String text;
}
