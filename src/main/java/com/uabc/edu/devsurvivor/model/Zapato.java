package com.uabc.edu.devsurvivor.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "ZAPATOS")
public class Zapato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idZapato;

    @Column(name = "modelo_zapato")
    private String modeloZapato;

    @Column(name = "color_zapato")
    private String colorZapato;

    @Column(name = "talla_zapato")
    private String tallaZapato;

    @Column(name = "existencia_zapato")
    private String existenciaZapato;

    @Column(name = "costo_zapato")
    private String costoZapato;

    @Column(name = "ubicacion_zapato")
    private String ubicacionZapato;

    @Column(name = "img")
    private byte[] img;

    @Column(name = "str")
    private String str;

    public Long getIdZapato() {
        return idZapato;
    }

    public void setIdZapato(Long idZapato) {
        this.idZapato = idZapato;
    }

    public String getModeloZapato() {
        return modeloZapato;
    }

    public void setModeloZapato(String modeloZapato) {
        this.modeloZapato = modeloZapato;
    }

    public String getColorZapato() {
        return colorZapato;
    }

    public void setColorZapato(String colorZapato) {
        this.colorZapato = colorZapato;
    }

    public String getTallaZapato() {
        return tallaZapato;
    }

    public void setTallaZapato(String tallaZapato) {
        this.tallaZapato = tallaZapato;
    }

    public String getExistenciaZapato() {
        return existenciaZapato;
    }

    public void setExistenciaZapato(String existenciaZapato) {
        this.existenciaZapato = existenciaZapato;
    }

    public String getCostoZapato() {
        return costoZapato;
    }

    public void setCostoZapato(String costoZapato) {
        this.costoZapato = costoZapato;
    }

    public String getUbicacionZapato() {
        return ubicacionZapato;
    }

    public void setUbicacionZapato(String ubicacionZapato) {
        this.ubicacionZapato = ubicacionZapato;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "idZapato=" + idZapato +
                ", modeloZapato='" + modeloZapato + '\'' +
                ", colorZapato='" + colorZapato + '\'' +
                ", tallaZapato='" + tallaZapato + '\'' +
                ", existenciaZapato='" + existenciaZapato + '\'' +
                ", costoZapato='" + costoZapato + '\'' +
                ", ubicacionZapato='" + ubicacionZapato + '\'' +
                ", img=" + Arrays.toString(img) +
                ", str='" + str + '\'' +
                '}';
    }
}
