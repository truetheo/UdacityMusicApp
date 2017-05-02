package com.example.a.theomusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Catch the TextViews
        TextView nowPlayingView = (TextView) findViewById(R.id.nowPlaying);
        TextView playListView = (TextView) findViewById(R.id.playList);
        TextView artistsView = (TextView) findViewById(R.id.artists);
        TextView albumsView = (TextView) findViewById(R.id.albums);
        TextView songsView = (TextView) findViewById(R.id.songs);
        TextView appInfoView = (TextView) findViewById(R.id.appInfo);

        //Create the OnClickListener for the view
        nowPlayingView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingNowPlaying), Toast.LENGTH_SHORT).show();
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);

            }
        });
        playListView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingPlayList), Toast.LENGTH_SHORT).show();
                Intent playListIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playListIntent);

            }
        });
        artistsView.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingArtists), Toast.LENGTH_SHORT).show();
                Intent artistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
            });
        albumsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAlbums), Toast.LENGTH_SHORT).show();
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
        songsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingSongs), Toast.LENGTH_SHORT).show();
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
        appInfoView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(), getString(R.string.openingAppInfo), Toast.LENGTH_SHORT).show();
                Intent appInfoIntent = new Intent(MainActivity.this, AppInfoActivity.class);
                startActivity(appInfoIntent);
            }
        });

    }
}
