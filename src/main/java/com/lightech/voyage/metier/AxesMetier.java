/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Axes;
import com.lightech.voyage.model.AxesModel;
import java.util.List;

public interface AxesMetier {

    public Axes saveAxes(AxesModel axesModel);

    public Axes updateAxes(Long id, AxesModel axesModel);

    public List<Axes> listAxes();

    public void deleteAxes(Long id);

    public Axes getAxes(Long id);

    //Liste des reservations par passager
    public List<Axes> listAxes(Long id);
}
