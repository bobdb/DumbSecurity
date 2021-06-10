package net.bobdb.ReallyDumbSecurity.repositories;

import java.util.Optional;

import net.bobdb.ReallyDumbSecurity.entities.ERole;
import net.bobdb.ReallyDumbSecurity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
