package dam.pmdm.videoclase2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import dam.pmdm.videoclase2.databinding.GameCardviewBinding;

public class GameRecyclerViewAdapter extends RecyclerView.Adapter<GameViewHolder> {

    private final ArrayList<GameData> games;
    private final Context context;

    public GameRecyclerViewAdapter (ArrayList<GameData> games, Context context){
        this.games = games;
        this.context = context;
    }

    // Método que crea el ViewHolder
    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        GameCardviewBinding binding = GameCardviewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent,false
        );
        return new GameViewHolder(binding);
    }

//    Método para enlazar datos con ek ViewHolder
    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        GameData currentGame = this.games.get(position);
        holder.bind(currentGame);

//        Manejar el evento de clic
        holder.itemView.setOnClickListener(view -> itemClicked(currentGame));
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    private void itemClicked(GameData currentGame) {
        ((MainActivity) context).gameClicked(currentGame);
    }
}

