
node{

  stage('Checkout SCM'){ 
    git 'https://github.com/suneelpervaiz/spring-security-old'
  }
  stage('Compile-Package'){
    
    def mvnHome = tool name: 'Maven', type: 'maven'
    
    sh "${mvnHome}/bin/mvn package"
  }


}
