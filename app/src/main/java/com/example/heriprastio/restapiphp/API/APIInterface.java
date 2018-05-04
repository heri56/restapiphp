package com.example.heriprastio.restapiphp.API;

import com.example.heriprastio.restapiphp.model.DataKategori;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface APIInterface {
    @POST("getdataall.php")
    Call<List<DataKategori>> getKategori();
}
