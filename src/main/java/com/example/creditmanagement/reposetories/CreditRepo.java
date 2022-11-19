package com.example.creditmanagement.reposetories;

import com.example.creditmanagement.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CreditRepo extends JpaRepository<Credit,Long> {
}
