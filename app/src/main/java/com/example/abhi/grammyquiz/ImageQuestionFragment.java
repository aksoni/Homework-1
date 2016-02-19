package com.example.abhi.grammyquiz;

/**
 * Created by Abhi on 2/18/2016.
 */
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageQuestionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image, container, false);
    }

    public static ImageQuestionFragment newInstance() {
        ImageQuestionFragment fragment = new ImageQuestionFragment();
        return fragment;
    }

    public ImageQuestionFragment() {
        // Required empty public constructor
    }
}