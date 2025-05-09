package record.management.ministry.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import record.management.ministry.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,UUID>{

    

    
}
