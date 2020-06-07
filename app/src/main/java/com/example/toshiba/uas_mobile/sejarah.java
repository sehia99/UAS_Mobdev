package com.example.toshiba.uas_mobile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.toshiba.uas_mobile.adapter;
import com.example.toshiba.uas_mobile.app.AppController;
import com.example.toshiba.uas_mobile.data_profil.Data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class sejarah extends AppCompatActivity {
    /*ListView list;
    List<Data> itemList= new ArrayList<Data>();
    adapter adapter;
    String sejarah, visi, misi, solusi;

    private static final String TAG = sejarah.class.getSimpleName();

    private static String url_read      = Server.URL + "select.php";

    public static final String TAG_SEJARAH  = "sejarah";
    public static final String TAG_VISI     = "visi";
    public static final String TAG_MISI     = "misi";
    public static final String TAG_SOLUSI   = "solusi";
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";

    String tag_json_obj = "json_obj_req";*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);
/*
        list = (ListView) findViewById(R.id.list);
        adapter = new adapter(sejarah.this, itemList);
        list.setAdapter(adapter);
        koneksi();*/
    }
    /*private void koneksi() {
        itemList.clear();
        adapter.notifyDataSetChanged();

        // membuat req array dengan JSON
        JsonArrayRequest jArr = new JsonArrayRequest(url_read, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                int d = Log.d(TAG, response.toString());

                // Parsing json
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject obj = response.getJSONObject(i);
                       /* itemList.add(new Data(
                                obj.getString(TAG_SEJARAH),
                        (obj.getString(TAG_VISI)),
                        (obj.getString(TAG_MISI)),
                        (obj.getString(TAG_SOLUSI))
                        ));

                        Data item = new Data();

                        item.setSejarah(obj.getString(TAG_SEJARAH));
                        item.setVisi(obj.getString(TAG_VISI));
                        item.setMisi(obj.getString(TAG_MISI));
                        item.setSolusi(obj.getString(TAG_SOLUSI));

                        // menambah item ke array
                        itemList.add(item);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                // notifikasi perubahan data adapter
                adapter.notifyDataSetChanged();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());

            }
        });
        // menambah request ke antrian request
        AppController.getInstance().addToRequestQueue(jArr);
    }*/

}

