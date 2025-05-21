class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<TextView>(R.id.txtJaTemConta).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
