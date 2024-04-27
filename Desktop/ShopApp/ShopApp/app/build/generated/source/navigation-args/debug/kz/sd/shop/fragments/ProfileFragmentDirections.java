package kz.sd.shop.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kz.sd.shop.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_loginFragment);
  }
}
