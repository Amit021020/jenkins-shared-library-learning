def call(String imagename, String buildContext){
    echo 'This is Building'
    sh "docker build -t ${projname} ${image}"        
    echo 'Build successfull'
}
