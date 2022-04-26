/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Axes;
import com.lightech.voyage.implement.AxesMetierImpl;
import com.lightech.voyage.model.AxesModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/lightech")
public class AxesRestService {

    @Autowired
    private AxesMetierImpl axesMetierImpl;

    @RequestMapping(value = "/axes", method = RequestMethod.POST)
    public Axes saveAxes(@RequestBody AxesModel axesModel) {
        return axesMetierImpl.saveAxes(axesModel);
    }

    @RequestMapping(value = "/axes", method = RequestMethod.GET)
    public List<Axes> listAxes() {
        return axesMetierImpl.listAxes();
    }

    //LISTE AXES PAR ID
    @RequestMapping(value = "/axes/{idAxe}", method = RequestMethod.GET)
    public Axes getAxes(@PathVariable(name = "idAxe") Long idAxe) {
        return axesMetierImpl.getAxes(idAxe);
    }

    //UPDATE
    @RequestMapping(value = "/axes/{idAxe}", method = RequestMethod.PUT)
    public Axes updateAxes(@PathVariable(name = "idAxe") Long idAxe, @RequestBody AxesModel axesModel) {
        return axesMetierImpl.updateAxes(idAxe, axesModel);
    }

    //DELETE
    @RequestMapping(value = "/axes/{idAxe}", method = RequestMethod.DELETE)
    public void deleteAxe(@PathVariable(name = "idAxe") Long idAxe) {
        axesMetierImpl.deleteAxes(idAxe);
    }

    @RequestMapping(value = "/axe", method = RequestMethod.GET)
    public List<Axes> getAxe(
            @RequestParam Long idaxe) {
        return axesMetierImpl.listAxes(idaxe);
    }
}
