package mx.edu.utez.conversor.contadorvm.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {

    var conteo by mutableStateOf (0)

    fun incrementar() {
        conteo++
    }

    fun decrementar() {
        if (conteo > 0) {
            conteo--
        }
    }


}