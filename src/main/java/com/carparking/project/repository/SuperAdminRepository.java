package com.carparking.project.repository;

import com.carparking.project.entities.Slots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuperAdminRepository extends JpaRepository<Slots, Long> {

    @Query("SELECT s, ro.roleName, ro.responsibilities, ra.duration, ra.charge " +
            "FROM Slots s " +
            "JOIN RoleStaging ro ON s.adminMailId = ro.adminMailId " +
            "JOIN Rates ra ON s.adminMailId = ra.adminMailId")
    List<Object[]> findJoinedData();

}

