/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.controlador;

import java.util.ArrayList;
import org.control_estacionamiento.bean.Ticket;

/**
 *
 * @author dafuentes
 */
public class ControladorTicket {
    private static ControladorTicket instance = null;
    ArrayList<Ticket> listadoTicket = new ArrayList<>();
    
    public static ControladorTicket getInstance() {
        if(instance == null) {
            instance = new ControladorTicket();
        }
        return instance;
    }

    public ArrayList<Ticket> getListadoTicket() {
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        for (Ticket t : listadoTicket) {
          if (t.isPagado()) {
              result.add(t);
          }
        }
        return result;
    }
    
    public ArrayList<Ticket> getListadoPorSotano(int id) {
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        for (Ticket t : listadoTicket) {
          if (t.getParqueo().getUbicacion().getId() == id && !t.getParqueo().isDisponible()) {
              result.add(t);
          }
        }
        return result;
    }
    
    public boolean verificarPlaca(String placa) {
        for (Ticket ticket : listadoTicket) {
            if (ticket.getPlaca().equals(placa)) {
                return true;
            }
        }    
        return false;
    }
    

    public void setListadoTicket(ArrayList<Ticket> listadoTicket) {
        this.listadoTicket = listadoTicket;
    }
    
    public void agregarTicket(Ticket ticket) {
        listadoTicket.add(ticket);
    }
    
    public Ticket getTicket(String ticket) {
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        for (Ticket t : listadoTicket) {
          if (t.getPlaca().equals(ticket) && !t.isPagado()) {
            return t;
          }
        }
        return null;
    }
    
}
