package dam.pmdm.videoclase2;

import androidx.recyclerview.widget.RecyclerView;
import dam.pmdm.videoclase2.databinding.GameCardviewBinding;

public class GameViewHolder extends RecyclerView.ViewHolder {

    private final GameCardviewBinding binding;

    public GameViewHolder(GameCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind (GameData game){
        binding.name.setText(game.getName());
        binding.releaseYear.setText(String.valueOf(game.getReleaseYear()));
        binding.executePendingBindings(); // Asegura que se apliquen los cambios de inmediato
    }
}

