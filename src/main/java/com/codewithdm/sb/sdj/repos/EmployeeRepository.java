package com.codewithdm.sb.sdj.repos;

import com.codewithdm.sb.sdj.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
