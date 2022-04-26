package com.lightech.voyage.metier;

import com.lightech.voyage.entities.Ville;
import java.util.List;

public interface VilleMetier {

    public Ville saveVille(Ville v);

    public List<Ville> listVille();

    public Ville updateVille(Long id, Ville v);

    public void deleteVille(Long id);

    public Ville listVilles(Long id);

    public Ville getVilleDesignation(String nomVil);
}
