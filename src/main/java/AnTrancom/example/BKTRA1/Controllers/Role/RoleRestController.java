package com.example.TranThiVIetAn_BtapKtra.Controllers.Role;

import com.example.TranThiVIetAn_BtapKtra.Entities.Role;
import com.example.TranThiVIetAn_BtapKtra.RequestEntities.Role.RequestCreateRole;
import com.example.TranThiVIetAn_BtapKtra.RequestEntities.Role.RequestUpdateRole;
import com.example.TranThiVIetAn_BtapKtra.Services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/roles")
public class RoleRestController {
    @Autowired
    private RoleServices roleServices;

    @GetMapping("")
    public List<Role> getAllRoles(){
        return roleServices.getAllRoles();
    }

    @PostMapping
    public Role CreateRole(@RequestBody RequestCreateRole role){
        return roleServices.CreateRole(role);
    }
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable String id) {
        return roleServices.getRoleById(id);
    }
    @PutMapping("/{id}")
    public Role updateRole(@PathVariable String id, @RequestBody RequestUpdateRole role) {
        return roleServices.UpdateRole( role);
    }
}
