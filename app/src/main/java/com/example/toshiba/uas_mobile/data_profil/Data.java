package com.example.toshiba.uas_mobile.data_profil;

/**
 * Created by Toshiba on 10/01/2018.
 */

public class Data {
    private String sejarah, visi, misi,solusi;

    public Data() {

    }

    public Data(String sejarah, String visi, String misi, String solusi) {
        this.sejarah = sejarah;
        this.visi = visi;
        this.misi = misi;
        this.solusi = solusi;
    }



    public String getSejarah() {
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    public String getVisi() {
        return visi;
    }

    public void setVisi(String visi) {
        this.visi = visi;
    }

    public String getMisi() {
        return misi;
    }

    public void setMisi(String misi) {
        this.misi = misi;
    }
    public String getSolusi(){
        return solusi;
    }
    public void setSolusi(String solusi){
        this.solusi=solusi;
    }
}
