package com.strongties.sanjeevan;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class SymptomFragment extends Fragment {

    private AlertDialog.Builder builder;
    private RadioGroup Rsym_1;
    private RadioGroup Rsym_2;
    private RadioGroup Rsym_3;
    private RadioGroup Rsym_4;
    private RadioGroup Rsym_5;
    private RadioGroup Rsym_6;
    private RadioGroup Rsym_7;
    private RadioGroup Rsym_8;
    private RadioGroup Rsym_10;
    private RadioGroup Rsym_11;
    private RadioGroup Rsym_12;
    private RadioGroup Rsym_13;
    private RadioGroup Rsym_14;
    private RadioGroup Rsym_15;
    private RadioGroup Rsym_16;

    private EditText Sym_days;
    private EditText YearofBirth;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_symptom, container, false);

        Rsym_1 = root.findViewById(R.id.RG_symptom1);
        Rsym_2 = root.findViewById(R.id.RG_symptom2);
        Rsym_3 = root.findViewById(R.id.RG_symptom3);
        Rsym_4 = root.findViewById(R.id.RG_symptom4);
        Rsym_5 = root.findViewById(R.id.RG_symptom5);
        Rsym_6 = root.findViewById(R.id.RG_symptom6);
        Rsym_7 = root.findViewById(R.id.RG_symptom7);
        Rsym_8 = root.findViewById(R.id.RG_symptom8);
        Rsym_10 = root.findViewById(R.id.RG_symptom10);
        Rsym_11 = root.findViewById(R.id.RG_symptom11);
        Rsym_12 = root.findViewById(R.id.RG_symptom12);
        Rsym_13 = root.findViewById(R.id.RG_symptom13);
        Rsym_14 = root.findViewById(R.id.RG_symptom14);
        Rsym_15 = root.findViewById(R.id.RG_symptom15);
        Rsym_16 = root.findViewById(R.id.RG_symptom16);

        Sym_days = root.findViewById(R.id.symptomdays);
        YearofBirth = root.findViewById(R.id.yearofbirth);


        final Button check = root.findViewById(R.id.btn_symptom);

        builder = new AlertDialog.Builder(Objects.requireNonNull(getActivity()));
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage(getString(R.string.text_proceed))
                        .setCancelable(false)
                        .setPositiveButton(getString(R.string.text_confirm), new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Toast.makeText(getContext(), "Calculating. Please Wait.",
                                //      Toast.LENGTH_SHORT).show();
                                getResult();
                            }
                        })
                        .setNegativeButton(getString(R.string.text_no), new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(getContext(), getString(R.string.text_fillproper),
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle(getString(R.string.text_confirmation));
                alert.show();
            }

            // GetResult Starts

            private void getResult() {
                float finalValue1 = 0; // Used to get probability of covid
                float finalValue2 = 0;
                RadioButton sym_val;
                int selectedId;
                int severity = 1;
                String result = "low";

                double weight1 = 1, weight2 = 1, weight3 = 1, weight4 = 1, weight5 = 1, weight6 = 1, weight7 = 1, weight8 = 1;  // Weight associated with each Symptom
                double weight1_n = 1, weight2_n = 1, weight3_n = 1, weight4_n = 1, weight5_n = 1, weight6_n = 1, weight7_n = 1, weight8_n = 1;  // Weight associated with each Symptom negatively
                double weight9 = 1, weight10 = 1, weight11 = 1, weight12 = 1, weight13 = 1, weight14 = 1, weight15 = 1, weight16 = 1;
                double weight9_n = 1, weight10_n = 1, weight11_n = 1, weight12_n = 1, weight13_n = 1, weight14_n = 1, weight15_n = 1, weight16_n = 1;


                //Symptom 9 is textbox
                String temp = Sym_days.getText().toString();
                int days_show_symp = 0;
                if (TextUtils.isEmpty(temp)) {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom9) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    days_show_symp  = Integer.parseInt(temp);
                }

                //Symptom 9.1 (YEAR OF BIRTH) is textbox
                String temp2 = YearofBirth.getText().toString();
                int age = 0;
                if (TextUtils.isEmpty(temp2)) {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.text_yob) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    age = Integer.parseInt(temp2);
                }

                if(days_show_symp <= 4){
                    severity = 1;

                    weight1 = 10; weight2 = 10; weight3 = 10; weight4 = 8; weight5 = 1.5; weight6 = 1.5;  weight7 = 2; weight8 = 1.5;
                    weight1_n = 2.5; weight2_n = 2.5; weight3_n = 2.5; weight4_n = 2;weight5_n = 0; weight6_n = 0; weight7_n = 2; weight8_n = 0;

                    weight10 = 1; weight11 = 1; weight12 = 1; weight13 = 10; weight14 = 10; weight15 = 5; weight16 = 5;
                    weight10_n = 0; weight11_n = 0; weight12_n = 0; weight13_n = 0; weight14_n = 0; weight15_n = 0; weight16_n = 0;

                    if(age < 10){
                        finalValue1 += 0;
                    }else if(age >= 10 && age < 40){
                        finalValue1 += 2;
                    }else if(age >= 40 && age < 60){
                        finalValue1 += 4;
                    }else if(age >= 60 && age < 80){
                        finalValue1 += 5;
                    }else{
                        finalValue1 += 10;
                    }

                }else if(days_show_symp >= 4 && days_show_symp < 7){
                    severity = 2;

                    weight1 = 10; weight2 = 10; weight3 = 10; weight4 = 8; weight5 = 3; weight6 = 3;  weight7 = 5; weight8 = 3;
                    weight1_n = 4; weight2_n = 4; weight3_n = 4; weight4_n = 3; weight5_n = 0; weight6_n = 0; weight7_n = 5; weight8_n = 0;

                    weight10 = 3; weight11 = 3; weight12 = 3; weight13 = 10; weight14 = 10; weight15 = 5; weight16 = 5;
                    weight10_n = 0; weight11_n = 0; weight12_n = 0; weight13_n = 0; weight14_n = 0; weight15_n = 0; weight16_n = 0;

                    if(age < 10){
                        finalValue1 += 0;
                    }else if(age >= 10 && age < 40){
                        finalValue1 += 2;
                    }else if(age >= 40 && age < 60){
                        finalValue1 += 4;
                    }else if(age >= 60 && age < 80){
                        finalValue1 += 5;
                    }else{
                        finalValue1 += 10;
                    }

                }else if(days_show_symp >= 7 && days_show_symp < 10){
                    severity = 3;

                    weight1 = 10; weight2 = 10; weight3 = 10; weight4 = 10; weight5 = 4; weight6 = 4;  weight7 = 8; weight8 = 4;
                    weight1_n = 5; weight2_n = 5; weight3_n = 5; weight4_n = 3; weight5_n = 0; weight6_n = 0; weight7_n = 5; weight8_n = 0;

                    weight10 = 4; weight11 = 4; weight12 = 4; weight13 = 10; weight14 = 10; weight15 = 5; weight16 = 5;
                    weight10_n = 0; weight11_n = 0; weight12_n = 0; weight13_n = 0; weight14_n = 0; weight15_n = 0; weight16_n = 0;

                    if(age < 10){
                        finalValue1 += 0;
                    }else if(age >= 10 && age < 40){
                        finalValue1 += 2;
                    }else if(age >= 40 && age < 60){
                        finalValue1 += 4;
                    }else if(age >= 60 && age < 80){
                        finalValue1 += 5;
                    }else{
                        finalValue1 += 10;
                    }

                }else if(days_show_symp >= 10 && days_show_symp < 13){
                    severity = 4;

                    weight1 = 10; weight2 = 10; weight3 = 10; weight4 = 10; weight5 = 4; weight6 = 4;  weight7 = 8; weight8 = 4;
                    weight1_n = 5; weight2_n = 5; weight3_n = 5; weight4_n = 3; weight5_n = 0; weight6_n = 0; weight7_n = 5; weight8_n = 0;

                    weight10 = 4; weight11 = 4; weight12 = 4; weight13 = 10; weight14 = 10; weight15 = 5; weight16 = 5;
                    weight10_n = 0; weight11_n = 0; weight12_n = 0; weight13_n = 0; weight14_n = 0; weight15_n = 0; weight16_n = 0;

                    if(age < 10){
                        finalValue1 += 0;
                    }else if(age >= 10 && age < 40){
                        finalValue1 += 2;
                    }else if(age >= 40 && age < 60){
                        finalValue1 += 4;
                    }else if(age >= 60 && age < 80){
                        finalValue1 += 5;
                    }else{
                        finalValue1 += 10;
                    }

                }else if(days_show_symp >= 13){
                    severity = 5;

                    weight1 = 10; weight2 = 10; weight3 = 10; weight4 = 10; weight5 = 4; weight6 = 5;  weight7 = 10; weight8 = 5;
                    weight1_n = 5; weight2_n = 5; weight3_n = 5; weight4_n = 5; weight5_n = 0; weight6_n = 0; weight7_n = 7; weight8_n = 0;

                    weight10 = 5; weight11 = 5; weight12 = 5; weight13 = 10; weight14 = 10; weight15 = 5; weight16 = 5;
                    weight10_n = 0; weight11_n = 0; weight12_n = 0; weight13_n = 0; weight14_n = 0; weight15_n = 0; weight16_n = 0;

                    if(age < 10){
                        finalValue1 += 0;
                    }else if(age >= 10 && age < 40){
                        finalValue1 += 2;
                    }else if(age >= 40 && age < 60){
                        finalValue1 += 4;
                    }else if(age >= 60 && age < 80){
                        finalValue1 += 5;
                    }else{
                        finalValue1 += 10;
                    }

                }

                //For Symptom 1
                // getCheckedRadioButtonId() returns -1 if no radio is selected
                if (Rsym_1.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_1.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight1;
                    } else {
                        finalValue1 -= weight1_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom1) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 2
                if (Rsym_2.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_2.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight2;
                    } else {
                        finalValue1 -= weight2_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom2) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 3
                if (Rsym_3.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_3.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight3;
                    } else {
                        finalValue1 -= weight3_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom3) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 4
                if (Rsym_4.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_4.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight4;
                    } else {
                        finalValue1 -= weight4_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom4) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 5
                if (Rsym_5.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_5.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight5;
                    } else {
                        finalValue1 -= weight5_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom5) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 6
                if (Rsym_6.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_6.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight6;
                    } else {
                        finalValue1 -= weight6_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom6) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 7
                if (Rsym_7.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_7.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight7;
                    } else {
                        finalValue1 -= weight7_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom7) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 8
                if (Rsym_8.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_8.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight8;
                    } else {
                        finalValue1 -= weight8_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom8) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }



                //For Symptom 10
                if (Rsym_10.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_10.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight10;
                    } else {
                        finalValue1 -= weight10_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom10) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 11
                if (Rsym_11.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_11.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight11;
                    } else {
                        finalValue1 -= weight11_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom11) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                //For Symptom 12
                if (Rsym_12.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_12.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue1 += weight12;
                    } else {
                        finalValue1 -= weight12_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom12) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                //For Symptom 13
                if (Rsym_13.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_13.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue2 += weight13;
                    } else {
                        finalValue2 -= weight13_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom13) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                //For Symptom 14
                if (Rsym_14.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_14.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue2 += weight14;
                    } else {
                        finalValue2-= weight14_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom14) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                //For Symptom 15
                if (Rsym_15.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_15.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue2 += weight15;
                    } else {
                        finalValue2 -= weight15_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom15) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                //For Symptom 16
                if (Rsym_16.getCheckedRadioButtonId() != -1) {
                    selectedId = Rsym_16.getCheckedRadioButtonId();
                    sym_val = root.findViewById(selectedId);
                    if (sym_val.getText() == getString(R.string.text_yes)) {
                        finalValue2 += weight16;
                    } else {
                        finalValue2 -= weight16_n;
                    }
                } else {
                    Toast.makeText(getContext(), getString(R.string.text_fill) + " - " + getString(R.string.symptom16) + " " + getString(R.string.text_section),
                            Toast.LENGTH_SHORT).show();
                    return;
                }



                // Calculation

                switch (severity){
                    case 1:
                        if(finalValue1 >= 40){
                            result = "high";
                        }else if(finalValue1 >= 30 && finalValue1 < 40){
                            result = "moderate";
                        }else{
                            result = "low";
                        }

                        if(result == "moderate" && finalValue2 > 15){
                            result = "high";
                        }
                        if(result == "low" && finalValue2 > 15){
                            result = "moderate";
                        }
                        break;
                    case 2:
                        if(finalValue1 >= 40){
                            result = "high";
                        }else if(finalValue1 >= 30 && finalValue1 < 40){
                            result = "moderate";
                        }else{
                            result = "low";
                        }

                        if(result == "moderate" && finalValue2 > 15){
                            result = "high";
                        }
                        break;
                    case 3:
                        if(finalValue1 >= 40){
                            result = "high";
                        }else if(finalValue1 >= 25 && finalValue1 < 40){
                            result = "moderate";
                        }else{
                            result = "low";
                        }

                        if(result == "moderate" && finalValue2 > 15){
                            result = "high";
                        }
                        break;
                    case 4:
                        if(finalValue1 >= 39){
                            result = "high";
                        }else if(finalValue1 >= 25 && finalValue1 < 39){
                            result = "moderate";
                        }else{
                            result = "low";
                        }

                        if(result == "moderate" && finalValue2 > 15){
                            result = "high";
                        }
                        break;
                    case 5:
                        if(finalValue1 >= 35){
                            result = "high";
                        }else if(finalValue1 >= 20 && finalValue1 < 35){
                            result = "moderate";
                        }else{
                            result = "low";
                        }

                        if(result == "moderate" && finalValue2 > 15){
                            result = "high";
                        }
                        break;
                }


                if (result == "high"){
                    Toast.makeText(getContext(), Float.toString(finalValue1),
                            Toast.LENGTH_SHORT).show();
                    Toast.makeText(getContext(), Float.toString(finalValue2),
                            Toast.LENGTH_SHORT).show();
                    Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                            new covidHighFragment()).commit();
                }else if (result == "moderate"){
                    Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                            new covidModerateFragment()).commit();
                }else{
                    Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_left).replace(R.id.fragment_container,
                            new covidLowFragment()).commit();
                }

            }

            // GetResult Ends

        });


        return root;
    }

}
