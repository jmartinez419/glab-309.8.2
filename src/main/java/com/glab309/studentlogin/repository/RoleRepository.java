package com.glab309.studentlogin.repository;

import com.glab309.studentlogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
