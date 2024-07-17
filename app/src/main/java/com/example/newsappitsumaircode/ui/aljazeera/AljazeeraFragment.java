package com.example.newsappitsumaircode.ui.aljazeera;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class AljazeeraFragment extends Fragment {

    WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root =inflater.inflate(R.layout.fragment_gallery, container, false);

        webView = root.findViewById(R.id.aljazera_webView);
        webView.loadUrl("https://www.aljazeera.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}