def call(String Project, String ImageTag, String dockerhubuser){
  echo "push in pub"
  withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
