def call(String imageName, String imageContext){
  sh "docker build -t ${imageName} ${imageContext}"
}
