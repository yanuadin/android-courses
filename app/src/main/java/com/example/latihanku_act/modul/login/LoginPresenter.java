package com.example.latihanku_act.modul.login;

import android.content.Context;
import android.content.SharedPreferences;

import static com.example.latihanku_act.modul.Constant.EMAIL_KEY;
import static com.example.latihanku_act.modul.Constant.PASSWORD_KEY;
import static com.example.latihanku_act.modul.Constant.PREFERENCE_KEY;

/**
 * Created by fahrul on 13/03/19.
 */

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;
    private final SharedPreferences sharedPreferences;

    public LoginPresenter(LoginContract.View view, Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE_KEY, Context.MODE_PRIVATE);
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        saveUser(email, password);
        view.redirectToProfile();
    }

    private void saveUser(String email, String password) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(EMAIL_KEY, email);
        editor.putString(PASSWORD_KEY, password);
        editor.commit();
    }
}
