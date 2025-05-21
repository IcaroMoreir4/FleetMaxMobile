class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        findViewById<TextView>(R.id.txtVoltarLogin).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
