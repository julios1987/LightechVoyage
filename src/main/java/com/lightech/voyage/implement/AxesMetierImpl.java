/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.implement;

import com.lightech.voyage.entities.Axes;
import com.lightech.voyage.metier.AxesMetier;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lightech.voyage.dao.AxesRespository;
import com.lightech.voyage.dao.CompagnieRepository;
import com.lightech.voyage.dao.HoraireRepository;
import com.lightech.voyage.dao.VilleRepository;
import com.lightech.voyage.model.AxesModel;

@Service
public class AxesMetierImpl implements AxesMetier {

    @Autowired
    private AxesRespository axesRespository;
    @Autowired
    private CompagnieRepository compagnieRepository;
    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private HoraireRepository horaireRepository;

    @Override
    public Axes saveAxes(AxesModel axesModel) {
        Axes axes = new Axes();
        axes.setVille(villeRepository.getById(axesModel.getVildep()));
        axes.setVilles(villeRepository.getById(axesModel.getVildes()));
        axes.setCompagnie(compagnieRepository.getById(axesModel.getIdcomp()));
        axes.setHoraire(horaireRepository.getById(axesModel.getIdh()));
        axes.setPrixAxe(axesModel.getPrixaxe());
        axes.setDteCreate(new Date());
        axes.setDteEdit(new Date());
        return axesRespository.save(axes);
    }

    @Override
    public List<Axes> listAxes() {
        return axesRespository.findAll();
    }

    @Override
    public Axes updateAxes(Long id, AxesModel axesModel) {
        Axes axes = new Axes();
        axes.setVille(villeRepository.getById(axesModel.getVildep()));
        axes.setVilles(villeRepository.getById(axesModel.getVildes()));
        axes.setCompagnie(compagnieRepository.getById(axesModel.getIdcomp()));
        axes.setHoraire(horaireRepository.getById(axesModel.getIdh()));
        axes.setPrixAxe(axesModel.getPrixaxe());
        axes.setDteCreate(new Date());
        axes.setDteEdit(new Date());
        axes.setIdAxe(id);
        return axesRespository.save(axes);
    }

    @Override
    public void deleteAxes(Long id) {
        axesRespository.deleteById(id);
    }

    @Override
    public Axes getAxes(Long id) {
        return axesRespository.findById(id).get();
    }

    @Override
    public List<Axes> listAxes(Long id) {
        return axesRespository.chercherAxe(id);
    }

}
