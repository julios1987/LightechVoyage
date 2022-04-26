/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lightech.voyage.services;

import com.lightech.voyage.entities.Horaire;
import com.lightech.voyage.implement.HoraireMetierImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/lightech")
public class HoraireRestService {

    @Autowired
    private HoraireMetierImpl horaireMetierImpl;

    @RequestMapping(value = "/horaires", method = RequestMethod.POST)
    public Horaire saveHoraire(@RequestBody Horaire h) {
        return horaireMetierImpl.saveHoraire(h);
    }

    //UPDATE
    @RequestMapping(value = "/horaires/{idH}", method = RequestMethod.PUT)
    public Horaire updateHoraire(@PathVariable(name = "idH") Long idH, @RequestBody Horaire horaire) {
        return horaireMetierImpl.updateHoraire(idH, horaire);
    }

    //DELETE
    @RequestMapping(value = "/horaires/{idH}", method = RequestMethod.DELETE)
    public void deleteHoraire(@PathVariable(name = "idH") Long idH) {
        horaireMetierImpl.deleteHoraire(idH);
    }

    @RequestMapping(value = "/horaires", method = RequestMethod.GET)
    public List<Horaire> listHoraire() {
        return horaireMetierImpl.listHoraire();
    }
}
