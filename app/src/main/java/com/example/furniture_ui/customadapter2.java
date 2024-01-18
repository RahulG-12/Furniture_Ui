package com.example.furniture_ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class customadapter2 extends RecyclerView.Adapter<customadapter2.Myviewholder> {
    private ArrayList<Datamodel> mydata;
    private Context context;

    public customadapter2(ArrayList<Datamodel> mydata, Context context) {
        this.mydata = mydata;
        this.context = context;
    }

    @NonNull
    @Override
    public customadapter2.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_layout_secon,parent,false);

        Myviewholder myviewholder=new Myviewholder(view);
        return  myviewholder;


    }

    @Override
    public void onBindViewHolder(@NonNull customadapter2.Myviewholder holder, int position) {
        TextView textviewname=holder.textviewname;
        TextView textviewversion=holder.textviewversion;
        ImageView imageviewicon=holder.imageviewicon;

        textviewname.setText(mydata.get(position).getName());
        textviewversion.setText(mydata.get(position).getVersion());
        Glide.with(context)
                .load(mydata.get(position).getImage())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(20)))
                .into(imageviewicon);

    }

    @Override
    public int getItemCount() {
         return  mydata.size();
    }
    public static class Myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textviewname;
        TextView textviewversion;
        ImageView imageviewicon;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            this.textviewname=itemView.findViewById(R.id.textviewname);
            this.textviewversion=itemView.findViewById(R.id.newversion);
            this.imageviewicon=itemView.findViewById(R.id.imageviewicon);
            itemView.setOnClickListener((View.OnClickListener)this);
        }

        @Override
        public void onClick(View view) {

        }
    }


}
