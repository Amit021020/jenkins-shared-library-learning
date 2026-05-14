def call() {

    withCredentials([
        string(credentialsId: 'jwt-secret', variable: 'JWT_SECRET'),
        string(credentialsId: 'mongo-uri', variable: 'MONGO_URI')
    ]) {

        sh """
            echo "Stopping old containers..."
            docker compose down -v

            echo "Building image..."
            docker compose build

            echo "Starting containers with injected secrets..."
            JWT_SECRET=${JWT_SECRET} MONGO_URI=${MONGO_URI} docker compose up -d

            echo "Checking running containers..."
            docker ps
        """
    }
}
