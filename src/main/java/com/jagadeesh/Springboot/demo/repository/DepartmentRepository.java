package com.jagadeesh.Springboot.demo.repository;

import com.jagadeesh.Springboot.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);
//    @Query("SELECT d FROM Department d WHERE d.departmentId=:id")
//    public Department fetchDepartmentById(@Param("id") Long departmentId);

//    @Query(value = "SELECT * FROM department WHERE department_id=?1", nativeQuery = true)
//    public Department fetchDepartmentById(Long departmentId);
}
