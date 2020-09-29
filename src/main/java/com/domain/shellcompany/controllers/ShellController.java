package com.domain.shellcompany.controllers;

import com.domain.shellcompany.models.Shell;
import com.domain.shellcompany.services.ShellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShellController
{
    @Autowired
    ShellService shellService;
    
    @GetMapping("/shell/allshells")
    public List<Shell> getShells()
    {
        return shellService.getAll();
    }
    
    @GetMapping("/shell/shellsbymodel")
    public List<Shell> getByModel(@RequestParam String model)
    {
        return shellService.getByModel(model);
    }
    
    @GetMapping("/shell/shellsbyname")
    public List<Shell> getByName(@RequestParam String name)
    {
        return shellService.getByName(name);
    }
    
    @PostMapping("/shell/addshell")
    public Shell postShell(@RequestBody Shell shell)
    {
        return shellService.add(shell);
    }
}
