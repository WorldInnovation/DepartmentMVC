package com.aimprosoft.dao;

import com.aimprosoft.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void delete (Employee employee) throws  SQLException;
    void update ( Employee employee) throws SQLException;
    List<Employee> getAll(Long depID) throws SQLException;
    Employee getEmpByID (Employee employee) throws SQLException;
}