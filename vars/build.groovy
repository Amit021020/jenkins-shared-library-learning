def call(String imageName, String imageContext){

  if (!imageContext?.trim()) {
    error "Docker build context is empty"
  }

  sh """
    echo "Building Docker image: ${imageName}"
    docker build -t ${imageName} ${imageContext}
  """
}
