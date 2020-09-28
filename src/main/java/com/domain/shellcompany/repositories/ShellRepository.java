package com.domain.shellcompany.repositories;

import com.domain.shellcompany.models.Shell;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShellRepository extends CrudRepository<Shell, Long>
{
    List<Shell> findByName(String name);
    List<Shell> findByModel(String model);
}
