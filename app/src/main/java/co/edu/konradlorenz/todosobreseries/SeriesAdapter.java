package co.edu.konradlorenz.todosobreseries;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.MyViewHolder>  {

    private Context mContext;
    private List<Serie> serieList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, gender;
        public ImageView thumbnail, overflow;
        private View elementView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            gender = (TextView) view.findViewById(R.id.gender);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            elementView = view;
        }
    }

    public SeriesAdapter(Context mContext, List<Serie> serieList) {
        this.mContext = mContext;
        this.serieList = serieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.serie_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Serie serie = serieList.get(position);

        holder.elementView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SerieDetailActivity.class);
                intent.putExtra("serieItem", serie);
                mContext.startActivity(intent);
            }
        });
        holder.title.setText(serie.getNombre());
        String generos = "";
        ArrayList<String> generosSerie = serie.getGenero();
        for (int i=0; i< generosSerie.size();i++){
            if(i < generosSerie.size()-1){
                generos = generos + generosSerie.get(i)+", ";
            }else{
                generos = generos + generosSerie.get(i);

            }
        }
        holder.gender.setText("Genero: "+generos );

        Glide.with(mContext).load(serie.getThumbnail()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return serieList.size();
    }

}
