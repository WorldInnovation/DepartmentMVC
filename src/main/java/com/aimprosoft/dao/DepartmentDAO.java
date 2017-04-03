package com.aimprosoft.dao;

import com.aimprosoft.model.Department;

import java.sql.SQLException;
import java.util.Collection;

public interface DepartmentDAO {

    void delete (Department department) throws  SQLException;
    void update (Department department) throws  SQLException;
    Collection <Department> getAll () throws SQLException;
    Department getDepByID(Department department) throws SQLException;
    Department existNameInDB( Department depName) throws SQLException;
}