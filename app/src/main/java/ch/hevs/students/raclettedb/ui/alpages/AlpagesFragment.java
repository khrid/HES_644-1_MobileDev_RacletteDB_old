package ch.hevs.students.raclettedb.ui.alpages;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ch.hevs.students.raclettedb.R;
import ch.hevs.students.raclettedb.ui.fromages.Fromage;

/**
 * A fragment representing a list of Items.
 */
public class AlpagesFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private ArrayList<Alpage> mValues;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AlpagesFragment() {
        mValues  = new ArrayList<Alpage>();
        mValues.add(new Alpage("Verbier"));
        mValues.add(new Alpage("Montana"));
        mValues.add(new Alpage("Bagnes"));
        mValues.add(new Alpage("Turtmann"));
        mValues.add(new Alpage("Simplon"));
        mValues.add(new Alpage("Visp"));
        mValues.add(new Alpage("Anniviers"));
        mValues.add(new Alpage("Vissoie"));
        mValues.add(new Alpage("Lens"));
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AlpagesFragment newInstance(int columnCount) {
        AlpagesFragment fragment = new AlpagesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alpages_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyAlpageRecyclerViewAdapter(mValues));
        }
        return view;
    }
}