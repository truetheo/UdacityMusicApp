package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //Catch the Views
        TextView nowPlayingArt = (TextView) findViewById(R.id.nowPlayingArt);
        TextView playListArt = (TextView) findViewById(R.id.playListArt);
        TextView albumsArt = (TextView) findViewById(R.id.albumsArt);
        TextView songsArt = (TextView) findViewById(R.id.songsArt);
        TextView appInfoArt = (TextView) findViewById(R.id.appInfoArt);

        //Set OnClickListeners
        nowPlayingArt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingNowPlaying), Toast.LENGTH_SHORT).show();
                Intent nowPlayingArt = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingArt);
            }
        });
        playListArt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingPlayList), Toast.LENGTH_SHORT).show();
                Intent artistsArt = new Intent(ArtistsActivity.this, PlayListActivity.class);
                startActivity(artistsArt);
            }
        });
        albumsArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), getString(R.string.openingAlbums), Toast.LENGTH_SHORT).show();
                Intent albumsArt = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumsArt);
            }
        });
        songsArt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent songsArt = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsArt);
            }
        });
        appInfoArt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent appInfoArt = new Intent(ArtistsActivity.this, AppInfoActivity.class);
                startActivity(appInfoArt);
            }
        });
    }
}
