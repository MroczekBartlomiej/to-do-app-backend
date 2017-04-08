package org.mroczek.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "Tasks")
public class Task {

    @Id
    private String id;
    private String listId;
    private String description;

}
