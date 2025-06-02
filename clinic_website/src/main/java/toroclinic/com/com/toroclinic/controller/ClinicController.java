public class ClinicController {
    package com.toroclinic.controller;

import com.toroclinic.model.Clinic;
import com.toroclinic.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {

    @Autowired
    private ClinicRepository clinicRepository;

    // Fetch all clinic details
    @GetMapping
    public List<Clinic> getClinicInfo() {
        return clinicRepository.findAll();
    }

    // Add a new clinic
    @PostMapping
    public Clinic addClinic(@RequestBody Clinic clinic) {
        return clinicRepository.save(clinic);
    }

    // Fetch clinic by ID
    @GetMapping("/{id}")
    public Clinic getClinicById(@PathVariable Long id) {
        return clinicRepository.findById(id).orElse(null);
    }

    // Update clinic details
    @PutMapping("/{id}")
    public Clinic updateClinic(@PathVariable Long id, @RequestBody Clinic clinicDetails) {
        Clinic clinic = clinicRepository.findById(id).orElse(null);
        if (clinic != null) {
            clinic.setName(clinicDetails.getName());
            clinic.setAddress(clinicDetails.getAddress());
            clinic.setPhone(clinicDetails.getPhone());
            clinic.setHours(clinicDetails.getHours());
            return clinicRepository.save(clinic);
        }
        return null;
    }

    // Delete a clinic
    @DeleteMapping("/{id}")
    public void deleteClinic(@PathVariable Long id) {
        clinicRepository.deleteById(id);
    }
}


}
