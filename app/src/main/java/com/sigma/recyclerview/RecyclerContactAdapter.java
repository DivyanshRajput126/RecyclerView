package com.sigma.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<contact_model> arrayContact;
    RecyclerContactAdapter(Context context, ArrayList<contact_model> arrayContact){
        this.context = context;
        this.arrayContact = arrayContact;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arrayContact.get(position).img);
        holder.textName.setText(arrayContact.get(position).name);
        holder.textNumber.setText(arrayContact.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrayContact.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        TextView textName, textNumber;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textName);
            textNumber = itemView.findViewById(R.id.textNumber);
            img = itemView.findViewById(R.id.contactImage);
        }
    }
}
