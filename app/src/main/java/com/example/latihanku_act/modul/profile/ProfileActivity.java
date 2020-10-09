package com.example.latihanku_act.modul.profile;

import android.view.View;

import com.example.latihanku_act.base.BaseFragmentHolderActivity;
import com.example.latihanku_act.modul.login.LoginFragment;


public class ProfileActivity extends BaseFragmentHolderActivity {
    private ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileFragment.goBackToLogin();
            }
        });
        setCurrentFragment(profileFragment, true);
    }



}
