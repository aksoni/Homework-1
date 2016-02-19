package com.example.abhi.grammyquiz; /**
 * Created by Abhi on 2/18/2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TextQuestionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    public static TextQuestionFragment newInstance() {
        TextQuestionFragment fragment = new TextQuestionFragment();
        return fragment;
    }

    public TextQuestionFragment() {
        // Required empty public constructor
    }
}