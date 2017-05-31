package daeng.app.liqoqiqo.view.login;

import android.content.Intent;
import android.os.Bundle;

import daeng.app.liqoqiqo.R;
import daeng.app.liqoqiqo.base.BaseActivity;
import daeng.app.liqoqiqo.view.main.MainActivity;

public class LoginActivity extends BaseActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding(R.layout.activity_login);
        startActivity(new Intent(this, MainActivity.class));
    }
}
