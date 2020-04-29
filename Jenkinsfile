node{
  stage('SCM checkout'){
    git'https://github.com/tusharindalkar/springbootmongo'
  }
  stage('Compile package'){
      def mvnHome=tool name: 'maven3' ,type:'maven' 
      sh '${mvnHome}/bin/mvn package'
  }
}
