package com.z1911.thinyoutube;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import com.z1911.thinyoutube.Fragments.YoutubeListFragment;
import com.z1911.thinyoutube.Network.Const;
import com.z1911.thinyoutube.Network.IYoutubeService;

import retrofit.RestAdapter;


public class MainActivity extends FragmentActivity {

    private static IYoutubeService mApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateApiClient();
        ManageFragments();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // This method creates an ArrayList that has three Song objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.


    private void ManageFragments() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        YoutubeListFragment fragment = new YoutubeListFragment();
        fragmentTransaction.add(R.id.container, fragment);
        fragmentTransaction.commit();
    }

    private void CreateApiClient() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Const.Youtube)
                .build();

        mApi = restAdapter.create(IYoutubeService.class);
    }

    public static IYoutubeService getApiService() {
        return mApi;
    }
}
