package com.example.android.a1217recycle.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.a1217recycle.Listener.OnProfileClickListener;
import com.example.android.a1217recycle.Model.ProfileModel;
import com.example.android.a1217recycle.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;



/**
 * Created by pc on 12/17/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    Context context;
    ArrayList<ProfileModel> profileModelArrayList = new ArrayList<>();
    private OnProfileClickListener listener;

    public void setListener (OnProfileClickListener listener){
        this.listener = listener;
    }
    public void setItems (ArrayList<ProfileModel> model){
        this.profileModelArrayList = model;

    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.recyclerview_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        final ProfileModel model = profileModelArrayList.get(position);
        holder.textView.setText(model.getUser());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
listener.onClick(model);
            }
        });
        if (!model.getUserImageURL().isEmpty()){
            Picasso.with(context).load(model.getUserImageURL()).centerCrop().fit().into(holder.img);
        }else holder.img.setImageResource(R.drawable.empty_profile);


    }

    @Override
    public int getItemCount() {
        return profileModelArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.imageProfile)
        ImageView img;
        @BindView(R.id.textProfile)
        TextView textView;





        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
