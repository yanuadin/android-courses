package com.example.latihanku_act.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.latihanku_act.R;
import com.example.latihanku_act.base.BaseFragment;
import com.example.latihanku_act.modul.login.LoginActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {
    private TextView tvEmail;
    private TextView tvPassword;
    private ProfileContract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        presenter = new ProfilePresenter(this, requireContext());

        tvEmail = fragmentView.findViewById(R.id.tv_email);
        tvPassword = fragmentView.findViewById(R.id.tv_password);

        setTitle(getResources().getString(R.string.profile_title));
        presenter.start();

        return fragmentView;
    }

    @Override
    public void goBackToLogin() {
        Intent intent = new Intent(activity, LoginActivity.class);
        startActivity(intent);
        activity.finish();
    }

    @Override
    public void updateProfile(String email, String password) {
        tvEmail.setText(email);
        tvPassword.setText(password);
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        this.presenter= presenter;
    }
}
