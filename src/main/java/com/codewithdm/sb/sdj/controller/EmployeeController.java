package com.codewithdm.sb.sdj.controller;

import com.codewithdm.sb.sdj.entities.Employee;
import com.codewithdm.sb.sdj.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee saveEmp(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/{empId}")
    public Employee retriveEmp(@PathVariable Integer empId){
        Optional<Employee> employee = employeeRepository.findById(empId);
        if(!employee.isPresent()){
            throw new EntityNotFoundException("enitty: "+empId);
        }
        return employee.get();
    }
}
