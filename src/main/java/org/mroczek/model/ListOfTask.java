package org.mroczek.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "ListOfTask")
public class ListOfTask {
    @Id
    private String id;
    private String name;
}
