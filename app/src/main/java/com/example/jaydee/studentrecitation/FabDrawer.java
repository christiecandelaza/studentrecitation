package com.example.jaydee.studentrecitation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FabDrawer extends BottomSheetDialogFragment {

    View myView;

    LinearLayout recitation, studentClass, schedule;

    public FabDrawer () {
        //Empty
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fab_drawer, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        studentClass = view.findViewById(R.id.add_new_student_class);
        studentClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddStudentClass(v);
            }
        });

        recitation = view.findViewById(R.id.add_new_recitation);
        recitation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddRecitation(v);
            }
        });

        schedule = view.findViewById(R.id.add_new_schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddSchedule(v);
            }
        });
    }

    public void AddRecitation(View view){

    }

    public void AddStudentClass(View view){
        AddStudent addStudent = new AddStudent();
        addStudent.show(getFragmentManager(), "add_student");
    }

    public void AddSchedule(View view){

    }
}
