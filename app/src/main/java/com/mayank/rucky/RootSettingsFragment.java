package com.mayank.rucky;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;

public class RootSettingsFragment extends PreferenceFragmentCompat {

    private static final String PREF_SETTINGS = "settings";
    private static final String PREF_SETTINGS_DARK_THEME = "darkTheme";
    private static final String PREF_SETTINGS_LAUNCH_ICON = "launchIcon";
    private static double currentVersion;
    private static String webViewID = "WEBVIEW_URL";
    private static String activityTitle = "WEBVIEW_TITLE";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

        final SharedPreferences settings = Objects.requireNonNull(this.getActivity()).getSharedPreferences(PREF_SETTINGS,MODE_PRIVATE);
        setPreferencesFromResource(R.xml.settings, rootKey);
        final SwitchPreferenceCompat darkThemeSwitch = findPreference("theme");
        assert darkThemeSwitch != null;
        darkThemeSwitch.setOnPreferenceChangeListener((preference, newValue) -> {
            boolean switched = !((SwitchPreferenceCompat) preference).isChecked();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean(PREF_SETTINGS_DARK_THEME,switched).apply();
            if(!SettingsActivity.launchIcon) {
                if(switched) {
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Light"),
                            PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Dark"),
                            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                } else {
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Dark"),
                            PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Light"),
                            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                }
            }
            MainActivity.didThemeChange = true;
            getActivity().finish();
            startActivity(getActivity().getIntent());
            return true;
        });

        final SwitchPreferenceCompat launchIconSwitch = findPreference("icon");
        assert launchIconSwitch != null;
        launchIconSwitch.setOnPreferenceChangeListener(((preference, newValue) -> {
            boolean switched = !((SwitchPreferenceCompat) preference).isChecked();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean(PREF_SETTINGS_LAUNCH_ICON,switched).apply();
            if(SettingsActivity.darkTheme) {
                if(switched) {
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Dark"),
                            PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                } else {
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Dark"),
                            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                }
            } else {
                if(switched) {
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Light"),
                            PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                } else {
                    getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName("com.mayank.rucky","com.mayank.rucky.Light"),
                            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                }
            }
            getActivity().finish();
            startActivity(getActivity().getIntent());
            return true;
        }));

        Preference developerPreference = findPreference("developer");
        assert developerPreference != null;
        developerPreference.setOnPreferenceClickListener(preference -> {
            Intent intent = new Intent(getActivity(), BrowserActivity.class);
            intent.putExtra(activityTitle, "Developer");
            intent.putExtra(webViewID, "http://mayankmetha.github.io");
            startActivity(intent);
            return true;
        });

        Preference versionPreference = findPreference("version");
        assert versionPreference != null;
        try {
            PackageInfo pInfo = Objects.requireNonNull(this.getActivity()).getPackageManager().getPackageInfo(Objects.requireNonNull(this.getActivity()).getPackageName(), 0);
            currentVersion = Double.parseDouble(pInfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        versionPreference.setSummary(Double.toString(currentVersion));

        String currentArch = Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP?Build.SUPPORTED_ABIS[0]:Build.CPU_ABI;
        Preference archPreference = findPreference("arch");
        assert archPreference != null;
        archPreference.setSummary(currentArch);

        Preference distributionPreference = findPreference("source");
        assert distributionPreference != null;
        distributionPreference.setSummary(MainActivity.distro);
        if(MainActivity.distro == R.string.releaseGitHub || MainActivity.distro == R.string.releaseTest) {
            distributionPreference.setOnPreferenceClickListener(preference -> {
                Intent intent = new Intent(getActivity(), BrowserActivity.class);
                intent.putExtra(activityTitle, "GitHub Release");
                intent.putExtra(webViewID, "https://github.com/mayankmetha/Rucky/releases/latest");
                startActivity(intent);
                return true;
            });
        }

        Preference licencePreference = findPreference("lic");
        assert licencePreference != null;
        licencePreference.setOnPreferenceClickListener(preference -> {
            Intent intent = new Intent(getActivity(), BrowserActivity.class);
            intent.putExtra(activityTitle, "License");
            intent.putExtra(webViewID, "https://raw.githubusercontent.com/mayankmetha/Rucky/master/LICENSE");
            startActivity(intent);
            return true;
        });

        Preference localePreference = findPreference("locale");
        assert localePreference != null;
        localePreference.setOnPreferenceClickListener(preference -> {
            Intent intent = new Intent(getActivity(), BrowserActivity.class);
            intent.putExtra(activityTitle, "Localization");
            intent.putExtra(webViewID, "https://mayankmetha.github.io/Rucky/");
            startActivity(intent);
            return true;
        });

    }
}
