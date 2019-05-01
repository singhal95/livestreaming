package streaming.live.com.livestreaming;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Activity_vaudio_view extends AppCompatActivity {


    VideoView videoView;
    MediaController mediaController;
    String path;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaudio_view);
        Intent intent=getIntent();
        textView=findViewById(R.id.text1);
        if(intent.getIntExtra("value",0)==0){
            path= "android.resource://" + getPackageName() + "/" + R.raw.radio911;
            textView.setText("Song 1");
        }
        else if(intent.getIntExtra("value",0)==1){
            path= "android.resource://" + getPackageName() + "/" + R.raw.song2;
            textView.setText("Song 2");
        }
        else if(intent.getIntExtra("value",0)==2) {
            path= "android.resource://" + getPackageName() + "/" + R.raw.song3;
            textView.setText("Song 3");
        }
        else if(intent.getIntExtra("value",0)==3){
            path= "android.resource://" + getPackageName() + "/" + R.raw.song4;
            textView.setText("Song 4");
        }
        else if(intent.getIntExtra("value",0)==4) {
            path= "android.resource://" + getPackageName() + "/" + R.raw.song5;
            textView.setText("Song 5");
        }
        else
        {
            path= "android.resource://" + getPackageName() + "/" + R.raw.song1;
            textView.setText("Song 1");
        }
        videoView=findViewById(R.id.videoView);
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
