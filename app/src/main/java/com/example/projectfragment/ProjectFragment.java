package com.example.projectfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProjectFragment extends Fragment {


    ProjectFragmentAdapter adapter = new ProjectFragmentAdapter();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.ProjectFragmentFeed);
        recyclerView.setItemViewCacheSize(100);
        Context applicationContext = recyclerView.getContext().getApplicationContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(applicationContext));
        recyclerView.setAdapter(adapter);
        FloatingActionButton fab = view.findViewById(R.id.floating_button);

        //нажатие на желтую кнопку
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("numbers", adapter.data.size());
    }

}
