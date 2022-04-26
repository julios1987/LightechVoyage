package com.lightech.voyage.services;

import com.lightech.voyage.entities.Ville;
import com.lightech.voyage.implement.VilleMetierImpl;
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
public class VilleRestService {

    @Autowired
    private VilleMetierImpl villeMetierImpl;

    //SAVE
    @RequestMapping(value = "/villes", method = RequestMethod.POST)
    public Ville saveVille(@RequestBody Ville v) {
        return villeMetierImpl.saveVille(v);
    }

    //LISTE VILLE
    @RequestMapping(value = "/villes", method = RequestMethod.GET)
    public List<Ville> listVille() {
        return villeMetierImpl.listVille();
    }

    //LISTE VILLE PAR ID
    @RequestMapping(value = "/villes/{idVil}", method = RequestMethod.GET)
    public Ville listVilles(@PathVariable(name = "idVil") Long idVil) {
        return villeMetierImpl.listVilles(idVil);
    }

    //LISTE VILLE PAR NomVil
    @RequestMapping(value = "/villes/{nomvil}", method = RequestMethod.GET)
    public Ville getVilleDesignation(@PathVariable(name = "nomvil") String nomvil) {
        return villeMetierImpl.getVilleDesignation(nomvil);
    }

    //UPDATE
    @RequestMapping(value = "/villes/{idVil}", method = RequestMethod.PUT)
    public Ville updateVille(@PathVariable(name = "idVil") Long idVil, @RequestBody Ville v) {
        return villeMetierImpl.updateVille(idVil, v);
    }

    //DELETE
    @RequestMapping(value = "/villes/{idVil}", method = RequestMethod.DELETE)
    public void deleteVille(@PathVariable(name = "idVil") Long idVil) {
        villeMetierImpl.deleteVille(idVil);
    }
}
