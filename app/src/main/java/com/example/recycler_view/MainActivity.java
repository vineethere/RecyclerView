package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.printservice.CustomPrinterIconCallback;

public class MainActivity extends AppCompatActivity {
          RecyclerView rv;
          String arr[]={ "Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1","Item1",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
         CustomAdapter c=new CustomAdapter(arr);
         rv.setAdapter(c);
    }
}