package com.example.videoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Ejemplo de reproducción de un vídeo mp4 contenido
 * en un WebView, se añade control de reproducción
 * @author Rafa
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {
    private VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView =(VideoView)findViewById(R.id.surface_view);
        String uriPath = "android.resource://"+
                getPackageName() + "/raw/"+R.raw.bob;
        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.start();
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();
    }
}