package com.example.heriprastio.restapiphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.heriprastio.restapiphp.API.APIClient;
import com.example.heriprastio.restapiphp.API.APIInterface;
import com.example.heriprastio.restapiphp.adapter.RecycleAdapter;
import com.example.heriprastio.restapiphp.model.DataKategori;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecycleAdapter adapter;
    private List<DataKategori> dataKategoris;
    private APIInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.Reycyclerviewq);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = APIClient.getApiClient().create(APIInterface.class);
        retrofit2.Call<List<DataKategori>> call = apiInterface.getKategori();

        call.enqueue(new Callback<List<DataKategori>>() {
            @Override
            public void onResponse(retrofit2.Call<List<DataKategori>> call, Response<List<DataKategori>> response) {
                dataKategoris = response.body();
                adapter = new RecycleAdapter(dataKategoris);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(retrofit2.Call<List<DataKategori>> call, Throwable t) {

            }
        });
    }
}
