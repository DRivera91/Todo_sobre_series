package co.edu.konradlorenz.todosobreseries;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SeriesAdapter adapter;
    private List<Serie> serieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.serie_recycler_view);
        serieList = new ArrayList<>();
        adapter = new SeriesAdapter(this, serieList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareSeries();

    }

    private void prepareSeries() {
        int[] imagenes = new int[]{
                R.drawable.boku1,
                R.drawable.codegeass,
                R.drawable.darling,
                R.drawable.erased,
                R.drawable.full_metalpanic1,
                R.drawable.konosuba,
                R.drawable.saint1,
                R.drawable.shoku1
        };

        List<Capitulo> capituloList;
        capituloList = new ArrayList<>();

        List<Temporada> temporadaList;
        temporadaList = new ArrayList<>();

     /////// SERIE 1 temporada 1
        Capitulo cap = new Capitulo(getString(R.string.cboku1), 1,getString(R.string.descboku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku2), 2,getString(R.string.descboku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku3), 3,getString(R.string.descboku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku4), 4,getString(R.string.descboku4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku5), 5,getString(R.string.descboku5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku6), 6,getString(R.string.descboku6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku7), 7,getString(R.string.descboku7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku8), 8,getString(R.string.descboku8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku9), 9,getString(R.string.descboku9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku10), 10,getString(R.string.descboku10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku11), 11,getString(R.string.descboku11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku12), 12,getString(R.string.descboku12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cboku13), 13,getString(R.string.descboku13));
        capituloList.add(cap);

        Temporada temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);
        /////// SERIE 1 temporada 2

        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c2boku1), 1,getString(R.string.desc2boku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku2), 2,getString(R.string.desc2boku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku3), 3,getString(R.string.desc2boku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku4), 4,getString(R.string.desc2boku4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku5), 5,getString(R.string.desc2boku5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku6), 6,getString(R.string.desc2boku6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku7), 7,getString(R.string.desc2boku7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku8), 8,getString(R.string.desc2boku8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku9), 9,getString(R.string.desc2boku9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku10), 10,getString(R.string.desc2boku10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku11), 11,getString(R.string.desc2boku11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku12), 12,getString(R.string.desc2boku12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku13), 13,getString(R.string.desc2boku13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku14), 14,getString(R.string.desc2boku14));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku15), 15,getString(R.string.desc2boku15));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku16), 16,getString(R.string.desc2boku16));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku17), 17,getString(R.string.desc2boku17));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku18), 18,getString(R.string.desc2boku18));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku19), 19,getString(R.string.desc2boku19));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku20), 20,getString(R.string.desc2boku20));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku21), 21,getString(R.string.desc2boku21));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku22), 22,getString(R.string.desc2boku22));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku23), 23,getString(R.string.desc2boku23));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku24), 24,getString(R.string.desc2boku24));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku25), 25,getString(R.string.desc2boku25));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2boku26), 26,getString(R.string.desc2boku26));
        capituloList.add(cap);
        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_two));
        temporadaList.add(temp);
        /////// SERIE 1 temporada 3
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c3boku1), 1,getString(R.string.desc3boku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3boku2), 2,getString(R.string.desc3boku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3boku3), 3,getString(R.string.desc3boku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3boku4), 4,getString(R.string.desc3boku4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3boku5), 5,getString(R.string.desc3boku5));
        capituloList.add(cap);
        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_three));
        temporadaList.add(temp);

        List<String> generos;
        generos = new ArrayList<>();
        generos.add(getString(R.string.gender1));
        generos.add(getString(R.string.gender2));
        generos.add(getString(R.string.gender5));
        generos.add(getString(R.string.gender6));
        generos.add(getString(R.string.gender16));


        Serie a = new Serie(getString(R.string.Academia), getString(R.string.Academia),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[0]);
        serieList.add(a);


     //////SERIE 2 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cct1), 1,getString(R.string.descct1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct2), 2,getString(R.string.descct2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct3), 3,getString(R.string.descct3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct4), 4,getString(R.string.descct4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct5), 5,getString(R.string.descct5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct6), 6,getString(R.string.descct6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct7), 7,getString(R.string.descct7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct8), 8,getString(R.string.descct8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct9), 9,getString(R.string.descct9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct10), 10,getString(R.string.descct10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct11), 11,getString(R.string.descct11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct12), 12,getString(R.string.descct12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct13), 13,getString(R.string.descct13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct14), 14,getString(R.string.descct14));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct15), 15,getString(R.string.descct15));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct16), 16,getString(R.string.descct16));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct17), 17,getString(R.string.descct17));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct18), 18,getString(R.string.descct18));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct19), 19,getString(R.string.descct19));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct20), 20,getString(R.string.descct20));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct21), 21,getString(R.string.descct21));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct22), 22,getString(R.string.descct22));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct23), 23,getString(R.string.descct23));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct24), 24,getString(R.string.descct24));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct25), 25,getString(R.string.descct25));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cct26), 26,getString(R.string.descct26));
        capituloList.add(cap);

        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);
