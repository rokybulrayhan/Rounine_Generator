package com.teamOne.developer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.teamOne.developer.entity.Teacher;
@Repository
public interface TeacherRepositroy extends JpaRepository<Teacher, Integer> {

}
