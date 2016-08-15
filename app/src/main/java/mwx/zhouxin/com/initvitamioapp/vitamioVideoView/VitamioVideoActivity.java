package mwx.zhouxin.com.initvitamioapp.vitamioVideoView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import io.vov.vitamio.widget.VideoView;
import mwx.zhouxin.com.initvitamioapp.R;
import mwx.zhouxin.com.initvitamioapp.VideoUrlRes;

/**
 * Created by Administrator on 2016/8/10.
 */
public class VitamioVideoActivity extends AppCompatActivity {
private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamio_video);
        videoView = (VideoView) findViewById(R.id.video_vitamio);

        playVideo();
    }

    private void playVideo() {

        videoView.setVideoPath(VideoUrlRes.getTestVideo2());
        videoView.start();
    }
}
