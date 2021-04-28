package com.example.ptsgenap10rpl117;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import javax.security.auth.callback.Callback;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context context;
    private Callback callback;
    public UserAdapter(MainUser mainUser, ArrayList<User> userlist, Callback callback) {
        this.userlist = userlist;
        this.callback = callback;
    }

    private ArrayList<User> userlist;
    interface Callback {
        void onClick(int position);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View view = layoutInflater.inflate(R.layout.activity_main_user, parent,n);
        View view = layoutInflater.inflate(R.layout.list, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.namaLengkap.setText(userlist.get(position).getNamaLengkap());
        holder.noTelp.setText(userlist.get(position).getNotelp());
        holder.status.setText(userlist.get(position).getPelajar());
        Picasso.get()
                .load(userlist.get(position).getImage())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {

        return userlist.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView namaLengkap, noTelp, status;
        CardView name;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            this.image = itemView.findViewById(R.id.image);
            this.namaLengkap = itemView.findViewById(R.id.namaLengkap);
            this.noTelp = itemView.findViewById(R.id.notelp);
            this.status = itemView.findViewById(R.id.status);
            this.name = itemView.findViewById(R.id.name);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onClick(getAdapterPosition());
                }
            });
        }
    }
}
