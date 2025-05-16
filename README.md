# 🚛 FleetMax - Android App

Aplicativo Android desenvolvido como parte de um projeto em grupo. O **FleetMax** é um app voltado à gestão de frotas, com foco em facilitar a visualização de caminhões, motoristas, rotas e relatórios diretamente pelo celular.

## 📌 Objetivo do Projeto

Criar um app funcional e intuitivo para gerenciamento de frotas, inicialmente com **telas estáticas** para simular o fluxo de navegação. O desenvolvimento começou no Android Studio da faculdade e posteriormente foi exportado e adicionado ao GitHub para facilitar a colaboração entre os membros do grupo.

## 📂 Estrutura do Projeto

```
FleetMaxAndroidApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/fleetmax_androidapp/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── Login.kt
│   │   │   │   ├── Dashboard.kt
│   │   │   │   ├── Caminhoes.kt
│   │   │   │   ├── DetalhesDaRota.kt
│   │   │   │   ├── DetalhesDoMotorista.kt
│   │   │   │   ├── DetalhesRelatorio.kt
│   │   │   │   ├── LandingPage.kt
│   │   │   │   └── error404.kt
│   │   │   └── AndroidManifest.xml
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

## 📱 Telas Criadas

As telas foram implementadas em Kotlin, e atualmente são **estáticas**, servindo como protótipos para o fluxo do app:

* `LandingPage.kt` – Tela inicial
* `Login.kt` – Tela de login
* `Dashboard.kt` – Tela principal do sistema
* `Caminhoes.kt` – Lista de caminhões
* `DetalhesDaRota.kt`, `DetalhesDoMotorista.kt`, `DetalhesRelatorio.kt` – Detalhamento de informações
* `error404.kt` – Tela de erro

## 🛠 Como Rodar o Projeto

1. Abra o Android Studio.
2. Faça o clone do repositório ou importe o ZIP.
3. Sincronize o projeto com o Gradle.
4. Conecte um emulador ou dispositivo Android.
5. Execute o app a partir da `MainActivity`.

## 📌 Notas Importantes

* O projeto ainda não possui backend ou banco de dados integrado.
* Todas as informações são apenas visuais para simulação da interface.
* A navegação entre telas já está parcialmente implementada.

## 🔄 Futuras Etapas

* Integração com banco de dados (Firebase, SQLite, etc.).
* Criação de sistema de autenticação funcional.
* Adição de lógica de negócios para controle de frota em tempo real.

## 📥 Contribuindo

1. Faça um fork do repositório
2. Crie uma branch: `git checkout -b nova-funcionalidade`
3. Commit suas alterações: `git commit -m 'feat: nova funcionalidade'`
4. Push para sua branch: `git push origin nova-funcionalidade`
5. Abra um Pull Request
