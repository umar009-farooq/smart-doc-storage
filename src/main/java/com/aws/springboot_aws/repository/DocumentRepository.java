package com.aws.springboot_aws.repository;

import com.aws.springboot_aws.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
