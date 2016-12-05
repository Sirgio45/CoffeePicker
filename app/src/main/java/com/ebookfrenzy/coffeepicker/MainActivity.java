package com.ebookfrenzy.coffeepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] coffeShops={"Cravings Coffe Shop","From the Ground Up","Higher Grounds Backery & Coffee House","Blu Play Cafe"};
        final ListAdapter theAdapter = new MyAdapter(this,coffeShops);
        ListView theListView = (ListView)findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {


                setContentView(R.layout.second_screen_layout);
                TextView TextViewTheName=(TextView)findViewById(R.id.nameTextView);
                TextView TextViewTheAddress=(TextView)findViewById(R.id.addressTextView);
                if(theAdapter.getItem(i)==coffeShops[1])
                {
                    TextViewTheName.setText(coffeShops[1]);
                    TextViewTheAddress.setText("250 W Grand Ave, Wisconsin Rapids, WI 54495");
                }
                if(theAdapter.getItem(i)==coffeShops[0])
                {
                    TextViewTheName.setText(coffeShops[0]);
                    TextViewTheAddress.setText(" 312 8th St S, Wisconsin Rapids, WI 54494");
                }
                if(theAdapter.getItem(i)==coffeShops[2])
                {
                    TextViewTheName.setText(coffeShops[2]);
                    TextViewTheAddress.setText("4231 8th St S, Wisconsin Rapids, WI 54494 ");
                }
                if(theAdapter.getItem(i)==coffeShops[3])
                {
                    TextViewTheName.setText(coffeShops[3]);
                    TextViewTheAddress.setText(" 1000 E Riverview Expy #170, Wisconsin Rapids, WI 54494 ");
                }



            }
        });
    }


}
