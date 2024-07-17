package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class NewYorkTimesNewsFragment extends Fragment {

    WebView webView;

    public NewYorkTimesNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_new_york_times_news, container, false);

        webView = root.findViewById(R.id.nyt_webView);
        webView.loadUrl("https://www.nytimes.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}