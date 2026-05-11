def call(String projname, String image){
    echo 'This is Building'
    sh "docker build -t ${projname} ${image}"        
    echo 'Build successfull'
}
