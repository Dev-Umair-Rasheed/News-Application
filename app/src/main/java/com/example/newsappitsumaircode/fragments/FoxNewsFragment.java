package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class FoxNewsFragment extends Fragment {

    WebView webView;

    public FoxNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_fox_news, container, false);

        webView = root.findViewById(R.id.fox_webView);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}