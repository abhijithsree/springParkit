package com.carparking.project;

import com.carparking.project.entities.Role;
import com.carparking.project.entities.RoleStaging;
import com.carparking.project.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/allRoles")
    @CrossOrigin("*")
    public ResponseEntity<List<Role>> getAllRoles() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @GetMapping("/stagedRoles")
    @CrossOrigin("*")
    public ResponseEntity<List<RoleStaging>> getAllStagedRoles() {
        return ResponseEntity.ok(roleService.getAllStagedRoles());
    }
}
