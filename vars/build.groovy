def call(String imagename, String buildContext){
    echo 'This is Building'
    sh "docker build -t ${imagename} ${buildContext}"        
    echo 'Build successfull'
}
