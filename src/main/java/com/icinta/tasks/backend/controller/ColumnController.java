package com.icinta.tasks.backend.controller;

import com.icinta.tasks.backend.model.Column;
import com.icinta.tasks.backend.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/columns")
public class ColumnController {

    private final ColumnService columnService;

    @Autowired
    public ColumnController(ColumnService columnService) {
        this.columnService = columnService;
    }

    @GetMapping
    public List<String> getAllColumns() {
       return columnService.getAllColumns();
    }
    
}