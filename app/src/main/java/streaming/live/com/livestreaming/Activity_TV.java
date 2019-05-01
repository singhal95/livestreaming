package streaming.live.com.livestreaming;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_TV extends AppCompatActivity {


    ListView listView;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__tv);
        listView=findViewById(R.id.list);
        arrayList=new ArrayList<>();
        arrayList.add("Channel 1");
        arrayList.add("Channel 2");
        arrayList.add("Channel 3");
        arrayList.add("Channel 4");
        arrayList.add("Channel 5");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(Activity_TV.this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(Activity_TV.this,Activity_videoshow.class);
                        intent.putExtra("value",0);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(Activity_TV.this,Activity_videoshow.class);
                        intent1.putExtra("value",1);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(Activity_TV.this,Activity_videoshow.class);
                        intent2.putExtra("value",2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + "iqiJ_4RpBq0"));
                        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.youtube.com/watch?v=" + "iqiJ_4RpBq0"));
                        try {
                            startActivity(appIntent);
                        } catch (ActivityNotFoundException ex) {
                            startActivity(webIntent);
                        }
                        break;
                    case 4:
                        Intent appIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + "3G0GHxzhL70"));
                        Intent webIntent2 = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.youtube.com/watch?v=" + "3G0GHxzhL70"));
                        try {
                            startActivity(appIntent1);
                        } catch (ActivityNotFoundException ex) {
                            startActivity(webIntent2);
                        }
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Wrong Choice",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
