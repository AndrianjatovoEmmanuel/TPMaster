/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tp.managebeans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Emmanuel VATANINTSOA
 */
@Named(value = "bean")
@RequestScoped
public class Bean {

    /**
     * Creates a new instance of Bean
     */
    public Bean() {
    }
    
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
    
    public String afficher() {
        return "affichage_4?nb="+ nombre + "&amp;faces-redirect=true";
    }
    
    public String retour_formulaire() {
        return "formulaire_4?nb_precedent="+ nombre + "&amp;faces-redirect=true";
    }
    
}
