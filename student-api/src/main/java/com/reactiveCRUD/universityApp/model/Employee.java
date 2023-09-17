package com.reactiveCRUD.universityApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Document
@ToString
@Builder
@Setter
@Getter
@AllArgsConstructor
public class Employee {
    @Id
    private int id;
    private String fName;
    private String sName;
    private String desigantion;


}
