package com.cmd.guidebook.repository;

import com.cmd.guidebook.entity.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PageRepository extends JpaRepository<Page, Long> {
}
