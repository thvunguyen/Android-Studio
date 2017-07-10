package info.cafeda.jdbutcher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import info.cafeda.jdbutcher.sample.DataFeeder;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DataItemRangeAdapter adapter = new DataItemRangeAdapter(this,DataFeeder.dataRangeList);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,DataFeeder.dataRangeList);
        ListView listView = (ListView) findViewById(R.id.rangeList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickLocationButtonHandler(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData( Uri.parse("geo:-27.5735747,152.9535502?q=11+Darra+Station+Road+%2C+Darra+%2C+QLD+%2C+4076"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void clickTradingButtonHandler(View view) {
        Intent intent = new Intent(this,TradingActivity.class);
        startActivity(intent);
    }

    public void clickWholesaleButtonHandler(View view) {
        Intent intent = new Intent(this,WholesaleActivity.class);
        startActivity(intent);
    }
}
