package com.strongties.sanjeevan;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class selectStateFragment extends Fragment {
    Button state1, state2, state3, state4, state5, state6, state7, state8, state9, state10, state11, state12, state13, state14, state15, state16, state17, state18, state19, state20;
    Button state21, state22, state23, state24, state25, state26, state27, state28, ut1, ut2, ut3, ut4, ut5, ut6, ut7, ut8;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_select_state, container, false);

        state1 = root.findViewById(R.id.state1);
        state2 = root.findViewById(R.id.state2);
        state3 = root.findViewById(R.id.state3);
        state4 = root.findViewById(R.id.state4);
        state5 = root.findViewById(R.id.state5);
        state6 = root.findViewById(R.id.state6);
        state7 = root.findViewById(R.id.state7);
        state8 = root.findViewById(R.id.state8);
        state9 = root.findViewById(R.id.state9);
        state10 = root.findViewById(R.id.state10);
        state11 = root.findViewById(R.id.state11);
        state12 = root.findViewById(R.id.state12);
        state13 = root.findViewById(R.id.state13);
        state14 = root.findViewById(R.id.state14);
        state15 = root.findViewById(R.id.state15);
        state16 = root.findViewById(R.id.state16);
        state17 = root.findViewById(R.id.state17);
        state18 = root.findViewById(R.id.state18);
        state19 = root.findViewById(R.id.state19);
        state20 = root.findViewById(R.id.state20);
        state21 = root.findViewById(R.id.state21);
        state22 = root.findViewById(R.id.state22);
        state23 = root.findViewById(R.id.state23);
        state24 = root.findViewById(R.id.state24);
        state25 = root.findViewById(R.id.state25);
        state26 = root.findViewById(R.id.state26);
        state27 = root.findViewById(R.id.state27);
        state28 = root.findViewById(R.id.state28);
        ut1 = root.findViewById(R.id.ut1);
        ut2 = root.findViewById(R.id.ut2);
        ut3 = root.findViewById(R.id.ut3);
        ut4 = root.findViewById(R.id.ut4);
        ut5 = root.findViewById(R.id.ut5);
        ut6 = root.findViewById(R.id.ut6);
        ut7 = root.findViewById(R.id.ut7);
        ut8 = root.findViewById(R.id.ut8);

        final SharedPreferences prefs = getContext().getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();
        final Bundle args = new Bundle();

        state1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate1));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate1));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate",getString(R.string.urlstate2));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate2));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate3));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate3));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate4));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate4));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate5));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate5));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate6));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate6));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate7));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate7));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate8));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate8));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate9));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate9));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate10));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate10));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate11));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate11));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate12));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate12));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate13));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate13));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate14));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate14));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate15));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate15));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate16));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate16));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate17));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate17));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate18));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate18));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate19));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate19));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate20));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate20));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate21));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate21));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate22));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate22));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate23));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate23));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate",getString(R.string.urlstate24));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate24));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate25));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate25));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate26));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate26));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate27));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate27));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        state28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlstate28));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlstate28));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut1));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut1));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut2));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut2));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut3));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut3));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut4));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut4));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut5));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut5));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut6));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut6));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut7));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut7));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });

        ut8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("homestate", getString(R.string.urlut8));
                editor.apply();
                mohfwStateFragment stateFragment = new mohfwStateFragment();
                args.putString("url", getString(R.string.urlut8));
                stateFragment.setArguments(args);
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                        stateFragment).commit();
            }
        });






        return root;
    }
}
