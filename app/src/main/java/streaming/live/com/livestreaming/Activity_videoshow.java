package streaming.live.com.livestreaming;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Activity_videoshow extends AppCompatActivity {


    VideoView videoView;
    MediaController mediaController;
    String path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        Intent intent=getIntent();
        if(intent.getIntExtra("value",0)==0){
          path= "android.resource://" + getPackageName() + "/" + R.raw.video1;
        }
        else if(intent.getIntExtra("value",0)==1){
            path= "android.resource://" + getPackageName() + "/" + R.raw.video2;
        }
        else if(intent.getIntExtra("value",0)==2) {
            path= "android.resource://" + getPackageName() + "/" + R.raw.video3;
        }
        else
        {
            path= "android.resource://" + getPackageName() + "/" + R.raw.video1;
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
