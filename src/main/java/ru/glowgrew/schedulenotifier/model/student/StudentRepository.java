package ru.glowgrew.schedulenotifier.model.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllStudentsByGroup_DisplayName(String displayName);

}
