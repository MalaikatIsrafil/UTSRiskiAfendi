

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.riskiafendi.volumedanluas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    // Inisialisasi View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menggunakan View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol untuk menghitung volume
        binding.btnHitungVolume.setOnClickListener {
            val sisi = binding.etSisi.text.toString().toDoubleOrNull()
            if (sisi != null) {
                val volume = hitungVolumeKubus(sisi)
                binding.tvHasil.text = "Volume Kubus: $volume"
            } else {
                Toast.makeText(this, "Masukkan panjang sisi yang valid!", Toast.LENGTH_SHORT).show()
            }
        }

        // Tombol untuk menghitung luas permukaan
        binding.btnHitungLuas.setOnClickListener {
            val sisi = binding.etSisi.text.toString().toDoubleOrNull()
            if (sisi != null) {
                val luas = hitungLuasPermukaanKubus(sisi)
                binding.tvHasil.text = "Luas Permukaan Kubus: $luas"
            } else {
                Toast.makeText(this, "Masukkan panjang sisi yang valid!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Fungsi untuk menghitung volume kubus
    private fun hitungVolumeKubus(sisi: Double): Double {
        return sisi * sisi * sisi
    }

    // Fungsi untuk menghitung luas permukaan kubus
    private fun hitungLuasPermukaanKubus(sisi: Double): Double {
        return 6 * (sisi * sisi)
    }
}
