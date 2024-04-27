package kz.sd.shop.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kz.sd.shop.R;

public class RegisterFragmentDirections {
  private RegisterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRegisterFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_registerFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionRegisterFragmentToUserDetailsFragment() {
    return new ActionOnlyNavDirections(R.id.action_registerFragment_to_userDetailsFragment);
  }
}
