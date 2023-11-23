package unal.todosalau.viewmodeldatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import unal.todosalau.viewmodeldatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private  MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflar el diseño y obtener una referencia al enlace de datos
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Obtener una instancia del ViewModel
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        // Establecer el ViewModel en el enlace de datos
        binding.setViewModel(viewModel);

        // Establecer el ciclo de vida propietario para el enlace de datos
        binding.setLifecycleOwner(this);
    }
}