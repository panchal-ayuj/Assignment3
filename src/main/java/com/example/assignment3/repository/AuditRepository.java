package com.example.assignment3.repository;

import com.example.assignment3.AuditEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<AuditEntry, Long> {
}
