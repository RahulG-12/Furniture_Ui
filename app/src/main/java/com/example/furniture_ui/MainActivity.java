package com.example.furniture_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static RecyclerView.LayoutManager layoutManager;
    private static RecyclerView.Adapter adapter;
    private ArrayList<Datamodel> arrayList;
    private Context context;
    private RecyclerView recyclerView2;
    private static RecyclerView.LayoutManager layoutManager2;
    private static RecyclerView.Adapter adapter2;
    private ArrayList<Datamodel> arrayList2;
    private Context context2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initiateprimarycard();
        intitiatesecondarycard();
    }


    private void initiateprimarycard() {
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        arrayList=new ArrayList<>();
        for(int i=0;i<mydata.namearray.length;i++){
            arrayList.add(new Datamodel(
                    mydata.namearray[i],
                    mydata.versionArray[i],
                            mydata.id[i],
                                    mydata.drawableArray[i]
            ));

            adapter=new customadapter(arrayList,this);
            recyclerView.setAdapter(adapter);
        }
    }
    private void intitiatesecondarycard() {
        recyclerView2=findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());


        arrayList2=new ArrayList<>();
        for(int i=0;i<mydata.namearray.length;i++){
            arrayList2.add(new Datamodel(
                    mydata2.namearray[i],
                    mydata2.versionArray[i],
                    mydata2.id[i],
                    mydata2.drawableArray[i]
            ));

            adapter2=new customadapter2(arrayList2,this);
            recyclerView2.setAdapter(adapter2);
        }
    }

}