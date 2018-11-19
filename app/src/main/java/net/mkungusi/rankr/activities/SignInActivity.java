package net.mkungusi.rankr.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import net.mkungusi.rankr.R;
import net.mkungusi.rankr.fragments.SignInLeagueNameFragment;
import net.mkungusi.rankr.utils.Constants;

public class SignInActivity extends AppCompatActivity {

    public static String mEmail;
    public static String mLeagueName;
    public static String mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_up);

        if(savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager()
                    .beginTransaction();

            Bundle bundle1 = new Bundle();
            Fragment fragment = new SignInLeagueNameFragment();

            bundle1.putString(Constants.SIGN_IN_INTENT, Constants.SIGNIN_FRAGMENT);
            fragment.setArguments(bundle1);

            transaction.replace(R.id.root_frame, fragment);
            transaction.commit();
        }
    }
}