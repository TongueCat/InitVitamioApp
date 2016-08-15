package mwx.zhouxin.com.initvitamioapp.MyVideoView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import mwx.zhouxin.com.initvitamioapp.R;

/**
 * Created by Administrator on 2016/8/10.
 */
public class CustomVideoActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setTitle("CustomVideo");
        setContentView(R.layout.activity_custom_video);
    }
}
