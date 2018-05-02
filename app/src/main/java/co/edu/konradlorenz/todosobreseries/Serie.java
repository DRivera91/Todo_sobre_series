package co.edu.konradlorenz.todosobreseries;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable;

public class Serie implements Parcelable {

    private String nombre, temporada;
    private ArrayList<Temporada> temporadaList;
    private ArrayList<String> genero;
    private int thumbnail;


    public Serie(){

    }

    public Serie(String nombre, String temporada, ArrayList<Temporada> temporadaList, ArrayList<String> genero, int thumbnail) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.temporadaList = temporadaList;
        this.genero = genero;
        this.thumbnail = thumbnail;
    }

    public Serie(ArrayList<Temporada> temporadaList, String nombre, ArrayList<String> genero, int thumbnail) {
        this.temporadaList = temporadaList;
        this.nombre = nombre;
        this.genero = genero;
        this.thumbnail = thumbnail;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public ArrayList<Temporada> getTemporadaList() {
        return temporadaList;
    }

    public void setTemporadaList(ArrayList<Temporada> temporadaList) {
        this.temporadaList = temporadaList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<String> genero) {
        this.genero = genero;
    }


    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    protected Serie(Parcel in) {
        if (in.readByte() == 0x01) {
            temporadaList = new ArrayList<Temporada>();
            in.readList(temporadaList, Temporada.class.getClassLoader());
        } else {
            temporadaList = null;
        }
        nombre = in.readString();
        thumbnail = in.readInt();
        if (in.readByte() == 0x01) {
            genero = new ArrayList<String>();
            in.readList(genero, String.class.getClassLoader());
        } else {
            genero = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (temporadaList == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(temporadaList);
        }
        dest.writeString(nombre);
        dest.writeInt(thumbnail);
        if (genero == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(genero);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Serie> CREATOR = new Parcelable.Creator<Serie>() {
        @Override
        public Serie createFromParcel(Parcel in) {
            return new Serie(in);
        }

        @Override
        public Serie[] newArray(int size) {
            return new Serie[size];
        }
    };
}