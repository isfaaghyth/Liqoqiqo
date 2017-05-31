package daeng.app.liqoqiqo.presenter.main;

import android.support.v4.view.ViewPager;

import daeng.app.liqoqiqo.adapter.ViewPagerAdapter;
import daeng.app.liqoqiqo.view.main.MainView;
import daeng.app.liqoqiqo.view.main.fragment.AttendanceFragment;
import daeng.app.liqoqiqo.view.main.fragment.DiscussFragment;
import daeng.app.liqoqiqo.view.main.fragment.FeatureFragment;
import daeng.app.liqoqiqo.view.main.fragment.MainFragment;
import daeng.app.liqoqiqo.view.main.fragment.ProfileFragment;

/**
 * Created by isfaaghyth on 5/30/17.
 */

public class IMainPresenter implements MainPresenter {

    MainView mainView;

    public IMainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    @Override public void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(mainView.getSupportFragment());
        adapter.addFragment(new AttendanceFragment(), "Kehadiran");
        adapter.addFragment(new DiscussFragment(), "Diskusi");
        adapter.addFragment(new FeatureFragment(), "Fitur");
        adapter.addFragment(new MainFragment(), "Beranda");
        adapter.addFragment(new ProfileFragment(), "Profile");
        mainView.getViewPager().setAdapter(adapter);
    }
}
