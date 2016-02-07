package ir.farhadfaghihi.juicyinsta.activity.authentication.model;

import android.net.Uri;
import android.text.TextUtils;

import ir.farhadfaghihi.juicyinsta.utils.setting.AppSetting;
import ir.farhadfaghihi.juicyinsta.utils.network.URLUtils;
import ir.farhadfaghihi.juicyinsta.utils.setting.ConstSetting;

/**
 * Created by Farhad on 2/5/2016.
 */
public class AuthInteractor implements IAuthInteractor
{

    @Override
    public String getInstagramAuthUrl()
    {
        return URLUtils.getInstagramAuthUrl() ;
    }

    @Override
    public void checkAuthCallback(Uri uriCallback, OnAuthListener onAuthListener)
    {
        String token = URLUtils.extractAccessToken(uriCallback);

        if(!TextUtils.isEmpty(token))
        {
            AppSetting.getInstance().setValue(ConstSetting.AUTH_STATUS, true);
            AppSetting.getInstance().setValue(ConstSetting.ACCESS_TOEKN,token);

            onAuthListener.onUserAllowAuth();
        }

        else
            onAuthListener.onUserDenyAuth();
    }
}
