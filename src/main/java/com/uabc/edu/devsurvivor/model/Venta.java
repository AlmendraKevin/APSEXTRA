package com.uabc.edu.devsurvivor.model;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "VENTAS")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @Column(name = "factura_venta")
    private Integer facturaVenta;

    @Column(name = "realizo_venta")
    private String realizoVenta;

    @Column(name = "concepto_venta")
    private String conceptoVenta;

    @Column(name = "total_venta")
    private String totalVents;

    @Column(name = "fecha_venta")
    private Date fechaVenta;

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getFacturaVenta() {
        return facturaVenta;
    }

    public void setFacturaVenta(Integer facturaVenta) {
        this.facturaVenta = facturaVenta;
    }

    public String getRealizoVenta() {
        return realizoVenta;
    }

    public void setRealizoVenta(String realizoVenta) {
        this.realizoVenta = realizoVenta;
    }

    public String getConceptoVenta() {
        return conceptoVenta;
    }

    public void setConceptoVenta(String conceptoVenta) {
        this.conceptoVenta = conceptoVenta;
    }

    public String getTotalVents() {
        return totalVents;
    }

    public void setTotalVents(String totalVents) {
        this.totalVents = totalVents;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", facturaVenta=" + facturaVenta +
                ", realizoVenta='" + realizoVenta + '\'' +
                ", conceptoVenta='" + conceptoVenta + '\'' +
                ", totalVents='" + totalVents + '\'' +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}
