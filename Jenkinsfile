
node{

  stage('Checkout SCM'){ 
    git 'https://github.com/suneelpervaiz/spring-security-old'
  }
  stage('Compile-Package'){
    
    def mvnHome = tool name: 'Maven', type: 'maven'
    
    sh "${mvnHome}/bin/mvn package"
  }
  stage('Email notification'){
mail bcc: '', body: 'Hello world', cc: '', from: '', replyTo: '', subject: 'Jenkin job email', to: 'suneelpervaiz.uu@gmail.com'  }
  
  
  
  post {
        always {
            echo 'I will always say Hello again!'
            
            emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}"
            
        }
    }
  
  
  
  
  
}
