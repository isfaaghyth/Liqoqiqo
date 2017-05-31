package daeng.app.liqoqiqo.view.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

import butterknife.BindView;
import daeng.app.liqoqiqo.R;
import daeng.app.liqoqiqo.base.BaseActivity;
import daeng.app.liqoqiqo.presenter.main.IMainPresenter;
import daeng.app.liqoqiqo.presenter.main.MainPresenter;

public class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.toolbar_main) Toolbar toolbarMain;
    @BindView(R.id.tab_main) TabLayout tabLayoutMain;
    @BindView(R.id.viewpager_main) ViewPager viewPagerMain;
    @BindView(R.id.txt_title) TextView txtTitle;

    MainPresenter presenter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding(R.layout.activity_main);
        setToolbar(toolbarMain);

        tabLayoutMain.setupWithViewPager(getViewPager());
        presenter = new IMainPresenter(this);
        presenter.setupViewPager(getViewPager());
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override public FragmentManager getSupportFragment() {
        return getSupportFragmentManager();
    }

    @Override public ViewPager getViewPager() {
        return viewPagerMain;
    }

    @Override public TabLayout getTabLayout() {
        return tabLayoutMain;
    }

    @Override public void changeTextToolbar(String title) {
        txtTitle.setText(title);
    }
}
