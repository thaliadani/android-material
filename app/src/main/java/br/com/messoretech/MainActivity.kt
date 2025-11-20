package br.com.messoretech

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import br.com.messoretech.databinding.ActivityMainBinding
import br.com.messoretech.ui.BottomAppBarActivity
import br.com.messoretech.ui.BottomNavigationActivity
import br.com.messoretech.ui.BottomSheetFragment
import br.com.messoretech.ui.ButtonsActivity
import br.com.messoretech.ui.TextFieldsActivity
import br.com.messoretech.ui.TopAppBarActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var buttons: CardView
    lateinit var textFields: CardView
    lateinit var bottomSheet: CardView
    lateinit var topAppBar: CardView
    lateinit var bottomAppBar: CardView
    lateinit var snackbars: CardView
    lateinit var bottomNavigation: CardView

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupView()
        setupListeners()
    }

    fun setupView(){
        buttons = findViewById(R.id.cv_buttons)
        textFields = findViewById(R.id.cv_text_fields)
        bottomSheet = findViewById(R.id.cv_bottomSheet)
        topAppBar = findViewById(R.id.cv_top_app_bar)
        bottomAppBar = findViewById(R.id.cv_bottom_app_bar)
        snackbars = findViewById(R.id.cv_snackbars)
        bottomNavigation = findViewById(R.id.cv_bottom_navigation)
    }

    fun setupListeners(){
        buttons.setOnClickListener {
            // Cria um Intent para iniciar a ButtonsActivity
            val intent = Intent(this, ButtonsActivity::class.java)
            // Inicia a nova atividade
            startActivity(intent)
        }
        textFields.setOnClickListener {
            val intent = Intent(this, TextFieldsActivity::class.java)
            // Inicia a nova atividade
            startActivity(intent)
        }
        bottomSheet.setOnClickListener {
            // 1. Cria uma instância do seu BottomSheetFragment
            val meuBottomSheet = BottomSheetFragment()

            // 2. Mostra o BottomSheet usando o FragmentManager
            meuBottomSheet.show(supportFragmentManager, BottomSheetFragment.TAG)
        }

        topAppBar.setOnClickListener {
            val intent = Intent(this, TopAppBarActivity::class.java)
            // Inicia a nova atividade
            startActivity(intent)
        }
        bottomAppBar.setOnClickListener {
            val intent = Intent(this, BottomAppBarActivity::class.java)
            // Inicia a nova atividade
            startActivity(intent)
        }
        snackbars.setOnClickListener { view ->
            Snackbar.make(view, "Isto é uma Snackbar", Snackbar.LENGTH_SHORT)
                .setAction("Fechar") { }
                .setActionTextColor(getColor(R.color.teal_200))
                .setBackgroundTint(getColor(R.color.purple_500))
                .setTextColor(getColor(R.color.white))
                .show()
        }
        bottomNavigation.setOnClickListener {
            val intent = Intent(this, BottomNavigationActivity::class.java)
            // Inicia a nova atividade
            startActivity(intent)
        }

    }
}
