package com.example.todoapi.service.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class TaskEntity {

    long id;
    String title;

}
