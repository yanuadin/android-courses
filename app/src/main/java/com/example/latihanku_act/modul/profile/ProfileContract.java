package com.example.latihanku_act.modul.profile;

import com.example.latihanku_act.base.BasePresenter;
import com.example.latihanku_act.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void goBackToLogin();

        void updateProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void getProfile();
    }
}
