/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.dao;

import com.lightech.voyage.entities.Passager;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Long> {

    Optional<Passager> findByLoginpas(String loginpas);

    Boolean existsByLoginpas(String loginpas);

    Boolean existsByEmailpas(String emailpas);
}
