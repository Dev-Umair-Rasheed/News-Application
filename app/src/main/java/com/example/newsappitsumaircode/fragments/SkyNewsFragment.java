package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class SkyNewsFragment extends Fragment {

    WebView webView;

    public SkyNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_sky_news, container, false);

        webView = root.findViewById(R.id.sky_webView);
        webView.loadUrl("https://news.sky.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}