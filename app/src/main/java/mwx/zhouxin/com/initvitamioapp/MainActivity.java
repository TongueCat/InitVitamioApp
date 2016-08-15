package mwx.zhouxin.com.initvitamioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import mwx.zhouxin.com.initvitamioapp.MediaController.MediaControllerActivity;
import mwx.zhouxin.com.initvitamioapp.MyVideoView.CustomVideoActivity;
import mwx.zhouxin.com.initvitamioapp.adnroidVideoView.AndroidVideoActivity;
import mwx.zhouxin.com.initvitamioapp.videoBuffer.VideoBufferActivity;
import mwx.zhouxin.com.initvitamioapp.vitamioVideoView.VitamioVideoActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ArrayAdapter<String> adapter;
    private String[] datas=null;
    private ListView listView;

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        datas=new String[]{
                "appvidor",
                "vitamiovidor",
                "MediaController",
                "VideoBuffer",
                "CustomVideo"

 };
      listView= (ListView) findViewById(R.id.lv_main);
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent();
        switch (i){
            case 0:
                intent.setClass(this, AndroidVideoActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent.setClass(this, VitamioVideoActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent.setClass(this,MediaControllerActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent.setClass(this, VideoBufferActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent.setClass(this,CustomVideoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
