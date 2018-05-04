package com.example.heriprastio.restapiphp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.heriprastio.restapiphp.R;
import com.example.heriprastio.restapiphp.model.DataKategori;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    private List<DataKategori> dataKategoris;
    public RecycleAdapter(List<DataKategori> dataKategoris){
        this.dataKategoris = dataKategoris;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_item, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.No.setText(dataKategoris.get(position).getID_NO());
        holder.Namamk.setText(dataKategoris.get(position).getMata_Kuliah());
        holder.Namakategori.setText(dataKategoris.get(position).getKategori());
    }

    @Override
    public int getItemCount() {
        return dataKategoris.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView No, Namamk, Namakategori;
        public MyViewHolder(View itemView) {
            super(itemView);
            No = (TextView)itemView.findViewById(R.id.NameSatu);
            Namamk = (TextView) itemView.findViewById(R.id.NamaMataKuliah);
            Namakategori = (TextView) itemView.findViewById(R.id.NamaKategori);
        }
    }
}