////////////temporada 2
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.crct1), 1,getString(R.string.desccrct1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct2), 2,getString(R.string.desccrct2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct3), 3,getString(R.string.desccrct3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct4), 4,getString(R.string.desccrct4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct5), 5,getString(R.string.desccrct5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct6), 6,getString(R.string.desccrct6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct7), 7,getString(R.string.desccrct7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct8), 8,getString(R.string.desccrct8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct9), 9,getString(R.string.desccrct9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct10), 10,getString(R.string.desccrct10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct11), 11,getString(R.string.desccrct11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct12), 12,getString(R.string.desccrct12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct13), 13,getString(R.string.desccrct13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct14), 14,getString(R.string.desccrct14));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct15), 15,getString(R.string.desccrct15));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct16), 16,getString(R.string.desccrct16));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct17), 17,getString(R.string.desccrct17));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct18), 18,getString(R.string.desccrct18));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct19), 19,getString(R.string.desccrct19));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct20), 20,getString(R.string.desccrct20));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct21), 21,getString(R.string.desccrct21));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct22), 22,getString(R.string.desccrct22));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct23), 23,getString(R.string.desccrct23));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct24), 24,getString(R.string.desccrct24));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.crct25), 25,getString(R.string.desccrct25));
        capituloList.add(cap);

        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_two));
        temporadaList.add(temp);

        generos = new ArrayList<>();
        generos.add(getString(R.string.gender1));
        generos.add(getString(R.string.gender6));
        generos.add(getString(R.string.gender7));
        generos.add(getString(R.string.gender8));
        generos.add(getString(R.string.gender9));
        generos.add(getString(R.string.gender16));

        a = new Serie(getString(R.string.codeg), getString(R.string.codeg),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[1]);
        serieList.add(a);

        //////SERIE 3 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cdarling1), 1,getString(R.string.descdarling1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling2), 2,getString(R.string.descdarling2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling3), 3,getString(R.string.descdarling3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling4), 4,getString(R.string.descdarling4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling5), 5,getString(R.string.descdarling5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling6), 6,getString(R.string.descdarling6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling7), 7,getString(R.string.descdarling7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling8), 8,getString(R.string.descdarling8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling9), 9,getString(R.string.descdarling9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling10), 10,getString(R.string.descdarling10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling11), 11,getString(R.string.descdarling11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling12), 12,getString(R.string.descdarling12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling13), 13,getString(R.string.descdarling13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling14), 14,getString(R.string.descdarling14));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cdarling15), 15,getString(R.string.descdarling15));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);

        generos = new ArrayList<>();
        generos.add(getString(R.string.gender7));
        generos.add(getString(R.string.gender14));

        a = new Serie(getString(R.string.darling), getString(R.string.darling),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[2]);
        serieList.add(a);



        //////SERIE 4 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cerased1), 1,getString(R.string.descerased1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased2), 2,getString(R.string.descerased2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased3), 3,getString(R.string.descerased3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased4), 4,getString(R.string.descerased4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased5), 5,getString(R.string.descerased5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased6), 6,getString(R.string.descerased6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased7), 7,getString(R.string.descerased7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased8), 8,getString(R.string.descerased8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased9), 9,getString(R.string.descerased9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased10), 10,getString(R.string.descerased10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased11), 11,getString(R.string.descerased11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cerased12), 12,getString(R.string.descerased12));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);

        generos = new ArrayList<>();
        generos.add(getString(R.string.gender4));
        generos.add(getString(R.string.gender10));
        generos.add(getString(R.string.gender12));

        a = new Serie(getString(R.string.erased), getString(R.string.erased),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[3]);
        serieList.add(a);

        //////SERIE 5 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cfmp1), 1,getString(R.string.descfmp1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp2), 2,getString(R.string.descfmp2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp3), 3,getString(R.string.descfmp3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp4), 4,getString(R.string.descfmp4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp5), 5,getString(R.string.descfmp5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp6), 6,getString(R.string.descfmp6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp7), 7,getString(R.string.descfmp7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp8), 8,getString(R.string.descfmp8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp9), 9,getString(R.string.descfmp9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp10), 10,getString(R.string.descfmp10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp11), 11,getString(R.string.descfmp11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp12), 12,getString(R.string.descfmp12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp13), 13,getString(R.string.descfmp13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp14), 14,getString(R.string.descfmp14));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp15), 15,getString(R.string.descfmp15));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp16), 16,getString(R.string.descfmp16));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp17), 17,getString(R.string.descfmp17));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp18), 18,getString(R.string.descfmp18));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp19), 19,getString(R.string.descfmp19));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp20), 20,getString(R.string.descfmp20));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp21), 21,getString(R.string.descfmp21));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp22), 22,getString(R.string.descfmp22));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp23), 23,getString(R.string.descfmp23));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmp24), 24,getString(R.string.descfmp24));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);
        /////// SERIE 5 temporada 2

        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cfmpf1), 1,getString(R.string.descfmpf1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf2), 2,getString(R.string.descfmpf2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf3), 3,getString(R.string.descfmpf3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf4), 4,getString(R.string.descfmpf4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf5), 5,getString(R.string.descfmpf5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf6), 6,getString(R.string.descfmpf6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf7), 7,getString(R.string.descfmpf7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf8), 8,getString(R.string.descfmpf8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf9), 9,getString(R.string.descfmpf9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf10), 10,getString(R.string.descfmpf10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf11), 11,getString(R.string.descfmpf11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmpf12), 12,getString(R.string.descfmpf12));
        capituloList.add(cap);

        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_two));
        temporadaList.add(temp);
        /////// SERIE 5 temporada 3
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cfmps1), 1,getString(R.string.descfmps1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps2), 2,getString(R.string.descfmps2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps3), 3,getString(R.string.descfmps3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps4), 4,getString(R.string.descfmps4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps5), 5,getString(R.string.descfmps5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps6), 6,getString(R.string.descfmps6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps7), 7,getString(R.string.descfmps7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps8), 8,getString(R.string.descfmps8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps9), 9,getString(R.string.descfmps9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps10), 10,getString(R.string.descfmps10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps11), 11,getString(R.string.descfmps11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps12), 12,getString(R.string.descfmps12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps13), 13,getString(R.string.descfmps13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cfmps14), 14,getString(R.string.descfmps14));
        capituloList.add(cap);

        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_three));
        temporadaList.add(temp);

        generos = new ArrayList<>();
        generos.add(getString(R.string.gender1));
        generos.add(getString(R.string.gender2));
        generos.add(getString(R.string.gender3));
        generos.add(getString(R.string.gender8));
        generos.add(getString(R.string.gender9));

        a = new Serie(getString(R.string.full_metal), getString(R.string.full_metal),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[4]);
        serieList.add(a);

