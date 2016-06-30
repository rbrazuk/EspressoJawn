package com.example.rbrazuk.espressojawn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    List<String> dummyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView rvWrestlers = (RecyclerView) findViewById(R.id.recycler_view);

        dummyList = new ArrayList<>();

        dummyList.add("Andre the Giant");
        dummyList.add("Macho Man");
        dummyList.add("Stone Cold Steve Austin");
        dummyList.add("The Rock");
        dummyList.add("Hulk Hogan");
        dummyList.add("Ultimate Warrior");
        dummyList.add("Sargent Slaughter");
        dummyList.add("Shawn Michaels");
        dummyList.add("The Undertaker");
        dummyList.add("Mankind");
        dummyList.add("Cactus Jack");
        dummyList.add("Bret Hart");
        dummyList.add("Owen Hart");
        dummyList.add("Kane");

        WrestlerAdapter adapter = new WrestlerAdapter(this,dummyList);

        rvWrestlers.setAdapter(adapter);

        rvWrestlers.setLayoutManager(new LinearLayoutManager(this));



    }
}
