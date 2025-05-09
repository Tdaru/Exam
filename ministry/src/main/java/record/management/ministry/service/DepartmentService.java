package record.management.ministry.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import record.management.ministry.dto.DepartmentDto;
import record.management.ministry.dto.DepartmentShowDto;
import record.management.ministry.model.Department;
import record.management.ministry.repository.DepartmentRepository;

@Service
@AllArgsConstructor
public class DepartmentService {

    private DepartmentRepository departmentRepository;
      public DepartmentShowDto saveDepartment(DepartmentDto departmentDto)
      {
        Department dep=new Department();
        DepartmentShowDto depShow=new DepartmentShowDto();

     

        dep.setDepartmentCode(departmentDto.getDepartmentCode());
        dep.setDepartmentName(departmentDto.getDepartmentName());
        dep.setDescription(departmentDto.getDescription());
        dep.setStatus(departmentDto.getStatus());

       dep= departmentRepository.save(dep);

       depShow.setId(dep.getId());
       depShow.setDepartmentCode(dep.getDepartmentCode());
       depShow.setDepartmentName(dep.getDepartmentName());
       depShow.setDescription(dep.getDescription());
       depShow.setStatus(dep.getStatus());
        
        return depShow;

      }



    
}
