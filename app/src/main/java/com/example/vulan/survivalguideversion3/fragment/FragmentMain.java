package com.example.vulan.survivalguideversion3.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vulan.survivalguideversion3.R;
import com.example.vulan.survivalguideversion3.app.BaseFragment;


public class FragmentMain extends BaseFragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        findView(view);
        return view;
    }
    private void findView(View rootview){
        rootview.findViewById(R.id.buttonLearn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentListTopic());
            }
        });
    }
    @Override
    protected boolean enableToolbar() {
        return false;
    }

}
