/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.dao;

import com.lightech.voyage.entities.Axes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AxesRespository extends JpaRepository<Axes, Long> {

    @Query("select axe from Axes axe where axe.idaxe = :x")
    public List<Axes> chercherAxe(@Param("x") Long code);

}
