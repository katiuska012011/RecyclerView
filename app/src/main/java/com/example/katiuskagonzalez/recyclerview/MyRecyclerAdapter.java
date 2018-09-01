package com.example.katiuskagonzalez.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyRecycleItemViewHolder> {

    private final List<Vehiculos> items;
    private final Context context;

    public MyRecyclerAdapter(List<Vehiculos> items, Context context) {
        this.items = items;
        this.context = context;
    }


    @Override
    public int getItemViewType(int position) {
//        if( position == 0){
//            return R.layout.activity_normal_card;
//        }
//        else {
//            return R.layout.activity_big_card;
//        }
        return  0;
    }

    @Override
    public MyRecycleItemViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_big_card, parent, false);
        MyRecycleItemViewHolder holder = new MyRecycleItemViewHolder(view);
        return  holder;

    }

    @Override
    public void onBindViewHolder( MyRecycleItemViewHolder holder, int position) {
        holder.Nombre.setText(items.get(position).getNombre());
        holder.Marca.setText(items.get(position).getMarca());

    }

    @Override
    public int getItemCount() { return items.size(); }

    public static class MyRecycleItemViewHolder extends RecyclerView.ViewHolder {
        TextView Nombre;
        TextView Marca;
        public  MyRecycleItemViewHolder(View itemView){
            super (itemView);
            Nombre = itemView.findViewById(R.id.Nombre);
             Marca = itemView.findViewById(R.id.Marca);


        }
    }
}
