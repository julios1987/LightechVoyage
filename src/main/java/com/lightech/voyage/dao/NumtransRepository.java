/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.dao;

import com.lightech.voyage.entities.Numtrans;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NumtransRepository extends CrudRepository<Numtrans, Long>, JpaRepository<Numtrans, Long> {

    @Query("select num from Numtrans num where num.anne = :x and num.mois = :y")
    public List<Numtrans> sommeNumtrans(
            @Param("x") Long anne,
            @Param("y") Long mois);

    @Query("select num.idnum from Numtrans num where num.anne = :x and num.mois = :y")
    public Long identifiantNumtrans(
            @Param("x") Long anne,
            @Param("y") Long mois);

    @Query("update Numtrans num set num.sequences = :seq where num.idnum = :x")
    public void updateNumtrans(
            @Param("seq") Long sequences,
            @Param("x") Long idnum);

    @Modifying
    @Query("update Numtrans num set num.sequences = :seq where num.idnum = :x")
    public void updateNum(
            @Param("seq") Long sequences,
            @Param("x") Long idnum);
}
