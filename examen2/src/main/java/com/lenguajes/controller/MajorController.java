package com.lenguajes.controller;


import com.lenguajes.examen2.Major;
import com.lenguajes.examen2.MajorDTO;
import com.lenguajes.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin
public class MajorController {

    @Autowired
    private MajorService majorService;

    @GetMapping("/Major/ListAll")
    public List<Major> ListAll() throws SQLException {return majorService.ListMajor();}

    @GetMapping("/Major/GetById")
    public Major GetById(@RequestParam(value = "MajorId") Integer MajorId) throws SQLException { return majorService.GetMajorById(MajorId);}

    @DeleteMapping("/Major/Delete")
    public void Delete(@RequestParam(value = "MajorId") Integer MajorId)throws SQLException {majorService.DeleteMajor(MajorId);}

    @PutMapping("/Major/Update")
    public void Update(@RequestBody Major major) throws SQLException {majorService.UpdateMajor(major);}

    @PostMapping("/Major/Add")
    public void Add(@RequestBody MajorDTO majorDTO)throws SQLException {majorService.AddMajor(majorDTO);}
}
