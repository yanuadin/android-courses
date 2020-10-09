package com.example.latihanku_act.modul.profile;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.latihanku_act.R;
import static com.example.latihanku_act.modul.Constant.EMAIL_KEY;
import static com.example.latihanku_act.modul.Constant.PASSWORD_KEY;
import static com.example.latihanku_act.modul.Constant.PREFERENCE_KEY;

/**
 * Created by fahrul on 13/03/19.
 */

public class ProfilePresenter implements ProfileContract.Presenter{
    private final ProfileContract.View view;
    private final SharedPreferences sharedPreferences;
    private final Context context;

    public ProfilePresenter(ProfileContract.View view, Context context) {
        this.view = view;
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public void start() {
        getProfile();
    }


    @Override
    public void getProfile() {
        String email = this.sharedPreferences.getString(EMAIL_KEY, context.getResources().getString(R.string.default_value));
        String password = this.sharedPreferences.getString(PASSWORD_KEY, context.getResources().getString(R.string.default_value));

        view.updateProfile(email, password);
    }
}
