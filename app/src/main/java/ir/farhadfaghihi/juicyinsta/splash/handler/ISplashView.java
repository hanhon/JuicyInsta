package ir.farhadfaghihi.juicyinsta.splash.handler;

/**
 * Created by Farhad on 2/4/2016.
 */
public interface ISplashView
{
    void startLoadAnimation() ;

    void stopLoadAnimation();

    void navigateToAuthentication();

    void navigateToUserProfile();
}