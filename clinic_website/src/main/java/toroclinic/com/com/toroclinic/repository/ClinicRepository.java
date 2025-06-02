public class ClinicRepository {
    package com.toroclinic.repository;

import com.toroclinic.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {
    // JpaRepository provides built-in database operations like:
    // - findAll() -> Get all clinics
    // - save() -> Add a new clinic
    // - findById() -> Find a clinic by ID
}


}
