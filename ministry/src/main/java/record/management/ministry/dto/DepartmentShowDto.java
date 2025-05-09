package record.management.ministry.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class DepartmentShowDto {

    private UUID id;
    private String departmentCode;
    private String departmentName;
    private String description;
    private Boolean status;


    
}
