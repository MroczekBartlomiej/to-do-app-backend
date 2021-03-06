package org.mroczek.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ListCreateRequest {

    public ListCreateRequest(){}

    private String listName;
}
