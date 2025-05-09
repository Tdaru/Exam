package record.management.ministry.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Department {

@Id
@GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String departmentCode;
    private String departmentName;
    private String description;
    private Boolean status;
    
}
