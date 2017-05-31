package daeng.app.liqoqiqo.presenter.main;

import android.support.v4.view.ViewPager;

import daeng.app.liqoqiqo.R;
import daeng.app.liqoqiqo.adapter.ViewPagerAdapter;
import daeng.app.liqoqiqo.view.main.MainView;
import daeng.app.liqoqiqo.view.main.fragment.AttendanceFragment;
import daeng.app.liqoqiqo.view.main.fragment.DiscussFragment;
import daeng.app.liqoqiqo.view.main.fragment.MainFragment;
import daeng.app.liqoqiqo.view.main.fragment.ProfileFragment;

/**
 * Created by isfaaghyth on 5/30/17.
 */

public class IMainPresenter implements MainPresenter {

    private MainView mainView;

    public IMainPresenter(MainView mainView) {
        this.mainView = mainView;
        viewPagerOnChangeListener();
    }

    @Override public void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(mainView.getSupportFragment());
        adapter.addFragment(new MainFragment(), "Beranda");
        adapter.addFragment(new DiscussFragment(), "Diskusi");
        adapter.addFragment(new AttendanceFragment(), "Kehadiran");
        adapter.addFragment(new ProfileFragment(), "Profile");
        mainView.getViewPager().setAdapter(adapter);
        setIconPager();
    }

    private void setIconPager() {
        try {
            mainView.getTabLayout().getTabAt(0).setIcon(R.mipmap.ic_home);
            mainView.getTabLayout().getTabAt(1).setIcon(R.mipmap.ic_discuss);
            mainView.getTabLayout().getTabAt(2).setIcon(R.mipmap.ic_attendance);
            mainView.getTabLayout().getTabAt(3).setIcon(R.mipmap.ic_profile);
        } catch (NullPointerException ignoted) {}
    }

    private void viewPagerOnChangeListener() {
        mainView.getViewPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        mainView.changeTextToolbar("Liqoqiqo");
                        break;
                    case 1:
                        mainView.changeTextToolbar("Diskusi");
                        break;
                    case 2:
                        mainView.changeTextToolbar("Kehadiran");
                        break;
                    case 3:
                        mainView.changeTextToolbar("Profil");
                        break;
                }
            }

            @Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override public void onPageScrollStateChanged(int state) {}
        });
    }
}
