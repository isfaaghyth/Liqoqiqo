package daeng.app.liqoqiqo.view.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import daeng.app.liqoqiqo.R;
import daeng.app.liqoqiqo.base.BaseFragment;

/**
 * Created by isfaaghyth on 5/31/17.
 */

public class MainFragment extends BaseFragment {
    public MainFragment() {}

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        binding(view);
    }
}
