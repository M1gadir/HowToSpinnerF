package com.magad.howtospinnerf.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.magad.howtospinnerf.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmpatFragment extends Fragment {


    public EmpatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_empat, container, false);
        Button tos4 = v.findViewById(R.id.btn_tos3);
        tos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"ini toast 3",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}
