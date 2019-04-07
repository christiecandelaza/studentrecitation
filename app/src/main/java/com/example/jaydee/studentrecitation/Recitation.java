package com.example.jaydee.studentrecitation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class Recitation extends Fragment {

    View myView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.recitation_main, container, false);
        return  myView;
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        //Show menus for recitation
        menu.findItem(R.id.action_delete_recitation).setVisible(true);
        menu.findItem(R.id.action_delete_all_recitation).setVisible(true);
        menu.findItem(R.id.action_settings).setVisible(true);
        //hide all menus except for recitation
        menu.findItem(R.id.action_start_recitation).setVisible(false);
        menu.findItem(R.id.action_delete_class).setVisible(false);
        menu.findItem(R.id.action_delete_all_class).setVisible(false);
        super.onPrepareOptionsMenu(menu);
    }
}
