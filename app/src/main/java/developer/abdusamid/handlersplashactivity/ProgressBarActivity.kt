package developer.abdusamid.handlersplashactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import developer.abdusamid.handlersplashactivity.databinding.ActivityProgressBarBinding

class ProgressBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProgressBarBinding
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgressBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, 1000)
    }

    private val runnable = object : Runnable {
        override fun run() {
            binding.progressbar.progress = binding.progressbar.progress + 2
            handler.postDelayed(this, 1000)
        }
    }
}