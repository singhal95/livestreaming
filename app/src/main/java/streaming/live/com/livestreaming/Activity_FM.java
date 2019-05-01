package streaming.live.com.livestreaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_FM extends AppCompatActivity {


    ListView listView;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__fm);
        listView=findViewById(R.id.list);
        arrayList=new ArrayList<>();
        arrayList.add("91.1");
        arrayList.add("93.5");
        arrayList.add("95.0");
        arrayList.add("102.6");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(Activity_FM.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(Activity_FM.this,Activity_fm_view.class);
                        intent.putExtra("value",0);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(Activity_FM.this,Activity_fm_view.class);
                        intent1.putExtra("value",1);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(Activity_FM.this,Activity_fm_view.class);
                        intent2.putExtra("value",2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(Activity_FM.this,Activity_fm_view.class);
                        intent3.putExtra("value",3);
                        startActivity(intent3);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Wrong Choice",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
