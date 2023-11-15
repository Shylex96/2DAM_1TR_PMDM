package es.studium.midialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class DialogoNuevo extends DialogFragment {

    OnNuevoDialogoListener mListener;
    EditText nombre;
    EditText descripcion;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View myView = inflater.inflate(R.layout.dialogo_nuevo, null);
        nombre = myView.findViewById(R.id.editTextTextPersonName);
        descripcion = myView.findViewById(R.id.editTextTextPersonName2);
        //builder.setView(inflater.inflate(R.layout.dialogo_nuevo, null));


        builder.setView(myView)

                .setTitle("Nuevo Diálogo")
                .setPositiveButton("Guardar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            mListener.onDateSet(nombre.getText().toString(), descripcion.getText().toString());
                        } catch (Exception e) {
                            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                        dialog.dismiss();
                        mListener.onDialogoGuardarListener();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Toast.makeText(getActivity(), "Cancelado", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                        mListener.onDialogoCancelarListener();
                    }
                });
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnNuevoDialogoListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " debe implementar OnNuevoDialogoListener");
        }
    }
}
