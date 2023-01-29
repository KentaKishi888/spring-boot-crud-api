package com.example.todoapi.repository.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class TaskRecord {

    Long id;
    String title;

}
