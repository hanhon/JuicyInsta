package ir.farhadfaghihi.juicyinsta.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.farhadfaghihi.juicyinsta.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class AuthActivityFragment extends Fragment
{

    public AuthActivityFragment()
    {
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_auth, container, false);
    }
}