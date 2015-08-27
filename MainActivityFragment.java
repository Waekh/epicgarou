package com.example.tino.loupgarou;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    private Button btnStart;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        btnStart = (Button) view.findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this.getActivity(),
                "Partie commencée", Toast.LENGTH_LONG).show();
    }
}