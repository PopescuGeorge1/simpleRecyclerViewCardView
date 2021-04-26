package com.example.recyclercardviewapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {

    public ArrayList<Game>myGames;
    ItemClicked activity;



    public interface ItemClicked{
        void onItemClicked(int index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView tvView;
        TextView gameName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvView = itemView.findViewById(R.id.tvView);
            gameName = itemView.findViewById(R.id.gameName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(myGames.indexOf((Game)v.getTag()));
                }
            });

        }
    }

    public GameAdapter(Context context, ArrayList<Game> games) {
        this.myGames=games;
        this.activity=(ItemClicked) context;
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(myGames.get(position));

        holder.gameName.setText(myGames.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return myGames.size();
    }
}
