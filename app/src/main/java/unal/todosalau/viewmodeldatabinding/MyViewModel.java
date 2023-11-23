package unal.todosalau.viewmodeldatabinding;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    // Campo Observable que almacena el mensaje
    public ObservableField<String> message = new ObservableField<>("Hello");

    // Método para actualizar el mensaje
    public void updateMessage() {
        message.set("Hello, Data Binding!");
    }
}
