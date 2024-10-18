package dam.pmdm.videoclase2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import dam.pmdm.videoclase2.databinding.GameDetailBinding;

public class GameDetailActivity extends AppCompatActivity {

   private GameDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_detail); // Establece el layout de la actividad

        binding = GameDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener datos del Intent que inicia esta actividad
        Intent intent = getIntent();
        if (intent != null) {
            String image = intent.getStringExtra("image");
            String name = intent.getStringExtra("name");
            String releaseYear = intent.getStringExtra("releaseYear");
            String description = intent.getStringExtra("description");
            String platforms = intent.getStringExtra("platforms");

            // Asignar los datos a los componentes
            binding.name.setText(name);
            binding.releaseYear.setText(releaseYear);
            binding.description.setText(description);
            binding.platforms.setText(platforms);

            // Cargar la imagen desde la URL
            loadImageFromUrl(image); // Implementa este método para cargar la imagen
        }
    }

    private void loadImageFromUrl(String imageUrl) {
        // Puedes implementar la lógica para cargar una imagen desde una URL
        // Aquí podrías usar una biblioteca de carga de imágenes o usar un método que cargue la imagen
        // Asegúrate de manejar esto en un hilo separado o usar AsyncTask si no quieres bloquear el hilo principal
    }
}

