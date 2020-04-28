node{
  stages('SCM checkout'){
    git'https://github.com/tusharindalkar/springbootmongo'
  }
  stage('Compile package'){
  sh 'mvn package'
  }
}
