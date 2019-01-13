package com.nexdev.enyason.nestedrv.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nexdev.enyason.nestedrv.Model.Movie;
import com.nexdev.enyason.nestedrv.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by enyason on 10/4/18.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {


    private List<Movie> movieList;
    private Context context;

    public MovieAdapter(List<Movie> list, Context context) {
        this.movieList = list;
        this.context = context;


    }


    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MovieViewHolder(LayoutInflater.from(context).inflate(R.layout.row_layout_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieViewHolder holder, final int position) {

        Movie movie = movieList.get(position);


        holder.textViewTitle.setText(movie.getName());
        holder.textViewGenre.setText(movie.getGenre());

        Picasso.with(context).
                load(context.getResources().getString(R.string.image_url) + movie.getPoster())
                .into(holder.imageViewMovie);


    }

    @Override
    public int getItemCount() {

        return movieList.size();

    }


    public class MovieViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewTitle;
        private TextView textViewGenre;
        private ImageView imageViewMovie;


        public MovieViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.tv_title);
            textViewGenre = itemView.findViewById(R.id.tv_genre);
            imageViewMovie = itemView.findViewById(R.id.image_view_movie);

        }


    }
}