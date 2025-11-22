package com.aws.springboot_aws.service;

import com.aws.springboot_aws.entity.Document;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface DocumentService {

    Document uploadDocument(MultipartFile file);

    List<Document> getAllDocuments();

    Document getDocument(Long id);

    void deleteDocument(Long id);
}
