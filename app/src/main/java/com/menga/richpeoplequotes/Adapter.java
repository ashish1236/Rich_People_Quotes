package com.menga.richpeoplequotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.menga.richpeoplequotes.databinding.RvdisignBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    List<model> list;
    Context context;

    public Adapter(List<model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.rvdisign,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    model models=list.get(position);
    holder.binding.textView2.setText(models.getTxt());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        RvdisignBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding=RvdisignBinding.bind(itemView);

        }
    }
}
