package com.example.menutest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    ImageView btn;
    Menu menu;
    WifiManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        registerForContextMenu(btn);
        manager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.add(0,0,0,"ip");
        menu.add(0,1,0,"port");
        menu.add(0,2,0,"wifi");
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if(id==R.id.menu_ip){
            showIpChange();
        }else if(id==R.id.menu_port){
            showPortChange();
        }else if(id==R.id.menu_wifi){
            startActivity(new Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY));
        }
        return super.onContextItemSelected(item);
    }
    void showIpChange(){

    }
    void showIpCheck(){

    }
    void showPortChange(){

    }
    void showPortCheck(){

    }
}