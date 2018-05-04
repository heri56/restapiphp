package com.example.heriprastio.restapiphp.model;

import com.google.gson.annotations.SerializedName;

public class DataKategori {

    @SerializedName("ID NO")
    private Integer ID_NO;
    @SerializedName("Nama Mata Kuliah")
    private String Mata_Kuliah;
    @SerializedName("Nama Kategori")
    private String Kategori;

    public Integer getID_NO() {
        return ID_NO;
    }

    public String getMata_Kuliah() {
        return Mata_Kuliah;
    }

    public String getKategori() {
        return Kategori;
    }
}
