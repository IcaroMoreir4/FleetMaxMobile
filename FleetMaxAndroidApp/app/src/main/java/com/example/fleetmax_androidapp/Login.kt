class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextView>(R.id.txtEsqueciSenha).setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        findViewById<TextView>(R.id.txtNovo).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
