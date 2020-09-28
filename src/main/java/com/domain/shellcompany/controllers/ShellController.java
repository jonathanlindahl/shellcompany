package com.domain.shellcompany.controllers;

import com.domain.shellcompany.models.Shell;
import com.domain.shellcompany.repositories.ShellRepository;
import com.domain.shellcompany.services.ShellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShellController
{
    @Autowired
    ShellService shellService;
    
    @GetMapping("/allshells")
    public List<Shell> getShells()
    {
        return shellService.getAll();
    }
    
    @PostMapping("/addshell")
    public Shell postShell(@RequestBody Shell shell)
    {
        return shellService.add(shell);
    }
}
