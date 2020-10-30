package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    int mResource;

    public MovieAdapter(@NonNull Context context, int resource, ArrayList<Movie> movie){
        super(context, resource, movie);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View converView, @NonNull ViewGroup parent){

        String movieTitle = getItem(position).getTitle();
        String movieYear = getItem(position).getYear();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        converView = inflater.inflate(mResource,parent,false);

        TextView txtTitle = converView.findViewById(R.id.txtTitle);
        TextView txtYear = converView.findViewById(R.id.txtYear);

        txtTitle.setText(movieTitle);
        txtYear.setText(movieYear);

        return converView;
    }
}
