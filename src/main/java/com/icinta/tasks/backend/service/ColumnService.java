package com.icinta.tasks.backend.service;

import com.icinta.tasks.backend.model.Column;
import com.icinta.tasks.backend.repository.ColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColumnService {

    private final ColumnRepository columnRepository;

    @Autowired
    public ColumnService(ColumnRepository columnRepository) {
        this.columnRepository = columnRepository;
    }

    public List<String> getAllColumns() {
         List<String> columnNames = new ArrayList<>();
        for(Column column : columnRepository.findAll()) {
            columnNames.add(column.getName());
        }
        System.out.println("Columns: " + columnNames.toString());
        return columnNames;
    }
}