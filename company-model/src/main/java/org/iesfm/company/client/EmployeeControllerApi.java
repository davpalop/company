package org.iesfm.company.client;

import java.util.List;

public interface EmployeeControllerApi {

    List<String> getEmployeesFromSameDepartment(String departmentName);

    List<String> listEmployees();

}
