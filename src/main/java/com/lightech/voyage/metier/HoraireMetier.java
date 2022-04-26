/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Horaire;
import java.util.List;

public interface HoraireMetier {

    public Horaire saveHoraire(Horaire h);

    public List<Horaire> listHoraire();

    public Horaire updateHoraire(Long id, Horaire h);

    public void deleteHoraire(Long id);

    public Horaire listHoraires(Long id);

}
