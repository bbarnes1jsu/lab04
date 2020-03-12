package com.example.lab04;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import android.view.View.OnClickListener;
/**
 * A simple {@link Fragment} subclass.
 */
public class temp extends Fragment {

    Button b = new Button;

    public temp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_temp, container, false);

        txtOutput = (TextView)view.findViewById(R.id.txtOutput);

        Button b = (Button)view.findViewById(R.id.button);
        b.setOnClickListener( this );

        return view;

    }


    public class TempFragment extends Fragment implements OnClickListener {

        /* the body of your class goes here */

    }

    @Override
    public void onClick(View v) {

        /* the body of your method goes here */

    }

}
