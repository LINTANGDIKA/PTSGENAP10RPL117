package com.example.ptsgenap10rpl117;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {


    public UserAdapter(MainUser mainUser, ArrayList<User> userlist) {
        this.userlist = userlist;
    }

    private ArrayList<User> userlist;


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_main_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.namaLengkap.setText(userlist.get(position).getNamaLengkap());
        holder.noTelp.setText(userlist.get(position).getNotelp());
        holder.status.setText(userlist.get(position).getPelajar());
        holder.yourImage.setImageResource(userlist.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        int size = userlist.size();
        return size;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView yourImage;
        TextView namaLengkap, noTelp, status;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            this.yourImage = itemView.findViewById(R.id.image);
            this.namaLengkap = itemView.findViewById(R.id.namaLengkap);
            this.noTelp = itemView.findViewById(R.id.notelp);
            this.status = itemView.findViewById(R.id.status);
        }
    }
}
