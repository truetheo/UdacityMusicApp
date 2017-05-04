package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {
    Boolean paused = true;
    ImageView playPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Catch the Views
        TextView playListNP = (TextView) findViewById(R.id.playListNP);
        TextView artistNP = (TextView) findViewById(R.id.artistsNP);
        TextView albumsNP = (TextView) findViewById(R.id.albumsNP);
        TextView songsNP = (TextView) findViewById(R.id.songsNP);
        TextView appInfoNP = (TextView) findViewById(R.id.appInfoNP);
        playPause = (ImageView) findViewById(R.id.play_pause);


        //Set OnClickListeners
        playListNP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingPlayList), Toast.LENGTH_SHORT).show();
                Intent playListOpen = new Intent(NowPlayingActivity.this, PlayListActivity.class);
                startActivity(playListOpen);
            }
        });
        artistNP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingArtists), Toast.LENGTH_SHORT).show();
                Intent artistsNP = new Intent(NowPlayingActivity.this, ArtistsActivity.class);
                startActivity(artistsNP);
            }
        });
        albumsNP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), getString(R.string.openingAlbums), Toast.LENGTH_SHORT).show();
                Intent albumsNP = new Intent(NowPlayingActivity.this, AlbumsActivity.class);
                startActivity(albumsNP);
            }
        });
        songsNP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent songsNP = new Intent(NowPlayingActivity.this, SongsActivity.class);
                startActivity(songsNP);
            }
        });
        appInfoNP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent appInfoNP = new Intent(NowPlayingActivity.this, AppInfoActivity.class);
                startActivity(appInfoNP);
            }
        });
        playPause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.v("NowPlayingActivity", "You clicked play");
                if (paused){
                    paused = false;

                    playPause.setImageResource(R.drawable.ic_pause_circle_outline_black_64dp);

                } else{
                    paused = true;
                    playPause.setImageResource(R.drawable.ic_play_arrow_black_64dp);
                }


            }
        });
    }
}
