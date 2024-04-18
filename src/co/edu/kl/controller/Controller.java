package co.edu.kl.controller;
import co.edu.kl.controller.*;
import co.edu.kl.model.Persona;
import co.edu.kl.model.SalsaCantante;
import co.edu.kl.view.Ventana;

public class Controller {

    Persona p1 = new Persona();
    SalsaCantante sC1 = new SalsaCantante();
    Ventana v1 = new Ventana();
    
    public void arrancar() {
    	v1.letraPersona(p1.cantar());
        v1.letraPersona(sC1.cantar());
    }

       
    



}
