def call() {
    sh """
        set -e

        echo "Stopping old containers..."
        docker compose down -v

        echo "Building and starting services..."
        docker compose up --build -d

        echo "Checking running containers..."
        docker ps
    """
}
