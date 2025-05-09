package record.management.ministry.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import record.management.ministry.dto.DepartmentDto;
import record.management.ministry.dto.DepartmentShowDto;
import record.management.ministry.service.DepartmentService;


@RestController
@RequestMapping("/api/department")
@AllArgsConstructor

public class DepartmentController {
   
    
    private DepartmentService departmentService;
    @PostMapping
    public DepartmentShowDto saveDepartment (@RequestBody DepartmentDto departmentDto)
    {

        return departmentService.saveDepartment(departmentDto);
    }



    
}
