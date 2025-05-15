package com.example.movieapp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapp.R;
import com.example.movieapp.databinding.MovieListItemBinding;
import com.example.movieapp.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder > {

    private Context context;
    private ArrayList<Movie> moviearrayList;

    public MovieAdapter(Context context, ArrayList<Movie> moviearrayList) {
        this.context = context;
        this.moviearrayList = moviearrayList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MovieListItemBinding binding = DataBindingUtil
                .inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.movie_list_item,
                        parent,
                        false

                );
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = moviearrayList.get(position);
        holder.movieListItemBinding.setMovie(movie);
    }

    @Override
    public int getItemCount() {
        return moviearrayList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
       private MovieListItemBinding movieListItemBinding;

       public MovieViewHolder(MovieListItemBinding movieListItemBinding) {
           super(movieListItemBinding.getRoot());
           this.movieListItemBinding = movieListItemBinding;

           movieListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

               }
           });
       }
   }
}
