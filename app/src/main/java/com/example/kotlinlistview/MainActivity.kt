package com.example.kotlinlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var arr = arrayOf(
        "Melbourne",
        "Vienna",
        "Vancouver",
        "Toronto",
        "Calgary",
        "Adelaide",
        "Perth",
        "Auckland",
        "Helsinki",
        "Hamburg",
        "Munich",
        "New York",
        "Sydney",
        "Paris",
        "Cape Town",
        "Barcelona",
        "London",
        "Bangkok",
        "Perth",
        "Auckland",
        "Helsinki",
        "Hamburg",
        "Munich",
        "New York",
        "Sydney",
        "Paris",
        "Cape Town",
        "Barcelona",
        "London",
        "Bangkok"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapt = ArrayAdapter(this, R.layout.listview_items,R.id.t1, arr);
        val lis: ListView=findViewById(R.id.l1)
        lis.setAdapter(adapt)
    }
}
