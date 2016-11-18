package com.example.johan.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;


public class AboutDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("Tentang");
        theDialog.setMessage("To Do List \nJohan Poernomo \n16516045");
        theDialog.setPositiveButton("OK", null);

        /*return super.onCreateDialog(savedInstanceState);*/
        return theDialog.create();
    }
}
