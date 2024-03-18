package edu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.main.model.Mark;

public interface MarkRepository extends JpaRepository<Mark ,Integer> {

}
