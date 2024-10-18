package dam.pmdm.videoclase2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import dam.pmdm.videoclase2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<GameData> games = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addElementosToArray();

        binding.gamesRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.gamesRecyclerview.setAdapter(new GameRecyclerViewAdapter(games, this));

    }

    public void addElementosToArray(){
        games = new ArrayList<GameData>();
        // Llenar la lista con datos de videojuegos
        games.add(new GameData(
                "", // Reemplaza con la ruta de la imagen
                "Super Mario Bros. Wonder",
                2023,
                "Un juego de plataformas en un mundo vibrante lleno de sorpresas.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_mario_kart_8_deluxe", // Reemplaza con la ruta de la imagen
                "Mario Kart 8 Deluxe",
                2017,
                "Una versión mejorada de Mario Kart 8 con un modo de batalla renovado.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_super_mario_3d_world", // Reemplaza con la ruta de la imagen
                "Super Mario 3D World + Bowser's Fury",
                2021,
                "Aventura cooperativa en 3D con una misión en el mundo abierto de Bowser's Fury.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_super_mario_maker_2", // Reemplaza con la ruta de la imagen
                "Super Mario Maker 2",
                2019,
                "Diseña y comparte tus propios niveles de Mario en esta secuela.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_super_mario_odyssey", // Reemplaza con la ruta de la imagen
                "Super Mario Odyssey",
                2017,
                "Mario debe rescatar a la Princesa Peach utilizando su compañero, Cappy.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_super_mario_all_stars", // Reemplaza con la ruta de la imagen
                "Super Mario All-Stars",
                2021,
                "Colección remasterizada de los clásicos juegos de Mario.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_super_mario_party", // Reemplaza con la ruta de la imagen
                "Super Mario Party",
                2018,
                "Un juego de fiesta con tableros virtuales y mini-juegos.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_mario_golf_super_rush", // Reemplaza con la ruta de la imagen
                "Mario Golf: Super Rush",
                2021,
                "Un enfoque divertido del golf con personajes de Mario.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_paper_mario_origami_king", // Reemplaza con la ruta de la imagen
                "Paper Mario: The Origami King",
                2020,
                "Mario debe detener al Rey Origami en esta aventura de rol.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "image_path_mario_rabbids_sparks_of_hope", // Reemplaza con la ruta de la imagen
                "Mario + Rabbids Sparks of Hope",
                2022,
                "Mario y los Rabbids deben salvar a los Sparks en esta aventura.",
                "Nintendo Switch"
        ));
    }

    public void gameClicked(GameData game) {
        Intent intent = new Intent(this, GameDetailActivity.class);
        intent.putExtra("name", game.getName()); // Pasa el nombre del juego
        intent.putExtra("releaseYear", String.valueOf(game.getReleaseYear()));
        intent.putExtra("platforms", String.valueOf(game.getPlatforms()));
        intent.putExtra("image", game.getImage()); // Pasa el nombre del juego
        intent.putExtra("description", game.getDescription()); // Pasa la descripción o más datos que necesites
        startActivity(intent);
    }

}