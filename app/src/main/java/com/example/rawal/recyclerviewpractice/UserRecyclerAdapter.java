package com.example.rawal.recyclerviewpractice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.ViewHolder>{

    Context context;           //Ref of the activity
    int resource;              //list_item
    ArrayList<User> objects;   //ArrayList of Users

    public UserRecyclerAdapter(Context context, int resource, ArrayList<User> objects) {

        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from( context ).inflate( resource,viewGroup,false );
        ViewHolder viewHolder = new ViewHolder( view );

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        User user = objects.get( i );
        viewHolder.imageView.setBackgroundResource( user.image );
        viewHolder.name.setText( user.name );
        viewHolder.TV.setText( user.TVSeries );

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView ;
        TextView name ;
        TextView TV ;

        public ViewHolder(View itemView) {
            super( itemView );
            imageView = itemView.findViewById( R.id.imageView );
            name = itemView.findViewById( R.id.nameView );
            TV = itemView.findViewById( R.id.TVView );
        }
    }
}
