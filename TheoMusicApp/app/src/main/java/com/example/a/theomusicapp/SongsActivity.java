package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Catch the Views
        TextView nowPlayingS = (TextView) findViewById(R.id.nowPlayingS);
        TextView artistsS = (TextView) findViewById(R.id.artistsS);
        TextView playlistS = (TextView) findViewById(R.id.playListS);
        TextView albumsS = (TextView) findViewById(R.id.albumsS);
        TextView appInfoS = (TextView) findViewById(R.id.appInfoS);

        //Set OnClickListeners
        nowPlayingS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingNowPlaying), Toast.LENGTH_SHORT).show();
                Intent nowPlayingS = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingS);
            }
        });
        artistsS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingArtists), Toast.LENGTH_SHORT).show();
                Intent artistsS = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(artistsS);
            }
        });
        playlistS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), getString(R.string.openingPlayList), Toast.LENGTH_SHORT).show();
                Intent playListS = new Intent(SongsActivity.this, PlayListActivity.class);
                startActivity(playListS);
            }
        });
        albumsS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent albumsS = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumsS);
            }
        });
        appInfoS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent appInfoS = new Intent(SongsActivity.this, AppInfoActivity.class);
                startActivity(appInfoS);
            }
        });
    }
}
