package mwx.zhouxin.com.initvitamioapp.adnroidVideoView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import mwx.zhouxin.com.initvitamioapp.R;
import mwx.zhouxin.com.initvitamioapp.VideoUrlRes;

public class AndroidVideoActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_video);
        videoView = (VideoView) findViewById(R.id.video_android);

        playVideo();
    }

    private void playVideo() {

        videoView.setVideoPath(VideoUrlRes.getTestVideo1());
        videoView.start();
    }
}
