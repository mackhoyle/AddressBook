package com.example.myapplication.controller;

import com.example.myapplication.buddy.AddressRepository;
import com.example.myapplication.buddy.BuddyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
public class BuddyController {

    @Autowired
    private AddressRepository repo;

    @GetMapping(path = "/addressBook")
    public List<BuddyInfo> retrieveBuddys(){
        return repo.findAll();
    }

    @PostMapping(path = "/addBuddy")
    public void addBuddy(@RequestBody BuddyInfo bud){
        BuddyInfo savedBuddy = repo.save(bud);
    }

    @DeleteMapping(path = "/deleteBuddy/{id}")
    public void deleteBuddy(@RequestBody Long id){
        repo.deleteById(id);
    }

}
