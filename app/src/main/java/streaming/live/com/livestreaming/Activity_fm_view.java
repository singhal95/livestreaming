package streaming.live.com.livestreaming;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Activity_fm_view extends AppCompatActivity {


    VideoView videoView;
    MediaController mediaController;
    String path;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fm_view);
        videoView=findViewById(R.id.videoView);
        textView=findViewById(R.id.text1);
        Intent intent=getIntent();
        if(intent.getIntExtra("value",0)==0){
            path= "android.resource://" + getPackageName() + "/" + R.raw.radio911;
            textView.setText("91.1");
        }
        else if(intent.getIntExtra("value",0)==1){
            path= "android.resource://" + getPackageName() + "/" + R.raw.radio935;
            textView.setText("93.5");
        }
        else if(intent.getIntExtra("value",0)==2) {
            path= "android.resource://" + getPackageName() + "/" + R.raw.radio950;
            textView.setText("95.0");
        }
        else if(intent.getIntExtra("value",0)==3){
            path= "android.resource://" + getPackageName() + "/" + R.raw.radio1026;
            textView.setText("102.6");
        }
        else
        {
            path= "android.resource://" + getPackageName() + "/" + R.raw.radio911;
            textView.setText("91.1");
        }

        mediaController=new MediaController(this){
            @Override
            public void hide() {

            }
        };
        videoView.setVideoURI(Uri.parse(path));
        videoView.requestFocus();
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
