import android.content.Intent
import android.widget.TextView

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContentView(R.layout.activity_login)

    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets
    }

    val comeceAqui = findViewById<TextView>(R.id.textView8)
    comeceAqui.setOnClickListener {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}
