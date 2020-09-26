package com.example.drawme.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.drawme.R;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Item> items =new ArrayList<>();
    private Context context;
    public ItemAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ItemViewHolder holder = new ItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.txtName.setText(items.get(position).getName());
        Glide.with(context)
                .asBitmap()
                .load(items.get(position).getImgUrl())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;

        notifyDataSetChanged();
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName;
        private CardView parent;
        private ImageView image;
        private Button like_button;
        private Button comment_button;
        private Button share_button;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            parent = itemView.findViewById(R.id.parent);
            image = itemView.findViewById(R.id.image);
            like_button = itemView.findViewById(R.id.likeBtn);
            comment_button = itemView.findViewById(R.id.commentBtn);
            share_button = itemView.findViewById(R.id.shareBtn);
        }
    }
}
