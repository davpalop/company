package org.iesfm.company.controllers;

import org.iesfm.company.dao.DepartmentDAO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private DepartmentDAO departmentDAO;

    public DepartmentController(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }
}
