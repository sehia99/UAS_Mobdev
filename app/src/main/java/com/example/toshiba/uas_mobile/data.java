package com.example.toshiba.uas_mobile;

/**
 * Created by Toshiba on 09/01/2018.
 */

public class data {
    private String sejarah, visi, misi, cara;

    public data() {
    }

    public data(String sejarah, String visi, String misi, String cara) {
        this.sejarah = sejarah;
        this.visi = visi;
        this.misi = misi;
        this.cara = cara;
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
    public String getCara(){
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }
}
