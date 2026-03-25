def call(String proname, String img){
  echo "build the docker"

  sh "docker build -t ${proname}:${img} ."

  echo "docker build complete"

}
