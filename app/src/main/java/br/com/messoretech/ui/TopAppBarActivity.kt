package br.com.messoretech.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.R
import br.com.messoretech.databinding.ActivityTopAppBarBinding

class TopAppBarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTopAppBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.favorite -> {
                    Toast.makeText(this, "Clicou em Favorito", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Clicou em Pesquisar", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "Clicou em Mais", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
