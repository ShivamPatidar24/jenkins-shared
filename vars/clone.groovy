def call(String url,String branch){
 echo "this is clone the code"
                git url: ${url} , branch : ${branch}
                echo "code cloning succesful"

}
