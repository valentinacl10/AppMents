package com.example.appments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button3_anterior).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.button3_siguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_ThirdFragment_to_FourthFragment);

            }

        });

    }

}