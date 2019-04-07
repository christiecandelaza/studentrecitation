package com.example.jaydee.studentrecitation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public class StudentClass extends Fragment {

    View myView;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.student_class_main, container, false);
        return myView;
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        //Show menus for student class
        menu.findItem(R.id.action_delete_class).setVisible(true);
        menu.findItem(R.id.action_delete_all_class).setVisible(true);
        menu.findItem(R.id.action_settings).setVisible(true);
        //hide all menus except for student class
        menu.findItem(R.id.action_delete_recitation).setVisible(false);
        menu.findItem(R.id.action_delete_all_recitation).setVisible(false);
        menu.findItem(R.id.action_start_recitation).setVisible(false);
        super.onPrepareOptionsMenu(menu);
    }
}
