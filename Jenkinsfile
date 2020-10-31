
node{

  stage('Checkout SCM'){ 
    git 'https://github.com/suneelpervaiz/spring-security-old'
  }
  stage('Compile-Package'){
    
    def mvnHome = tool name: 'Maven', type: 'maven'
    
    sh "${mvnHome}/bin/mvn package"
  }
  stage('Email notification'){
      mail bcc: '', body: 'Hello world', cc: 'suneel_fcstudent@yahoo.com', from: '', replyTo: '', subject: 'Jemkins email ', to: 'suneelpervaiz.uu@gmail.com'
  }
}
