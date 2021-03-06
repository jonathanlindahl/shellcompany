package com.domain.shellcompany.services;

import com.domain.shellcompany.models.Shell;
import com.domain.shellcompany.repositories.ShellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShellService
{
    @Autowired
    private ShellRepository shellRepository;
    
    public List<Shell> getAll()
    {
        return (List<Shell>) shellRepository.findAll();
    }
    
    public List<Shell> getByModel(String model)
    {
        return shellRepository.findByModel(model);
    }
    
    public List<Shell> getByName(String name)
    {
        return shellRepository.findByName(name);
    }
    
    public Shell add(Shell shell)
    {
        return shellRepository.save(shell);
    }
}
