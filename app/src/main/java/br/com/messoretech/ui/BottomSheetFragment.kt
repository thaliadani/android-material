package br.com.messoretech.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.messoretech.databinding.FragmentMeuBottomSheetBinding // Importe o ViewBinding gerado
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {

    // Usando ViewBinding para segurança e facilidade
    private var _binding: FragmentMeuBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Infla o layout usando ViewBinding
        _binding = FragmentMeuBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Exemplo: Adicionando lógica a um botão dentro do BottomSheet
        binding.btnClose.setOnClickListener {
            // Fecha o BottomSheet
            dismiss()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Limpa a referência ao binding para evitar memory leaks
        _binding = null
    }

    companion object {
        // Tag para usar ao mostrar o fragment
        const val TAG = "MeuBottomSheetFragment"
    }
}
