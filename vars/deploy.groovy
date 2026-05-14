def call(){
   sh 'docker compose down'

    sh 'docker compose pull'

    sh 'docker compose up --build -d'
}
