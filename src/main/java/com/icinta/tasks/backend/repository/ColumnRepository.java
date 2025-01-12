package com.icinta.tasks.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icinta.tasks.backend.model.Column;

public interface ColumnRepository extends JpaRepository<Column, Long> {
}

