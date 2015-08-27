package com.example.tino.loupgarou;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Tino on 27/08/15.
 */
public class TitleActivity extends Fragment implements View.OnClickListener {

    private Button btnStart;

    public TitleActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title, container, false);
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
