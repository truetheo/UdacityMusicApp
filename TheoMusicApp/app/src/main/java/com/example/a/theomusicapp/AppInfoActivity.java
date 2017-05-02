package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AppInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);

        //Catch the Views
        TextView nowPlayingApp = (TextView) findViewById(R.id.nowPlayingApp);
        TextView artistsApp = (TextView) findViewById(R.id.artistsApp);
        TextView playlistApp = (TextView) findViewById(R.id.playListApp);
        TextView albumsApp = (TextView) findViewById(R.id.albumsApp);
        TextView songsApp = (TextView) findViewById(R.id.songsApp);

        //Set OnClickListeners
        nowPlayingApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingNowPlaying), Toast.LENGTH_SHORT).show();
                Intent nowPlayingApp = new Intent(AppInfoActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingApp);
            }
        });
        artistsApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingArtists), Toast.LENGTH_SHORT).show();
                Intent artistsApp = new Intent(AppInfoActivity.this, ArtistsActivity.class);
                startActivity(artistsApp);
            }
        });
        playlistApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), getString(R.string.openingPlayList), Toast.LENGTH_SHORT).show();
                Intent playListApp = new Intent(AppInfoActivity.this, PlayListActivity.class);
                startActivity(playListApp);
            }
        });
        albumsApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent albumsApp = new Intent(AppInfoActivity.this, AlbumsActivity.class);
                startActivity(albumsApp);
            }
        });
        songsApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent songsApp = new Intent(AppInfoActivity.this, SongsActivity.class);
                startActivity(songsApp);
            }
        });
    }
}
