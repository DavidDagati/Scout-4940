package com.example.scout_4940;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.scout_4940.R.id.button;
import static com.example.scout_4940.R.id.charttext;
import static com.example.scout_4940.R.id.matchNum;
//import com.example.scout_4940.R.id.matchNum;

public class Prematch extends Fragment {


    private static final String TAG = "fragment_main";
    private static final Object EditText = matchNum;
    // private static final Object EditText = matchNum ;
    //rivate static final Object Button = button;

    //public Prematch() {
      //  mnval = EditText.toString() ;
    //}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;

    }


    }




