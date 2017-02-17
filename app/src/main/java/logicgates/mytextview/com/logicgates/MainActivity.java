package logicgates.mytextview.com.logicgates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView gatesList;

    //added a line of comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gatesList= (ListView) findViewById(R.id.listView);

        final String[] gates = new String[]{
                "AND",
                "OR",
                "NOT",
                "XoR",
                "All in One"
        };

        ArrayAdapter<String> gatesAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,gates);

        gatesList.setAdapter(gatesAdapter);

        gatesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent andIntent = new Intent(MainActivity.this, andActivity.class);
                        startActivity(andIntent);
                        break;
                    case 1:
                        Intent orIntent = new Intent(MainActivity.this, orActivity.class);
                        startActivity(orIntent);
                        break;
                    case 2:
                        Intent notIntent = new Intent(MainActivity.this, notActivity.class);
                        startActivity(notIntent);
                        break;
                    case 4:
                        Intent allInOneIntent = new Intent(MainActivity.this, allInOneActivity.class);
                        startActivity(allInOneIntent);
                        break;
                    case 3:
                        Intent XoRIntent = new Intent(MainActivity.this, XoRActivity.class);
                        startActivity(XoRIntent);
                        break;
                }

            }
        });
    }
}
