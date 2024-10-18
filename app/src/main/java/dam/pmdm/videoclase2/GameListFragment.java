package dam.pmdm.videoclase2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dam.pmdm.videoclase2.databinding.GameListBinding;

import java.util.ArrayList;

public class GameListFragment extends Fragment {

    private GameListBinding binding; // Binding para el layout
    private ArrayList<GameData> games; // Lista de juegos
    private GameRecyclerViewAdapter adapter; // Adaptador del RecyclerView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflar el layout utilizando el binding
        binding = GameListBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Inicializa la lista de juegos
        loadGames(); // Cargar los juegos (puedes implementar esta función para obtener datos)

        // Configurar el RecyclerView
        adapter = new GameRecyclerViewAdapter(games, getActivity());
        binding.gamesRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.gamesRecyclerview.setAdapter(adapter);


    }

    // Método para cargar juegos (puedes implementar tu lógica aquí)
    private void loadGames() {
        games = new ArrayList<GameData>();
        // Llenar la lista con datos de videojuegos
        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71uS8Ra1aGL._AC_UF894,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Bros. Wonder",
                2023,
                "Un juego de plataformas en un mundo vibrante lleno de sorpresas.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71C9pOGlKtL.jpg", // Reemplaza con la ruta de la imagen
                "Mario Kart 8 Deluxe",
                2017,
                "Una versión mejorada de Mario Kart 8 con un modo de batalla renovado.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81CbYA2Gt3L._AC_UF894,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario 3D World + Bowser's Fury",
                2021,
                "Aventura cooperativa en 3D con una misión en el mundo abierto de Bowser's Fury.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81d3KS1-6OL.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Maker 2",
                2019,
                "Diseña y comparte tus propios niveles de Mario en esta secuela.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81drkVN7GRL._AC_UF1000,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Odyssey",
                2017,
                "Mario debe rescatar a la Princesa Peach utilizando su compañero, Cappy.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/71FxEVBYddL._AC_UF1000,1000_QL80_.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario All-Stars",
                2021,
                "Colección remasterizada de los clásicos juegos de Mario.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81XdRd9UNZL.jpg", // Reemplaza con la ruta de la imagen
                "Super Mario Party",
                2018,
                "Un juego de fiesta con tableros virtuales y mini-juegos.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/91bAhoyCcUL.jpg", // Reemplaza con la ruta de la imagen
                "Mario Golf: Super Rush",
                2021,
                "Un enfoque divertido del golf con personajes de Mario.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://media.vandal.net/m/85340/paper-mario-the-origami-king-20205141527529_1.jpg", // Reemplaza con la ruta de la imagen
                "Paper Mario: The Origami King",
                2020,
                "Mario debe detener al Rey Origami en esta aventura de rol.",
                "Nintendo Switch"
        ));

        games.add(new GameData(
                "https://m.media-amazon.com/images/I/81zgWwSnVfL.jpg", // Reemplaza con la ruta de la imagen
                "Mario + Rabbids Sparks of Hope",
                2022,
                "Mario y los Rabbids deben salvar a los Sparks en esta aventura.",
                "Nintendo Switch"
        ));
    }


    @Override
    public void onStart() {
        super.onStart();
        // Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.lista_de_juegos);
        }
    }
}
