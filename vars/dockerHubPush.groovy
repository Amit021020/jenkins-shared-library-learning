def call(String projName,String ImageTag){
  withCredentials([usernamePassword(credentialsId:'dockerHubCred',passwordVariable: "dockerHubPass",usernameVariable: "dockerHubUser")]){
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"                  
  }
  sh "docker push ${dockerHubUser}/${projName}:${ImageTag}"
}
