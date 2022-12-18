package com.within.organizationservice.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "v1/organization")
public class OrganizationController {

    @RolesAllowed({"ADMIN", "USER"})
    @GetMapping(value = "/{organizationId}")
    public ResponseEntity<?> getOrganization(@PathVariable("organizationId") String organizationId) {
        return ResponseEntity.ok("조회 성공");
    }

    @RolesAllowed("ADMIN")
    @DeleteMapping(value = "/{organizationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteLicense(@PathVariable("organizationId") String organizationId) {
        return ResponseEntity.ok("삭제 성공");
    }

}
