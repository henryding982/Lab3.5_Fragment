package com.example.taruc.lab35fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {


    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final TextView txtViewMessage;
        View view;
        view = inflater.inflate(R.layout.fragment_gallery2, container, false);

        txtViewMessage = view.findViewById(R.id.textView3);
        Button button = view.findViewById(R.id.buttonShowMessage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtViewMessage.setText("THIS IS GALLERY THOOOOOOOOO!");
            }
        });
        // Inflate the layout for this fragment
        return view;
    }


}
