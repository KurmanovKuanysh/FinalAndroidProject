package kz.sd.shop.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kz.sd.shop.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToRegisterFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHome() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_home);
  }
}
