def call(String projname, image){
    echo 'This is Building'
    sh "docker build -t ${projname} ${image}"        
    echo 'Build successfull'
}
