package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        //Catch the Views
        TextView nowPlayingPL = (TextView) findViewById(R.id.nowPlayingPL);
        TextView artistsPL = (TextView) findViewById(R.id.artistsPL);
        TextView albumsPL = (TextView) findViewById(R.id.albumsPL);
        TextView songsPL = (TextView) findViewById(R.id.songsPL);
        TextView appInfoPL = (TextView) findViewById(R.id.appInfoPL);

        //Set OnClickListeners
        nowPlayingPL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingNowPlaying), Toast.LENGTH_SHORT).show();
                Intent nowPlayingPL = new Intent(PlayListActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingPL);
            }
        });
        artistsPL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingArtists), Toast.LENGTH_SHORT).show();
                Intent artistsPL = new Intent(PlayListActivity.this, ArtistsActivity.class);
                startActivity(artistsPL);
            }
        });
        albumsPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), getString(R.string.openingAlbums), Toast.LENGTH_SHORT).show();
                Intent albumsPL = new Intent(PlayListActivity.this, AlbumsActivity.class);
                startActivity(albumsPL);
            }
        });
        songsPL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent songsPL = new Intent(PlayListActivity.this, SongsActivity.class);
                startActivity(songsPL);
            }
        });
        appInfoPL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent appInfoPL = new Intent(PlayListActivity.this, AppInfoActivity.class);
                startActivity(appInfoPL);
            }
        });
    }
}
