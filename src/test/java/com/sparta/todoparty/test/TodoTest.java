package com.sparta.todoparty.test;

import com.sparta.todoparty.todo.Todo;
import com.sparta.todoparty.todo.TodoRequestDTO;
import com.sparta.todoparty.todo.TodoResponseDTO;

public interface TodoTest extends CommonTest {

    Long TEST_TODO_ID = 1L;
    String TEST_TODO_TITLE = "title";
    String TEST_TODO_CONTENT = "content";

    TodoRequestDTO TEST_TODO_REQUEST_DTO = TodoRequestDTO.builder()
            .title(TEST_TODO_TITLE)
            .content(TEST_TODO_CONTENT)
            .build();
    TodoResponseDTO TEST_TODO_RESPONSE_DTO = TodoResponseDTO.builder()
            .title(TEST_TODO_TITLE)
            .content(TEST_TODO_CONTENT)
            .build();
    Todo TEST_TODO = Todo.builder()
            .title(TEST_TODO_TITLE)
            .content(TEST_TODO_CONTENT)
            .build();
    Todo TEST_ANOTHER_TODO = Todo.builder()
            .title(ANOTHER_PREFIX + TEST_TODO_TITLE)
            .content(ANOTHER_PREFIX + TEST_TODO_CONTENT)
            .build();
}
