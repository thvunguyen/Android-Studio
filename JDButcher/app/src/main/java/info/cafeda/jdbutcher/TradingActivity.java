package info.cafeda.jdbutcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import info.cafeda.jdbutcher.sample.DataFeeder;

public class TradingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trading);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, DataFeeder.tradingHours);
        ListView listView = (ListView) findViewById(R.id.hoursList);
        listView.setAdapter(adapter);
    }
}
