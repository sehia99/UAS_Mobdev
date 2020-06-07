package com.example.toshiba.uas_mobile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_logout, btn_sejarah, btn_visi ;
    SharedPreferences sharedpreferences;
    public static final String TAG_ID = "id";
    public static final String TAG_USERNAME = "username";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_logout=(Button) findViewById(R.id.btn_logout);
        btn_sejarah=(Button) findViewById(R.id.btn_sejarah);
        btn_visi=(Button) findViewById(R.id.btn_visi);
        sharedpreferences = getSharedPreferences(login.my_shared_preferences, Context.MODE_PRIVATE);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // update login session ke FALSE dan mengosongkan nilai id dan username
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putBoolean(login.session_status, false);
                editor.putString(TAG_ID, null);
                editor.putString(TAG_USERNAME, null);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, login.class);
                finish();
                startActivity(intent);
            }
        });
        btn_sejarah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, sejarah.class);
                startActivity(intent);
            }
        });
        btn_visi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, visi.class);
                startActivity(intent);
            }
        });

    }
}
