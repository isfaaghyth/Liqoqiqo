package daeng.app.liqoqiqo.base;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;

/**
 * Created by isfaaghyth on 5/31/17.
 */

public class BaseFragment extends Fragment {

    protected void binding(View view) {
        ButterKnife.bind(this, view);
    }

}
