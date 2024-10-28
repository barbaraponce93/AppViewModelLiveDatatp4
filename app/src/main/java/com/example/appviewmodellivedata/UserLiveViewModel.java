package com.example.appviewmodellivedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class UserLiveViewModel extends ViewModel {
    private MutableLiveData<List <Usuario>> listarUsuariosLiveData;
    private List<Usuario> listaUsuario;

    public LiveData<List<Usuario>> getUserList(){
        if(listarUsuariosLiveData==null){
            listarUsuariosLiveData=new MutableLiveData<>();
            listaUsuario=new ArrayList<>();

        }
        return listarUsuariosLiveData;
    }

    public void addUser (Usuario usuario){
        listaUsuario.add(usuario);
        listarUsuariosLiveData.setValue(listaUsuario);
    }



}
