package daeng.app.liqoqiqo.base;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;

/**
 * Created by isfaaghyth on 5/31/17.
 */

public class BaseActivity extends AppCompatActivity {

    protected void binding(int layout) {
        setContentView(layout);
        ButterKnife.bind(this);
    }

    protected void setToolbar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
