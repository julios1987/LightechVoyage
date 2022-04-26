/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Passager;
import com.lightech.voyage.model.PassagerModel;
import java.util.List;

public interface PassagerMetier {

    public Passager savePassager(PassagerModel passagerModel);

    public Passager updatePassager(Long id, PassagerModel passagerModel);

    public Passager getPassager(Long code);

    public List<Passager> listPassager();
}
