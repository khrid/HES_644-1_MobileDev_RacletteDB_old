package ch.hevs.students.raclettedb.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;

import ch.hevs.students.raclettedb.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private TextView tv_home_cc_fromage1;
    private TextView tv_home_cc_fromage2;
    private TextView tv_home_cc_fromage3;
    private TextView tv_home_alpagesemaine;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        // Mise en place des éléments
        ArrayList<String> fromages = new ArrayList<>();
        fromages.add("Haudères");
        fromages.add("Bagnes 4");
        fromages.add("Gomser 55");

        String alpageDeLaSemaine = "Randonnaz";

        tv_home_cc_fromage1 = root.findViewById(R.id.tv_home_cc_fromage1);
        tv_home_cc_fromage2 = root.findViewById(R.id.tv_home_cc_fromage2);
        tv_home_cc_fromage3 = root.findViewById(R.id.tv_home_cc_fromage3);

        tv_home_cc_fromage1.setText(fromages.get(0));
        tv_home_cc_fromage2.setText(fromages.get(1));
        tv_home_cc_fromage3.setText(fromages.get(2));

        tv_home_alpagesemaine = root.findViewById(R.id.tv_home_alpagesemaine_label);
        tv_home_alpagesemaine.setText(alpageDeLaSemaine);

        return root;
    }
}