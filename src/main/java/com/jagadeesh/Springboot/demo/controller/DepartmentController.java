package com.jagadeesh.Springboot.demo.controller;

import com.jagadeesh.Springboot.demo.entity.Department;
import com.jagadeesh.Springboot.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;


@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public String fetchDepartmentList(Model model){
        List<Department> departmentList = departmentService.fetchDepartmentList().stream().sorted((d1, d2) -> (int) (d1.getDepartmentId() - d2.getDepartmentId())).toList();
        model.addAttribute("departmentList", departmentList);
        return "index";
    }

    @GetMapping("/department/new")
    public String createDepartmentForm(Model model){
        Department department = new Department();
        model.addAttribute("department", department);
        return "add";
    }

    @PostMapping("/department/save")
    public String saveDepartment(@ModelAttribute("department") Department department){
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }

    @GetMapping("/department/edit/{id}")
    public String editDepartmentForm(@PathVariable("id") Long departmentId, Model model){
        Department department = departmentService.fetchDepartmentById(departmentId);
        model.addAttribute("department", department);
        return "edit";
    }

    @PostMapping ("/department/update/{id}")
    public String updateDepartment(@PathVariable("id") Long departmentId,@ModelAttribute("department") Department department){
        departmentService.updateDepartment(departmentId,department);
        return "redirect:/departments";
    }

    @PostMapping("/department/delete/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "redirect:/departments";
    }


}
