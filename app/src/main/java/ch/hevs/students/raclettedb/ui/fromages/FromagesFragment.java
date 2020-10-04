package ch.hevs.students.raclettedb.ui.fromages;

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

/**
 * A fragment representing a list of Items.
 */
public class FromagesFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private  ArrayList<Fromage> mValues;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FromagesFragment() {
        mValues  = new ArrayList<Fromage>();
        mValues.add(new Fromage("Verbier"));
        mValues.add(new Fromage("Montana"));
        mValues.add(new Fromage("Bagnes"));
        mValues.add(new Fromage("Turtmann"));
        mValues.add(new Fromage("Simplon"));
        mValues.add(new Fromage("Visp"));
        mValues.add(new Fromage("Anniviers"));
        mValues.add(new Fromage("Vissoie"));
        mValues.add(new Fromage("Lens"));
        mValues.add(new Fromage("Orsière"));
        mValues.add(new Fromage("Illiez"));
        mValues.add(new Fromage("Gomser"));
        mValues.add(new Fromage("Heida"));
        mValues.add(new Fromage("Mondralèche"));
        mValues.add(new Fromage("Tanay"));
        mValues.add(new Fromage("Champsot"));
        mValues.add(new Fromage("Les Haudères"));
        mValues.add(new Fromage("Vollèges"));
        mValues.add(new Fromage("Etiez"));
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static FromagesFragment newInstance(int columnCount) {
        FromagesFragment fragment = new FromagesFragment();
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
        View view = inflater.inflate(R.layout.fragment_fromages_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyFromageRecyclerViewAdapter(mValues));
        }
        return view;
    }
}