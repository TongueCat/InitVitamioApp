package mwx.zhouxin.com.initvitamioapp.MediaController;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;
import mwx.zhouxin.com.initvitamioapp.R;
import mwx.zhouxin.com.initvitamioapp.VideoUrlRes;

/**
 * Created by Administrator on 2016/8/10.
 */
public class MediaControllerActivity  extends AppCompatActivity{
    private VideoView videoView;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("AndroidVideoView+MediaController");
        setContentView(R.layout.activity_media_controller);
        videoView = (io.vov.vitamio.widget.VideoView) findViewById(R.id.media_controller);

        playVideo();
    }

    private void playVideo() {

        videoView.setVideoPath(VideoUrlRes.getTestVideo2());

        mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        //videoView.start();
    }
}
