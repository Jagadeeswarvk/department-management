package com.jagadeesh.Springboot.demo.service;

import com.jagadeesh.Springboot.demo.entity.Department;
import com.jagadeesh.Springboot.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl  implements DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        //return departmentRepository.fetchDepartmentById(departmentId);
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department depDB= departmentRepository.findById(departmentId).get();
        depDB.setDepartmentName(department.getDepartmentName());
        depDB.setDepartmentAddress(department.getDepartmentAddress());
        depDB.setDepartmentCode(department.getDepartmentCode());
        return departmentRepository.save(depDB);
    }
}
