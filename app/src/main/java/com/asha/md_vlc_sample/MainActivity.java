package com.asha.md_vlc_sample;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

/*         "https://v-cdn.zjol.com.cn/276984.mp4";
           "rtmp://liteavapp.qcloud.com/live/liteavdemoplayerstreamid"
           "rtsp://admin:Hik12345@192.168.2.67:554/h264/ch1/main/av_stream"
           */

    private static final String URL = "rtmp://liteavapp.qcloud.com/live/liteavdemoplayerstreamid";

    private static final String URL_RTSP = "rtmp://liteavapp.qcloud.com/live/liteavdemoplayerstreamid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onVRLibClicked(View view) {
        VRLibPlayerDemoActivity.start(MainActivity.this, Uri.parse(URL));
    }

    public void onRTSPVRLibClicked(View view) {
        VRLibPlayerDemoActivity.start(MainActivity.this, Uri.parse(URL_RTSP));
    }
}
