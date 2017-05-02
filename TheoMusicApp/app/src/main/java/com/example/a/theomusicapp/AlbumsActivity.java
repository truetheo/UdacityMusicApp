package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Catch the Views
        TextView nowPlayingAl = (TextView) findViewById(R.id.nowPlayingAl);
        TextView artistsAl = (TextView) findViewById(R.id.artistsAl);
        TextView playlistAl = (TextView) findViewById(R.id.playListAl);
        TextView songsAl = (TextView) findViewById(R.id.songsAl);
        TextView appInfoAl = (TextView) findViewById(R.id.appInfoAl);

        //Set OnClickListeners
        nowPlayingAl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingNowPlaying), Toast.LENGTH_SHORT).show();
                Intent nowPlayingAl = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingAl);
            }
        });
        artistsAl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingArtists), Toast.LENGTH_SHORT).show();
                Intent artistsAl = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistsAl);
            }
        });
        playlistAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), getString(R.string.openingPlayList), Toast.LENGTH_SHORT).show();
                Intent albumsAl = new Intent(AlbumsActivity.this, PlayListActivity.class);
                startActivity(albumsAl);
            }
        });
        songsAl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent songsAl = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsAl);
            }
        });
        appInfoAl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent appInfoAl = new Intent(AlbumsActivity.this, AppInfoActivity.class);
                startActivity(appInfoAl);
            }
        });
    }
}
