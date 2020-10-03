package ch.hevs.students.raclettedb.ui.about;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ch.hevs.students.raclettedb.BuildConfig;
import ch.hevs.students.raclettedb.R;

public class AboutFragment extends Fragment {


    private AboutViewModel mViewModel;

    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.about_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AboutViewModel.class);
        // TODO: Use the ViewModel
        ImageView imgGithub = (ImageView) getView().findViewById(R.id.iv_about_github);
        TextView tvGithub = (TextView) getView().findViewById(R.id.tv_about_github);
        TextView tvVersion = (TextView) getView().findViewById(R.id.tv_about_version);

        imgGithub.setOnClickListener(new onClickListenerGithub());
        tvGithub.setOnClickListener(new onClickListenerGithub());

        tvVersion.setText("v. " + BuildConfig.VERSION_NAME);
    }
}

class onClickListenerGithub implements View.OnClickListener {

    static final String GITHUB_URL = "https://github.com/Khrid/HES_644-1_MobileDev_RacletteDB";
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(GITHUB_URL));
        v.getContext().startActivity(intent);
    }
}