//////SERIE 6 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.kc1), 1,getString(R.string.desckc1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc2), 2,getString(R.string.desckc2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc3), 3,getString(R.string.desckc3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc4), 4,getString(R.string.desckc4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc5), 5,getString(R.string.desckc5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc6), 6,getString(R.string.desckc6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc7), 7,getString(R.string.desckc7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc8), 8,getString(R.string.desckc8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc9), 9,getString(R.string.desckc9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kc10), 10,getString(R.string.desckc10));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);
////////////serie 6 temporada 2
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.kct1), 1,getString(R.string.desckct1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct2), 2,getString(R.string.desckct2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct3), 3,getString(R.string.desckct3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct4), 4,getString(R.string.desckct4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct5), 5,getString(R.string.desckct5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct6), 6,getString(R.string.desckct6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct7), 7,getString(R.string.desckct7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct8), 8,getString(R.string.desckct8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct9), 9,getString(R.string.desckct9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.kct10), 10,getString(R.string.desckct10));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_two));
        temporadaList.add(temp);

        generos = new ArrayList<>();
        generos.add(getString(R.string.gender2));
        generos.add(getString(R.string.gender6));
        generos.add(getString(R.string.gender11));
        generos.add(getString(R.string.gender13));
        generos.add(getString(R.string.gender14));

        a = new Serie(getString(R.string.konosuba), getString(R.string.konosuba),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[5]);
        serieList.add(a);

        //////SERIE 7 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.css1), 1,getString(R.string.descss1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css2), 2,getString(R.string.descss2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css3), 3,getString(R.string.descss3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css4), 4,getString(R.string.descss4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css5), 5,getString(R.string.descss5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css6), 6,getString(R.string.descss6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css7), 7,getString(R.string.descss7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css8), 8,getString(R.string.descss8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css9), 9,getString(R.string.descss9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css10), 10,getString(R.string.descss10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css11), 11,getString(R.string.descss11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css12), 12,getString(R.string.descss12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.css13), 13,getString(R.string.descss13));
        capituloList.add(cap);



        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);
        /////// SERIE 7 temporada 2

        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c2ss1), 1,getString(R.string.desc2ss1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss2), 2,getString(R.string.desc2ss2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss3), 3,getString(R.string.desc2ss3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss4), 4,getString(R.string.desc2ss4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss5), 5,getString(R.string.desc2ss5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss6), 6,getString(R.string.desc2ss6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss7), 7,getString(R.string.desc2ss7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss8), 8,getString(R.string.desc2ss8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss9), 9,getString(R.string.desc2ss9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss10), 10,getString(R.string.desc2ss10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss11), 11,getString(R.string.desc2ss11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2ss12), 12,getString(R.string.desc2ss12));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_two));
        temporadaList.add(temp);
        /////// SERIE 7 temporada 3
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c3ss1), 1,getString(R.string.desc3ss1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3ss2), 2,getString(R.string.desc3ss2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3ss3), 3,getString(R.string.desc3ss3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3ss4), 4,getString(R.string.desc3ss4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3ss5), 5,getString(R.string.desc3ss5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3ss6), 6,getString(R.string.desc3ss6));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_three));
        temporadaList.add(temp);

        generos = new ArrayList<>();
        generos.add(getString(R.string.gender5));
        generos.add(getString(R.string.gender7));
        generos.add(getString(R.string.gender11));

        a = new Serie(getString(R.string.saint), getString(R.string.saint),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[6]);
        serieList.add(a);

        //////SERIE 8 temporada 1
        temporadaList = new ArrayList<>();
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.cshoku1), 1,getString(R.string.descshoku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku2), 2,getString(R.string.descshoku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku3), 3,getString(R.string.descshoku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku4), 4,getString(R.string.descshoku4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku5), 5,getString(R.string.descshoku5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku6), 6,getString(R.string.descshoku6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku7), 7,getString(R.string.descshoku7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku8), 8,getString(R.string.descshoku8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku9), 9,getString(R.string.descshoku9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku10), 10,getString(R.string.descshoku10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku11), 11,getString(R.string.descshoku11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku12), 12,getString(R.string.descshoku12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku13), 13,getString(R.string.descshoku13));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku14), 14,getString(R.string.descshoku14));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku15), 15,getString(R.string.descshoku15));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku16), 16,getString(R.string.descshoku16));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku17), 17,getString(R.string.descshoku17));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku18), 18,getString(R.string.descshoku18));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku19), 19,getString(R.string.descshoku19));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku20), 20,getString(R.string.descshoku20));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku21), 21,getString(R.string.descshoku21));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku22), 22,getString(R.string.descshoku22));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku23), 23,getString(R.string.descshoku23));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.cshoku24), 24,getString(R.string.descshoku24));
        capituloList.add(cap);



        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_one));
        temporadaList.add(temp);
        /////// SERIE 8 temporada 2

        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c2shoku1), 1,getString(R.string.desc2shoku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku2), 2,getString(R.string.desc2shoku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku3), 3,getString(R.string.desc2shoku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku4), 4,getString(R.string.desc2shoku4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku5), 5,getString(R.string.desc2shoku5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku6), 6,getString(R.string.desc2shoku6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku7), 7,getString(R.string.desc2shoku7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku8), 8,getString(R.string.desc2shoku8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku9), 9,getString(R.string.desc2shoku9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku10), 10,getString(R.string.desc2shoku10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku11), 11,getString(R.string.desc2shoku11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku12), 12,getString(R.string.desc2shoku12));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c2shoku13), 13,getString(R.string.desc2shoku13));
        capituloList.add(cap);


        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_two));
        temporadaList.add(temp);
        /////// SERIE 8 temporada 3
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c3shoku1), 1,getString(R.string.desc3shoku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku2), 2,getString(R.string.desc3shoku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku3), 3,getString(R.string.desc3shoku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku4), 4,getString(R.string.desc3shoku4));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku5), 5,getString(R.string.desc3shoku5));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku6), 6,getString(R.string.desc3shoku6));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku7), 7,getString(R.string.desc3shoku7));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku8), 8,getString(R.string.desc3shoku8));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku9), 9,getString(R.string.desc3shoku9));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku10), 10,getString(R.string.desc3shoku10));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku11), 11,getString(R.string.desc3shoku11));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c3shoku12), 12,getString(R.string.desc3shoku12));
        capituloList.add(cap);

        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_three));
        temporadaList.add(temp);
        /////// SERIE 8 temporada 4
        capituloList = new ArrayList<>();
        cap = new Capitulo(getString(R.string.c4shoku1), 1,getString(R.string.desc4shoku1));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c4shoku2), 2,getString(R.string.desc4shoku2));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c4shoku3), 3,getString(R.string.desc4shoku3));
        capituloList.add(cap);
        cap = new Capitulo(getString(R.string.c4shoku4), 4,getString(R.string.desc4shoku4));
        capituloList.add(cap);

        temp = new Temporada((ArrayList<Capitulo>) capituloList,getString(R.string.season_four));
        temporadaList.add(temp);




        generos = new ArrayList<>();
        generos.add(getString(R.string.gender5));
        generos.add(getString(R.string.gender15));
        generos.add(getString(R.string.gender16));

        a = new Serie(getString(R.string.shoku), getString(R.string.shoku),(ArrayList<Temporada>) temporadaList,
                (ArrayList<String>)generos, imagenes[7]);
        serieList.add(a);





        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
