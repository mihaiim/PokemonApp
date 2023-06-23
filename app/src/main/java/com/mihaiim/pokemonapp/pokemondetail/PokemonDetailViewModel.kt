package com.mihaiim.pokemonapp.pokemondetail

import androidx.lifecycle.ViewModel
import com.mihaiim.pokemonapp.data.remote.responses.Pokemon
import com.mihaiim.pokemonapp.repository.PokemonRepository
import com.mihaiim.pokemonapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}