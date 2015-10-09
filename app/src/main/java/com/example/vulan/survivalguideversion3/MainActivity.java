package com.example.vulan.survivalguideversion3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.vulan.survivalguideversion3.app.BaseActivity;
import com.example.vulan.survivalguideversion3.app.BaseFragment;
import com.example.vulan.survivalguideversion3.fragment.FragmentMain;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected BaseFragment getFragmentContent() {
        return new FragmentMain();
    }
}
