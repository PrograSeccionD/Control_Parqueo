/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control_estacionamiento.bean;

import java.util.Date;

/**
 *
 * @author dafuentes
 */
public class Ticket {
    
    private int id;
    private String placa;
    private Date horaEntrada;
    private Date horaSalida;
    private double tarifa;
    private Parqueo parqueo;
    private double total;
    private boolean pagado;
    
    
    public Ticket () {
    
    }
    public Ticket(int id, String placa, Date horaEntrada, Date horaSalida, double tarifa, Parqueo parqueo, double total) {
        this.id = id;
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tarifa = tarifa;
        this.parqueo = parqueo;
        this.total = total;
        this.pagado = false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    
    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Parqueo getParqueo() {
        return parqueo;
    }

    public void setParqueo(Parqueo parqueo) {
        this.parqueo = parqueo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
}
