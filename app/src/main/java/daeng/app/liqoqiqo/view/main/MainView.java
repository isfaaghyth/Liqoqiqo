package daeng.app.liqoqiqo.view.main;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

/**
 * Created by isfaaghyth on 5/30/17.
 */

public interface MainView {
    FragmentManager getSupportFragment();
    ViewPager getViewPager();
    TabLayout getTabLayout();
    void changeTextToolbar(String title);
}
