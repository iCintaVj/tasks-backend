package com.icinta.tasks.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ColumnTable")
public class Column {
    @Id
    private String id;

    private String name;

    public String getName() {
        return name;
    }
}
