def call(String projName, String imageTag){

  withCredentials([usernamePassword(
    credentialsId: 'dockerHubCred',
    passwordVariable: 'dockerHubPass',
    usernameVariable: 'dockerHubUser'
  )]){

    sh """
      echo "${dockerHubPass}" | docker login -u "${dockerHubUser}" --password-stdin
    """
      
    sh """
      docker tag ${projName}:${imageTag} ${dockerHubUser}/${projName}:${imageTag}
    """

    sh """
      docker push ${dockerHubUser}/${projName}:${imageTag}
    """
  }
}
