package com.pluralSight.plurasightSpringBoot.repositories;

import com.pluralSight.plurasightSpringBoot.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {



}
